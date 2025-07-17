package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_LayoutModeModel;
import org.docx4j.dml.chart.STLayoutMode;

public class ST_LayoutModeConverter {
  private ST_LayoutModeConverter() {
  }

  public static ST_LayoutModeModel fromDocx4j(STLayoutMode value) {
    if (value == null) return null;
    if (value == STLayoutMode.EDGE) return ST_LayoutModeModel.EDGE;
    if (value == STLayoutMode.FACTOR) return ST_LayoutModeModel.FACTOR;
    return null;
  }

  public static STLayoutMode toDocx4j(ST_LayoutModeModel value) {
    return null;
  }
}
