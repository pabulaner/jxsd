package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.chart.CT_NumValModel;
import org.docx4j.dml.chart.CTNumVal;

public class CT_NumValConverter {
  private CT_NumValConverter() {
  }

  public static CT_NumValModel fromDocx4J(CTNumVal value) {
    if (value == null) return null;
    return new CT_NumValModel(ST_XstringConverter.fromDocx4J(value.getFormatCode()), UnsignedIntConverter.fromDocx4J(value.getIdx()), ST_XstringConverter.fromDocx4J(value.getV()));
  }

  public static CTNumVal toDocx4J(CT_NumValModel value) {
    return null;
  }
}
