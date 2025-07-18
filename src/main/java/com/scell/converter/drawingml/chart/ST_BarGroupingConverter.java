package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_BarGroupingModel;
import org.docx4j.dml.chart.STBarGrouping;

public class ST_BarGroupingConverter {
  private ST_BarGroupingConverter() {
  }

  public static ST_BarGroupingModel fromDocx4J(STBarGrouping value) {
    if (value == null) return null;
    if (value == STBarGrouping.PERCENT_STACKED) return ST_BarGroupingModel.PERCENT_STACKED;
    if (value == STBarGrouping.CLUSTERED) return ST_BarGroupingModel.CLUSTERED;
    if (value == STBarGrouping.STANDARD) return ST_BarGroupingModel.STANDARD;
    if (value == STBarGrouping.STACKED) return ST_BarGroupingModel.STACKED;
    return null;
  }

  public static STBarGrouping toDocx4J(ST_BarGroupingModel value) {
    return null;
  }
}
