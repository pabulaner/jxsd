package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.OfPieTypeValueModel;
import org.docx4j.dml.chart.STOfPieType;

public class OfPieTypeValueConverter {
  private OfPieTypeValueConverter() {
  }

  public static OfPieTypeValueModel fromDocx4J(STOfPieType value) {
    if (value == null) return null;
    if (value == STOfPieType.PIE) return OfPieTypeValueModel.PIE;
    if (value == STOfPieType.BAR) return OfPieTypeValueModel.BAR;
    return null;
  }
}
