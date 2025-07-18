package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_TickMarkModel;
import org.docx4j.dml.chart.STTickMark;

public class ST_TickMarkConverter {
  private ST_TickMarkConverter() {
  }

  public static ST_TickMarkModel fromDocx4J(STTickMark value) {
    if (value == null) return null;
    if (value == STTickMark.CROSS) return ST_TickMarkModel.CROSS;
    if (value == STTickMark.IN) return ST_TickMarkModel.IN;
    if (value == STTickMark.NONE) return ST_TickMarkModel.NONE;
    if (value == STTickMark.OUT) return ST_TickMarkModel.OUT;
    return null;
  }

  public static STTickMark toDocx4J(ST_TickMarkModel value) {
    return null;
  }
}
