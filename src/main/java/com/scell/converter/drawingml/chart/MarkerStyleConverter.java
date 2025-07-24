package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.MarkerStyleModel;
import org.docx4j.dml.chart.CTMarkerStyle;

public class MarkerStyleConverter {
  private MarkerStyleConverter() {
  }

  public static MarkerStyleModel fromDocx4J(CTMarkerStyle value) {
    if (value == null) return null;
    return new MarkerStyleModel(MarkerStyleConverter.fromDocx4J(value.getVal()));
  }
}
