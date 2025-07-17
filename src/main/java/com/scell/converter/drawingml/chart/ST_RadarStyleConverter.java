package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_RadarStyleModel;
import org.docx4j.dml.chart.STRadarStyle;

public class ST_RadarStyleConverter {
  private ST_RadarStyleConverter() {
  }

  public static ST_RadarStyleModel fromDocx4j(STRadarStyle value) {
    if (value == null) return null;
    if (value == STRadarStyle.STANDARD) return ST_RadarStyleModel.STANDARD;
    if (value == STRadarStyle.MARKER) return ST_RadarStyleModel.MARKER;
    if (value == STRadarStyle.FILLED) return ST_RadarStyleModel.FILLED;
    return null;
  }

  public static STRadarStyle toDocx4j(ST_RadarStyleModel value) {
    return null;
  }
}
