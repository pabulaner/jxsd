package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_View3DModel;
import org.docx4j.dml.chart.CTView3D;

public class CT_View3DConverter {
  private CT_View3DConverter() {
  }

  public static CT_View3DModel fromDocx4j(CTView3D value) {
    if (value == null) return null;
    return new CT_View3DModel(CT_RotXConverter.fromDocx4j(value.getRotX()), CT_HPercentConverter.fromDocx4j(value.getHPercent()), CT_RotYConverter.fromDocx4j(value.getRotY()), CT_DepthPercentConverter.fromDocx4j(value.getDepthPercent()), CT_BooleanConverter.fromDocx4j(value.getRAngAx()), CT_PerspectiveConverter.fromDocx4j(value.getPerspective()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTView3D toDocx4j(CT_View3DModel value) {
    return null;
  }
}
