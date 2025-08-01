package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.RadarStyleValueModel;
import org.docx4j.dml.chart.STRadarStyle;

public class RadarStyleValueConverter {
  private RadarStyleValueConverter() {
  }

  public static RadarStyleValueModel fromDocx4J(STRadarStyle value) {
    if (value == null) return null;
    if (value == STRadarStyle.STANDARD) return RadarStyleValueModel.STANDARD;
    if (value == STRadarStyle.MARKER) return RadarStyleValueModel.MARKER;
    if (value == STRadarStyle.FILLED) return RadarStyleValueModel.FILLED;
    return null;
  }
}
