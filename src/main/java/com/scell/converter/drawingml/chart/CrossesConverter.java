package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CrossesModel;
import org.docx4j.dml.chart.CTCrosses;

public class CrossesConverter {
  private CrossesConverter() {
  }

  public static CrossesModel fromDocx4J(CTCrosses value) {
    if (value == null) return null;
    return new CrossesModel(CrossesConverter.fromDocx4J(value.getVal()));
  }
}
