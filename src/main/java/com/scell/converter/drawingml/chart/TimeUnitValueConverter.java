package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.TimeUnitValueModel;
import org.docx4j.dml.chart.STTimeUnit;

public class TimeUnitValueConverter {
  private TimeUnitValueConverter() {
  }

  public static TimeUnitValueModel fromDocx4J(STTimeUnit value) {
    if (value == null) return null;
    if (value == STTimeUnit.DAYS) return TimeUnitValueModel.DAYS;
    if (value == STTimeUnit.MONTHS) return TimeUnitValueModel.MONTHS;
    if (value == STTimeUnit.YEARS) return TimeUnitValueModel.YEARS;
    return null;
  }
}
