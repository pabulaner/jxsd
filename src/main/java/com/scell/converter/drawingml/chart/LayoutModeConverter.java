package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LayoutModeModel;
import org.docx4j.dml.chart.CTLayoutMode;

public class LayoutModeConverter {
  private LayoutModeConverter() {
  }

  public static LayoutModeModel fromDocx4J(CTLayoutMode value) {
    if (value == null) return null;
    return new LayoutModeModel(LayoutModeConverter.fromDocx4J(value.getVal()));
  }
}
