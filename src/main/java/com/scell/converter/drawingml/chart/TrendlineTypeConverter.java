package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.TrendlineTypeModel;
import org.docx4j.dml.chart.CTTrendlineType;

public class TrendlineTypeConverter {
  private TrendlineTypeConverter() {
  }

  public static TrendlineTypeModel fromDocx4J(CTTrendlineType value) {
    if (value == null) return null;
    return new TrendlineTypeModel(TrendlineTypeValueConverter.fromDocx4J(value.getVal()));
  }
}
