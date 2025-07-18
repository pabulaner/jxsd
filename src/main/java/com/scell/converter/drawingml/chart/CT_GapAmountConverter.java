package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_GapAmountModel;
import org.docx4j.dml.chart.CTGapAmount;

public class CT_GapAmountConverter {
  private CT_GapAmountConverter() {
  }

  public static CT_GapAmountModel fromDocx4J(CTGapAmount value) {
    if (value == null) return null;
    return new CT_GapAmountModel(ST_GapAmountConverter.fromDocx4J(value.getVal()));
  }

  public static CTGapAmount toDocx4J(CT_GapAmountModel value) {
    return null;
  }
}
