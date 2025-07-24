package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.GroupingModel;
import org.docx4j.dml.chart.CTGrouping;

public class GroupingConverter {
  private GroupingConverter() {
  }

  public static GroupingModel fromDocx4J(CTGrouping value) {
    if (value == null) return null;
    return new GroupingModel(GroupingConverter.fromDocx4J(value.getVal()));
  }
}
