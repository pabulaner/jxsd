package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ScalingModel;
import org.docx4j.dml.chart.CTScaling;

public class ScalingConverter {
  private ScalingConverter() {
  }

  public static ScalingModel fromDocx4J(CTScaling value) {
    if (value == null) return null;
    return new ScalingModel(LogBaseConverter.fromDocx4J(value.getLogBase()), OrientationConverter.fromDocx4J(value.getOrientation()), DoubleConverter.fromDocx4J(value.getMax()), DoubleConverter.fromDocx4J(value.getMin()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
