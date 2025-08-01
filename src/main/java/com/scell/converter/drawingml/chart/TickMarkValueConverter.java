package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.TickMarkValueModel;
import org.docx4j.dml.chart.STTickMark;

public class TickMarkValueConverter {
  private TickMarkValueConverter() {
  }

  public static TickMarkValueModel fromDocx4J(STTickMark value) {
    if (value == null) return null;
    if (value == STTickMark.CROSS) return TickMarkValueModel.CROSS;
    if (value == STTickMark.IN) return TickMarkValueModel.IN;
    if (value == STTickMark.NONE) return TickMarkValueModel.NONE;
    if (value == STTickMark.OUT) return TickMarkValueModel.OUT;
    return null;
  }
}
