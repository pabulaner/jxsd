package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.AxPosModel;
import org.docx4j.dml.chart.CTAxPos;

public class AxPosConverter {
  private AxPosConverter() {
  }

  public static AxPosModel fromDocx4J(CTAxPos value) {
    if (value == null) return null;
    return new AxPosModel(AxPosConverter.fromDocx4J(value.getVal()));
  }
}
