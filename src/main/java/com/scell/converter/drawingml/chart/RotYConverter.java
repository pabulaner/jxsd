package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.RotYModel;
import org.docx4j.dml.chart.CTRotY;

public class RotYConverter {
  private RotYConverter() {
  }

  public static RotYModel fromDocx4J(CTRotY value) {
    if (value == null) return null;
    return new RotYModel(RotYConverter.fromDocx4J(value.getVal()));
  }
}
