package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ManualLayoutModel;
import org.docx4j.dml.chart.CTManualLayout;

public class CT_ManualLayoutConverter {
  private CT_ManualLayoutConverter() {
  }

  public static CT_ManualLayoutModel fromDocx4j(CTManualLayout value) {
    if (value == null) return null;
    return new CT_ManualLayoutModel(CT_LayoutTargetConverter.fromDocx4j(value.getLayoutTarget()), CT_LayoutModeConverter.fromDocx4j(value.getXMode()), CT_LayoutModeConverter.fromDocx4j(value.getYMode()), CT_LayoutModeConverter.fromDocx4j(value.getWMode()), CT_LayoutModeConverter.fromDocx4j(value.getHMode()), CT_DoubleConverter.fromDocx4j(value.getX()), CT_DoubleConverter.fromDocx4j(value.getY()), CT_DoubleConverter.fromDocx4j(value.getW()), CT_DoubleConverter.fromDocx4j(value.getH()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTManualLayout toDocx4j(CT_ManualLayoutModel value) {
    return null;
  }
}
