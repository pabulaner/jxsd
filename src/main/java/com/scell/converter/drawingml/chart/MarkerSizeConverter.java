package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.MarkerSizeModel;
import org.docx4j.dml.chart.CTMarkerSize;

public class MarkerSizeConverter {
  private MarkerSizeConverter() {
  }

  public static MarkerSizeModel fromDocx4J(CTMarkerSize value) {
    if (value == null) return null;
    return new MarkerSizeModel(MarkerSizeConverter.fromDocx4J(value.getVal()));
  }
}
