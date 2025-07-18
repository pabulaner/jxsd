package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ScalingModel;
import org.docx4j.dml.chart.CTScaling;

public class CT_ScalingConverter {
  private CT_ScalingConverter() {
  }

  public static CT_ScalingModel fromDocx4J(CTScaling value) {
    if (value == null) return null;
    return new CT_ScalingModel(CT_LogBaseConverter.fromDocx4J(value.getLogBase()), CT_OrientationConverter.fromDocx4J(value.getOrientation()), CT_DoubleConverter.fromDocx4J(value.getMax()), CT_DoubleConverter.fromDocx4J(value.getMin()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTScaling toDocx4J(CT_ScalingModel value) {
    return null;
  }
}
