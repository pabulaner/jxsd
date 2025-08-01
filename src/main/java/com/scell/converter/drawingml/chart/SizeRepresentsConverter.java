package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.SizeRepresentsModel;
import org.docx4j.dml.chart.CTSizeRepresents;

public class SizeRepresentsConverter {
  private SizeRepresentsConverter() {
  }

  public static SizeRepresentsModel fromDocx4J(CTSizeRepresents value) {
    if (value == null) return null;
    return new SizeRepresentsModel(SizeRepresentsValueConverter.fromDocx4J(value.getVal()));
  }
}
