package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.TrendlineTypeValueModel;
import org.docx4j.dml.chart.STTrendlineType;

public class TrendlineTypeValueConverter {
  private TrendlineTypeValueConverter() {
  }

  public static TrendlineTypeValueModel fromDocx4J(STTrendlineType value) {
    if (value == null) return null;
    if (value == STTrendlineType.EXP) return TrendlineTypeValueModel.EXP;
    if (value == STTrendlineType.LINEAR) return TrendlineTypeValueModel.LINEAR;
    if (value == STTrendlineType.LOG) return TrendlineTypeValueModel.LOG;
    if (value == STTrendlineType.MOVING_AVG) return TrendlineTypeValueModel.MOVING_AVG;
    if (value == STTrendlineType.POLY) return TrendlineTypeValueModel.POLY;
    if (value == STTrendlineType.POWER) return TrendlineTypeValueModel.POWER;
    return null;
  }
}
