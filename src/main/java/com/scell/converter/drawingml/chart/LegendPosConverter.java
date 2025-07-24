package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LegendPosModel;
import org.docx4j.dml.chart.CTLegendPos;

public class LegendPosConverter {
  private LegendPosConverter() {
  }

  public static LegendPosModel fromDocx4J(CTLegendPos value) {
    if (value == null) return null;
    return new LegendPosModel(LegendPosConverter.fromDocx4J(value.getVal()));
  }
}
