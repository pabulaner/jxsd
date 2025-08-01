package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.RotXModel;
import org.docx4j.dml.chart.CTRotX;

public class RotXConverter {
  private RotXConverter() {
  }

  public static RotXModel fromDocx4J(CTRotX value) {
    if (value == null) return null;
    return new RotXModel(RotXValueConverter.fromDocx4J(value.getVal()));
  }
}
