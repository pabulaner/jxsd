package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ScalingModel;
import org.docx4j.dml.chart.CTScaling;

public class CT_ScalingConverter {
  private CT_ScalingConverter() {
  }

  public static CT_ScalingModel fromDocx4j(CTScaling value) {
    if (value == null) return null;
    return new CT_ScalingModel(CT_LogBaseConverter.fromDocx4j(value.getLogBase()), CT_OrientationConverter.fromDocx4j(value.getOrientation()), CT_DoubleConverter.fromDocx4j(value.getMax()), CT_DoubleConverter.fromDocx4j(value.getMin()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTScaling toDocx4j(CT_ScalingModel value) {
    return null;
  }
}
