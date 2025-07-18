package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_TrendlineTypeModel;
import org.docx4j.dml.chart.CTTrendlineType;

public class CT_TrendlineTypeConverter {
  private CT_TrendlineTypeConverter() {
  }

  public static CT_TrendlineTypeModel fromDocx4J(CTTrendlineType value) {
    if (value == null) return null;
    return new CT_TrendlineTypeModel(ST_TrendlineTypeConverter.fromDocx4J(value.getVal()));
  }

  public static CTTrendlineType toDocx4J(CT_TrendlineTypeModel value) {
    return null;
  }
}
