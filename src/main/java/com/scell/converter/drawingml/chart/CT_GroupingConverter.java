package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_GroupingModel;
import org.docx4j.dml.chart.CTGrouping;

public class CT_GroupingConverter {
  private CT_GroupingConverter() {
  }

  public static CT_GroupingModel fromDocx4J(CTGrouping value) {
    if (value == null) return null;
    return new CT_GroupingModel(ST_GroupingConverter.fromDocx4J(value.getVal()));
  }

  public static CTGrouping toDocx4J(CT_GroupingModel value) {
    return null;
  }
}
