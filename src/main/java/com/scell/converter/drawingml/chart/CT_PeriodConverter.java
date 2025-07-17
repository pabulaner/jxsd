package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PeriodModel;
import org.docx4j.dml.chart.CTPeriod;

public class CT_PeriodConverter {
  private CT_PeriodConverter() {
  }

  public static CT_PeriodModel fromDocx4j(CTPeriod value) {
    if (value == null) return null;
    return new CT_PeriodModel(ST_PeriodConverter.fromDocx4j(value.getVal()));
  }

  public static CTPeriod toDocx4j(CT_PeriodModel value) {
    return null;
  }
}
