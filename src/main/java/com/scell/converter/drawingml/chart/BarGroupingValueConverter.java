package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.BarGroupingValueModel;
import org.docx4j.dml.chart.STBarGrouping;

public class BarGroupingValueConverter {
  private BarGroupingValueConverter() {
  }

  public static BarGroupingValueModel fromDocx4J(STBarGrouping value) {
    if (value == null) return null;
    if (value == STBarGrouping.PERCENT_STACKED) return BarGroupingValueModel.PERCENT_STACKED;
    if (value == STBarGrouping.CLUSTERED) return BarGroupingValueModel.CLUSTERED;
    if (value == STBarGrouping.STANDARD) return BarGroupingValueModel.STANDARD;
    if (value == STBarGrouping.STACKED) return BarGroupingValueModel.STACKED;
    return null;
  }
}
