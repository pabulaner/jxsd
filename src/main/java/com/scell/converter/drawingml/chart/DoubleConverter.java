package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.DoubleValueConverter;
import com.scell.model.drawingml.chart.DoubleModel;
import org.docx4j.dml.chart.CTDouble;

public class DoubleConverter {
  private DoubleConverter() {
  }

  public static DoubleModel fromDocx4J(CTDouble value) {
    if (value == null) return null;
    return new DoubleModel(DoubleValueConverter.fromDocx4J(value.getVal()));
  }
}
