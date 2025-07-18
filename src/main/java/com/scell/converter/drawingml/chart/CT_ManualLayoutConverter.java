package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ManualLayoutModel;
import org.docx4j.dml.chart.CTManualLayout;

public class CT_ManualLayoutConverter {
  private CT_ManualLayoutConverter() {
  }

  public static CT_ManualLayoutModel fromDocx4J(CTManualLayout value) {
    if (value == null) return null;
    return new CT_ManualLayoutModel(CT_LayoutTargetConverter.fromDocx4J(value.getLayoutTarget()), CT_LayoutModeConverter.fromDocx4J(value.getXMode()), CT_LayoutModeConverter.fromDocx4J(value.getYMode()), CT_LayoutModeConverter.fromDocx4J(value.getWMode()), CT_LayoutModeConverter.fromDocx4J(value.getHMode()), CT_DoubleConverter.fromDocx4J(value.getX()), CT_DoubleConverter.fromDocx4J(value.getY()), CT_DoubleConverter.fromDocx4J(value.getW()), CT_DoubleConverter.fromDocx4J(value.getH()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTManualLayout toDocx4J(CT_ManualLayoutModel value) {
    return null;
  }
}
