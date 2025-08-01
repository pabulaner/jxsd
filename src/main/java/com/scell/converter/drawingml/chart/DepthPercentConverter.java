package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.DepthPercentModel;
import org.docx4j.dml.chart.CTDepthPercent;

public class DepthPercentConverter {
  private DepthPercentConverter() {
  }

  public static DepthPercentModel fromDocx4J(CTDepthPercent value) {
    if (value == null) return null;
    return new DepthPercentModel(DepthPercentValueConverter.fromDocx4J(value.getVal()));
  }
}
