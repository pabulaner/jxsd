package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.chart.CT_NumValModel;
import org.docx4j.dml.chart.CTNumVal;

public class CT_NumValConverter {
  private CT_NumValConverter() {
  }

  public static CT_NumValModel fromDocx4j(CTNumVal value) {
    if (value == null) return null;
    return new CT_NumValModel(ST_XstringConverter.fromDocx4j(value.getFormatCode()), UnsignedIntConverter.fromDocx4j(value.getIdx()), ST_XstringConverter.fromDocx4j(value.getV()));
  }

  public static CTNumVal toDocx4j(CT_NumValModel value) {
    return null;
  }
}
