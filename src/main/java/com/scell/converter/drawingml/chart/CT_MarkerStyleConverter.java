package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_MarkerStyleModel;
import org.docx4j.dml.chart.CTMarkerStyle;

public class CT_MarkerStyleConverter {
  private CT_MarkerStyleConverter() {
  }

  public static CT_MarkerStyleModel fromDocx4J(CTMarkerStyle value) {
    if (value == null) return null;
    return new CT_MarkerStyleModel(ST_MarkerStyleConverter.fromDocx4J(value.getVal()));
  }

  public static CTMarkerStyle toDocx4J(CT_MarkerStyleModel value) {
    return null;
  }
}
