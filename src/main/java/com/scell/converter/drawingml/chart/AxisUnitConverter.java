package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.AxisUnitModel;
import org.docx4j.dml.chart.CTAxisUnit;

public class AxisUnitConverter {
  private AxisUnitConverter() {
  }

  public static AxisUnitModel fromDocx4J(CTAxisUnit value) {
    if (value == null) return null;
    return new AxisUnitModel(AxisUnitConverter.fromDocx4J(value.getVal()));
  }
}
