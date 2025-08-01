package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.UnsignedIntValueConverter;
import com.scell.model.drawingml.chart.StrValModel;
import org.docx4j.dml.chart.CTStrVal;

public class StrValConverter {
  private StrValConverter() {
  }

  public static StrValModel fromDocx4J(CTStrVal value) {
    if (value == null) return null;
    return new StrValModel(UnsignedIntValueConverter.fromDocx4J(value.getIdx()), XstringValueConverter.fromDocx4J(value.getV()));
  }
}
