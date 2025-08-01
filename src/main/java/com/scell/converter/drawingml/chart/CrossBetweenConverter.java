package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CrossBetweenModel;
import org.docx4j.dml.chart.CTCrossBetween;

public class CrossBetweenConverter {
  private CrossBetweenConverter() {
  }

  public static CrossBetweenModel fromDocx4J(CTCrossBetween value) {
    if (value == null) return null;
    return new CrossBetweenModel(CrossBetweenValueConverter.fromDocx4J(value.getVal()));
  }
}
