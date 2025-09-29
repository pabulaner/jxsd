package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.RadarStyleModel;
import org.docx4j.dml.chart.CTRadarStyle;

/**
 * This is a generated sequence class.
 */
public class RadarStyleConverter {
  private RadarStyleConverter() {
  }

  public static RadarStyleModel fromDocx4j(CTRadarStyle value) {
    if (value == null) return null;
    return new RadarStyleModel(RadarStyleValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTRadarStyle toDocx4j(RadarStyleModel value) {
    if (value == null) return null;
    CTRadarStyle result = new CTRadarStyle();
    result.setVal(RadarStyleValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
