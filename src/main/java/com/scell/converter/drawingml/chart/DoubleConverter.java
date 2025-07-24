package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.DoubleModel;
import org.docx4j.dml.chart.CTDouble;

public class DoubleConverter {
  private DoubleConverter() {
  }

  public static DoubleModel fromDocx4J(CTDouble value) {
    if (value == null) return null;
    return new DoubleModel(com.scell.converter.XMLSchema.DoubleConverter.fromDocx4J(value.getVal()));
  }
}
