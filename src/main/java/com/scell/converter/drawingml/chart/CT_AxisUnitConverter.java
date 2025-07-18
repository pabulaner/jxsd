package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxisUnitModel;
import org.docx4j.dml.chart.CTAxisUnit;

public class CT_AxisUnitConverter {
  private CT_AxisUnitConverter() {
  }

  public static CT_AxisUnitModel fromDocx4J(CTAxisUnit value) {
    if (value == null) return null;
    return new CT_AxisUnitModel(ST_AxisUnitConverter.fromDocx4J(value.getVal()));
  }

  public static CTAxisUnit toDocx4J(CT_AxisUnitModel value) {
    return null;
  }
}
