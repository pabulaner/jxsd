package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_TimeUnitModel;
import org.docx4j.dml.chart.CTTimeUnit;

public class CT_TimeUnitConverter {
  private CT_TimeUnitConverter() {
  }

  public static CT_TimeUnitModel fromDocx4j(CTTimeUnit value) {
    if (value == null) return null;
    return new CT_TimeUnitModel(ST_TimeUnitConverter.fromDocx4j(value.getVal()));
  }

  public static CTTimeUnit toDocx4j(CT_TimeUnitModel value) {
    return null;
  }
}
