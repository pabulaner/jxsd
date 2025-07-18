package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_TickLblPosModel;
import org.docx4j.dml.chart.STTickLblPos;

public class ST_TickLblPosConverter {
  private ST_TickLblPosConverter() {
  }

  public static ST_TickLblPosModel fromDocx4J(STTickLblPos value) {
    if (value == null) return null;
    if (value == STTickLblPos.HIGH) return ST_TickLblPosModel.HIGH;
    if (value == STTickLblPos.LOW) return ST_TickLblPosModel.LOW;
    if (value == STTickLblPos.NEXT_TO) return ST_TickLblPosModel.NEXT_TO;
    if (value == STTickLblPos.NONE) return ST_TickLblPosModel.NONE;
    return null;
  }

  public static STTickLblPos toDocx4J(ST_TickLblPosModel value) {
    return null;
  }
}
