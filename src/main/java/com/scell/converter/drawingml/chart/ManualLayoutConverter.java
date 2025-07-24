package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ManualLayoutModel;
import org.docx4j.dml.chart.CTManualLayout;

public class ManualLayoutConverter {
  private ManualLayoutConverter() {
  }

  public static ManualLayoutModel fromDocx4J(CTManualLayout value) {
    if (value == null) return null;
    return new ManualLayoutModel(LayoutTargetConverter.fromDocx4J(value.getLayoutTarget()), LayoutModeConverter.fromDocx4J(value.getXMode()), LayoutModeConverter.fromDocx4J(value.getYMode()), LayoutModeConverter.fromDocx4J(value.getWMode()), LayoutModeConverter.fromDocx4J(value.getHMode()), DoubleConverter.fromDocx4J(value.getX()), DoubleConverter.fromDocx4J(value.getY()), DoubleConverter.fromDocx4J(value.getW()), DoubleConverter.fromDocx4J(value.getH()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
