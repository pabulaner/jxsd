package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_TimeUnitModel;
import org.docx4j.dml.chart.STTimeUnit;

public class ST_TimeUnitConverter {
  private ST_TimeUnitConverter() {
  }

  public static ST_TimeUnitModel fromDocx4J(STTimeUnit value) {
    if (value == null) return null;
    if (value == STTimeUnit.DAYS) return ST_TimeUnitModel.DAYS;
    if (value == STTimeUnit.MONTHS) return ST_TimeUnitModel.MONTHS;
    if (value == STTimeUnit.YEARS) return ST_TimeUnitModel.YEARS;
    return null;
  }

  public static STTimeUnit toDocx4J(ST_TimeUnitModel value) {
    return null;
  }
}
