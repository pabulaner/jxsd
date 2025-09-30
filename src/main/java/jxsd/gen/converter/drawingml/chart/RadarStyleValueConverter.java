package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.RadarStyleValueModel;
import org.docx4j.dml.chart.STRadarStyle;

/**
 * This is a generated enum class.
 */
public class RadarStyleValueConverter {
  private RadarStyleValueConverter() {
  }

  public static RadarStyleValueModel fromDocx4j(STRadarStyle value) {
    if (value == null) return null;
    if (value == STRadarStyle.STANDARD) return RadarStyleValueModel.STANDARD;
    if (value == STRadarStyle.MARKER) return RadarStyleValueModel.MARKER;
    if (value == STRadarStyle.FILLED) return RadarStyleValueModel.FILLED;
    return null;
  }

  public static STRadarStyle toDocx4j(RadarStyleValueModel value) {
    if (value == null) return null;
    if (value == RadarStyleValueModel.STANDARD) return STRadarStyle.STANDARD;
    if (value == RadarStyleValueModel.MARKER) return STRadarStyle.MARKER;
    if (value == RadarStyleValueModel.FILLED) return STRadarStyle.FILLED;
    return null;
  }
}
