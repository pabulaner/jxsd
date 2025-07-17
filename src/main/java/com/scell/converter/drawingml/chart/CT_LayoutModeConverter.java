package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LayoutModeModel;
import org.docx4j.dml.chart.CTLayoutMode;

public class CT_LayoutModeConverter {
  private CT_LayoutModeConverter() {
  }

  public static CT_LayoutModeModel fromDocx4j(CTLayoutMode value) {
    if (value == null) return null;
    return new CT_LayoutModeModel(ST_LayoutModeConverter.fromDocx4j(value.getVal()));
  }

  public static CTLayoutMode toDocx4j(CT_LayoutModeModel value) {
    return null;
  }
}
