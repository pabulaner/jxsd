package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_View3DModel;
import org.docx4j.dml.chart.CTView3D;

public class CT_View3DConverter {
  private CT_View3DConverter() {
  }

  public static CT_View3DModel fromDocx4J(CTView3D value) {
    if (value == null) return null;
    return new CT_View3DModel(CT_RotXConverter.fromDocx4J(value.getRotX()), CT_HPercentConverter.fromDocx4J(value.getHPercent()), CT_RotYConverter.fromDocx4J(value.getRotY()), CT_DepthPercentConverter.fromDocx4J(value.getDepthPercent()), CT_BooleanConverter.fromDocx4J(value.getRAngAx()), CT_PerspectiveConverter.fromDocx4J(value.getPerspective()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTView3D toDocx4J(CT_View3DModel value) {
    return null;
  }
}
