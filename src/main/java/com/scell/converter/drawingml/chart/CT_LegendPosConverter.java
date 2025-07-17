package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LegendPosModel;
import org.docx4j.dml.chart.CTLegendPos;

public class CT_LegendPosConverter {
  private CT_LegendPosConverter() {
  }

  public static CT_LegendPosModel fromDocx4j(CTLegendPos value) {
    if (value == null) return null;
    return new CT_LegendPosModel(ST_LegendPosConverter.fromDocx4j(value.getVal()));
  }

  public static CTLegendPos toDocx4j(CT_LegendPosModel value) {
    return null;
  }
}
