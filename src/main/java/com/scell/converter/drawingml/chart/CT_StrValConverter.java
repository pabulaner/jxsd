package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.chart.CT_StrValModel;
import org.docx4j.dml.chart.CTStrVal;

public class CT_StrValConverter {
  private CT_StrValConverter() {
  }

  public static CT_StrValModel fromDocx4j(CTStrVal value) {
    if (value == null) return null;
    return new CT_StrValModel(UnsignedIntConverter.fromDocx4j(value.getIdx()), ST_XstringConverter.fromDocx4j(value.getV()));
  }

  public static CTStrVal toDocx4j(CT_StrValModel value) {
    return null;
  }
}
