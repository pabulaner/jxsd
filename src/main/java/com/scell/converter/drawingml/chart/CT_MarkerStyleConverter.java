package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_MarkerStyleModel;
import org.docx4j.dml.chart.CTMarkerStyle;

public class CT_MarkerStyleConverter {
  private CT_MarkerStyleConverter() {
  }

  public static CT_MarkerStyleModel fromDocx4j(CTMarkerStyle value) {
    if (value == null) return null;
    return new CT_MarkerStyleModel(ST_MarkerStyleConverter.fromDocx4j(value.getVal()));
  }

  public static CTMarkerStyle toDocx4j(CT_MarkerStyleModel value) {
    return null;
  }
}
