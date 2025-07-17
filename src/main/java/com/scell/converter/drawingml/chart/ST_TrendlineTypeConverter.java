package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_TrendlineTypeModel;
import org.docx4j.dml.chart.STTrendlineType;

public class ST_TrendlineTypeConverter {
  private ST_TrendlineTypeConverter() {
  }

  public static ST_TrendlineTypeModel fromDocx4j(STTrendlineType value) {
    if (value == null) return null;
    if (value == STTrendlineType.EXP) return ST_TrendlineTypeModel.EXP;
    if (value == STTrendlineType.LINEAR) return ST_TrendlineTypeModel.LINEAR;
    if (value == STTrendlineType.LOG) return ST_TrendlineTypeModel.LOG;
    if (value == STTrendlineType.MOVING_AVG) return ST_TrendlineTypeModel.MOVING_AVG;
    if (value == STTrendlineType.POLY) return ST_TrendlineTypeModel.POLY;
    if (value == STTrendlineType.POWER) return ST_TrendlineTypeModel.POWER;
    return null;
  }

  public static STTrendlineType toDocx4j(ST_TrendlineTypeModel value) {
    return null;
  }
}
