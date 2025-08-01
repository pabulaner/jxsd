package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LayoutModeValueModel;
import org.docx4j.dml.chart.STLayoutMode;

public class LayoutModeValueConverter {
  private LayoutModeValueConverter() {
  }

  public static LayoutModeValueModel fromDocx4J(STLayoutMode value) {
    if (value == null) return null;
    if (value == STLayoutMode.EDGE) return LayoutModeValueModel.EDGE;
    if (value == STLayoutMode.FACTOR) return LayoutModeValueModel.FACTOR;
    return null;
  }
}
