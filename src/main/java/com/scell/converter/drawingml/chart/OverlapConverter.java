package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.OverlapModel;
import org.docx4j.dml.chart.CTOverlap;

public class OverlapConverter {
  private OverlapConverter() {
  }

  public static OverlapModel fromDocx4J(CTOverlap value) {
    if (value == null) return null;
    return new OverlapModel(OverlapValueConverter.fromDocx4J(value.getVal()));
  }
}
