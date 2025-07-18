package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_TickLblPosModel;
import org.docx4j.dml.chart.CTTickLblPos;

public class CT_TickLblPosConverter {
  private CT_TickLblPosConverter() {
  }

  public static CT_TickLblPosModel fromDocx4J(CTTickLblPos value) {
    if (value == null) return null;
    return new CT_TickLblPosModel(ST_TickLblPosConverter.fromDocx4J(value.getVal()));
  }

  public static CTTickLblPos toDocx4J(CT_TickLblPosModel value) {
    return null;
  }
}
