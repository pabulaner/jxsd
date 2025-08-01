package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.TickLblPosModel;
import org.docx4j.dml.chart.CTTickLblPos;

public class TickLblPosConverter {
  private TickLblPosConverter() {
  }

  public static TickLblPosModel fromDocx4J(CTTickLblPos value) {
    if (value == null) return null;
    return new TickLblPosModel(TickLblPosValueConverter.fromDocx4J(value.getVal()));
  }
}
