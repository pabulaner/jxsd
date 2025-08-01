package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.GroupingValueModel;
import org.docx4j.dml.chart.STGrouping;

public class GroupingValueConverter {
  private GroupingValueConverter() {
  }

  public static GroupingValueModel fromDocx4J(STGrouping value) {
    if (value == null) return null;
    if (value == STGrouping.PERCENT_STACKED) return GroupingValueModel.PERCENT_STACKED;
    if (value == STGrouping.STANDARD) return GroupingValueModel.STANDARD;
    if (value == STGrouping.STACKED) return GroupingValueModel.STACKED;
    return null;
  }
}
