package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_LegendPosModel;
import org.docx4j.dml.chart.STLegendPos;

public class ST_LegendPosConverter {
  private ST_LegendPosConverter() {
  }

  public static ST_LegendPosModel fromDocx4j(STLegendPos value) {
    if (value == null) return null;
    if (value == STLegendPos.B) return ST_LegendPosModel.B;
    if (value == STLegendPos.TR) return ST_LegendPosModel.TR;
    if (value == STLegendPos.L) return ST_LegendPosModel.L;
    if (value == STLegendPos.R) return ST_LegendPosModel.R;
    if (value == STLegendPos.T) return ST_LegendPosModel.T;
    return null;
  }

  public static STLegendPos toDocx4j(ST_LegendPosModel value) {
    return null;
  }
}
