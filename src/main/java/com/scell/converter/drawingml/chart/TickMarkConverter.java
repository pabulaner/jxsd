package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.TickMarkModel;
import org.docx4j.dml.chart.CTTickMark;

public class TickMarkConverter {
  private TickMarkConverter() {
  }

  public static TickMarkModel fromDocx4J(CTTickMark value) {
    if (value == null) return null;
    return new TickMarkModel(TickMarkConverter.fromDocx4J(value.getVal()));
  }
}
