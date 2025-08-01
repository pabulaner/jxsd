package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LogBaseModel;
import org.docx4j.dml.chart.CTLogBase;

public class LogBaseConverter {
  private LogBaseConverter() {
  }

  public static LogBaseModel fromDocx4J(CTLogBase value) {
    if (value == null) return null;
    return new LogBaseModel(LogBaseValueConverter.fromDocx4J(value.getVal()));
  }
}
