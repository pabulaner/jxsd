package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.UnsignedIntConverter;
import com.scell.model.drawingml.chart.CT_StrValModel;
import org.docx4j.dml.chart.CTStrVal;

public class CT_StrValConverter {
  private CT_StrValConverter() {
  }

  public static CT_StrValModel fromDocx4J(CTStrVal value) {
    if (value == null) return null;
    return new CT_StrValModel(UnsignedIntConverter.fromDocx4J(value.getIdx()), ST_XstringConverter.fromDocx4J(value.getV()));
  }

  public static CTStrVal toDocx4J(CT_StrValModel value) {
    return null;
  }
}
