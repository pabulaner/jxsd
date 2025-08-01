package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LegendPosValueModel;
import org.docx4j.dml.chart.STLegendPos;

public class LegendPosValueConverter {
  private LegendPosValueConverter() {
  }

  public static LegendPosValueModel fromDocx4J(STLegendPos value) {
    if (value == null) return null;
    if (value == STLegendPos.B) return LegendPosValueModel.B;
    if (value == STLegendPos.TR) return LegendPosValueModel.TR;
    if (value == STLegendPos.L) return LegendPosValueModel.L;
    if (value == STLegendPos.R) return LegendPosValueModel.R;
    if (value == STLegendPos.T) return LegendPosValueModel.T;
    return null;
  }
}
