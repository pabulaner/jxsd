package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ScatterStyleModel;
import org.docx4j.dml.chart.CTScatterStyle;

public class ScatterStyleConverter {
  private ScatterStyleConverter() {
  }

  public static ScatterStyleModel fromDocx4J(CTScatterStyle value) {
    if (value == null) return null;
    return new ScatterStyleModel(ScatterStyleConverter.fromDocx4J(value.getVal()));
  }
}
