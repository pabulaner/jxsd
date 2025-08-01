package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PeriodModel;
import org.docx4j.dml.chart.CTPeriod;

public class PeriodConverter {
  private PeriodConverter() {
  }

  public static PeriodModel fromDocx4J(CTPeriod value) {
    if (value == null) return null;
    return new PeriodModel(PeriodValueConverter.fromDocx4J(value.getVal()));
  }
}
