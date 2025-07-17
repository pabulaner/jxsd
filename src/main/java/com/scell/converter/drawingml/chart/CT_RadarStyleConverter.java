package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_RadarStyleModel;
import org.docx4j.dml.chart.CTRadarStyle;

public class CT_RadarStyleConverter {
  private CT_RadarStyleConverter() {
  }

  public static CT_RadarStyleModel fromDocx4j(CTRadarStyle value) {
    if (value == null) return null;
    return new CT_RadarStyleModel(ST_RadarStyleConverter.fromDocx4j(value.getVal()));
  }

  public static CTRadarStyle toDocx4j(CT_RadarStyleModel value) {
    return null;
  }
}
