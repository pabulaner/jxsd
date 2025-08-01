package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.TimeUnitModel;
import org.docx4j.dml.chart.CTTimeUnit;

public class TimeUnitConverter {
  private TimeUnitConverter() {
  }

  public static TimeUnitModel fromDocx4J(CTTimeUnit value) {
    if (value == null) return null;
    return new TimeUnitModel(TimeUnitValueConverter.fromDocx4J(value.getVal()));
  }
}
