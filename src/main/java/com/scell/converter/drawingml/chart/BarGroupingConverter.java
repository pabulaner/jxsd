package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.BarGroupingModel;
import org.docx4j.dml.chart.CTBarGrouping;

public class BarGroupingConverter {
  private BarGroupingConverter() {
  }

  public static BarGroupingModel fromDocx4J(CTBarGrouping value) {
    if (value == null) return null;
    return new BarGroupingModel(BarGroupingConverter.fromDocx4J(value.getVal()));
  }
}
