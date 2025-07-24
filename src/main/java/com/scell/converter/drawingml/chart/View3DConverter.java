package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.View3DModel;
import org.docx4j.dml.chart.CTView3D;

public class View3DConverter {
  private View3DConverter() {
  }

  public static View3DModel fromDocx4J(CTView3D value) {
    if (value == null) return null;
    return new View3DModel(RotXConverter.fromDocx4J(value.getRotX()), HPercentConverter.fromDocx4J(value.getHPercent()), RotYConverter.fromDocx4J(value.getRotY()), DepthPercentConverter.fromDocx4J(value.getDepthPercent()), BooleanConverter.fromDocx4J(value.getRAngAx()), PerspectiveConverter.fromDocx4J(value.getPerspective()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
