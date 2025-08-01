package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.TickLblPosValueModel;
import org.docx4j.dml.chart.STTickLblPos;

public class TickLblPosValueConverter {
  private TickLblPosValueConverter() {
  }

  public static TickLblPosValueModel fromDocx4J(STTickLblPos value) {
    if (value == null) return null;
    if (value == STTickLblPos.HIGH) return TickLblPosValueModel.HIGH;
    if (value == STTickLblPos.LOW) return TickLblPosValueModel.LOW;
    if (value == STTickLblPos.NEXT_TO) return TickLblPosValueModel.NEXT_TO;
    if (value == STTickLblPos.NONE) return TickLblPosValueModel.NONE;
    return null;
  }
}
