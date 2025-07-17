package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_GroupingModel;
import org.docx4j.dml.chart.STGrouping;

public class ST_GroupingConverter {
  private ST_GroupingConverter() {
  }

  public static ST_GroupingModel fromDocx4j(STGrouping value) {
    if (value == null) return null;
    if (value == STGrouping.PERCENT_STACKED) return ST_GroupingModel.PERCENT_STACKED;
    if (value == STGrouping.STANDARD) return ST_GroupingModel.STANDARD;
    if (value == STGrouping.STACKED) return ST_GroupingModel.STACKED;
    return null;
  }

  public static STGrouping toDocx4j(ST_GroupingModel value) {
    return null;
  }
}
