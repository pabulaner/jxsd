package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.GapAmountModel;
import org.docx4j.dml.chart.CTGapAmount;

public class GapAmountConverter {
  private GapAmountConverter() {
  }

  public static GapAmountModel fromDocx4J(CTGapAmount value) {
    if (value == null) return null;
    return new GapAmountModel(GapAmountConverter.fromDocx4J(value.getVal()));
  }
}
