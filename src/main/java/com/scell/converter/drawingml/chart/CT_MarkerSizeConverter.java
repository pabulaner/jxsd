package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_MarkerSizeModel;
import org.docx4j.dml.chart.CTMarkerSize;

public class CT_MarkerSizeConverter {
  private CT_MarkerSizeConverter() {
  }

  public static CT_MarkerSizeModel fromDocx4J(CTMarkerSize value) {
    if (value == null) return null;
    return new CT_MarkerSizeModel(ST_MarkerSizeConverter.fromDocx4J(value.getVal()));
  }

  public static CTMarkerSize toDocx4J(CT_MarkerSizeModel value) {
    return null;
  }
}
