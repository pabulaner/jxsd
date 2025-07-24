package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LayoutTargetModel;
import org.docx4j.dml.chart.CTLayoutTarget;

public class LayoutTargetConverter {
  private LayoutTargetConverter() {
  }

  public static LayoutTargetModel fromDocx4J(CTLayoutTarget value) {
    if (value == null) return null;
    return new LayoutTargetModel(LayoutTargetConverter.fromDocx4J(value.getVal()));
  }
}
