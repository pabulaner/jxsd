package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BarGroupingModel;
import org.docx4j.dml.chart.CTBarGrouping;

public class CT_BarGroupingConverter {
  private CT_BarGroupingConverter() {
  }

  public static CT_BarGroupingModel fromDocx4j(CTBarGrouping value) {
    if (value == null) return null;
    return new CT_BarGroupingModel(ST_BarGroupingConverter.fromDocx4j(value.getVal()));
  }

  public static CTBarGrouping toDocx4j(CT_BarGroupingModel value) {
    return null;
  }
}
