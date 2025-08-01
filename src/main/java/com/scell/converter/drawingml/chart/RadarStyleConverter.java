package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.RadarStyleModel;
import org.docx4j.dml.chart.CTRadarStyle;

public class RadarStyleConverter {
  private RadarStyleConverter() {
  }

  public static RadarStyleModel fromDocx4J(CTRadarStyle value) {
    if (value == null) return null;
    return new RadarStyleModel(RadarStyleValueConverter.fromDocx4J(value.getVal()));
  }
}
