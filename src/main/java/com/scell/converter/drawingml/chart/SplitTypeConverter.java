package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.SplitTypeModel;
import org.docx4j.dml.chart.CTSplitType;

public class SplitTypeConverter {
  private SplitTypeConverter() {
  }

  public static SplitTypeModel fromDocx4J(CTSplitType value) {
    if (value == null) return null;
    return new SplitTypeModel(SplitTypeConverter.fromDocx4J(value.getVal()));
  }
}
