package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_TickMarkModel;
import org.docx4j.dml.chart.CTTickMark;

public class CT_TickMarkConverter {
  private CT_TickMarkConverter() {
  }

  public static CT_TickMarkModel fromDocx4J(CTTickMark value) {
    if (value == null) return null;
    return new CT_TickMarkModel(ST_TickMarkConverter.fromDocx4J(value.getVal()));
  }

  public static CTTickMark toDocx4J(CT_TickMarkModel value) {
    return null;
  }
}
