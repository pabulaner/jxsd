package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.RadarStyleValueBuilder;
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
    if (value == RadarStyleValueBuilder.STANDARD) return RadarStyleValueModel.STANDARD;
    if (value == RadarStyleValueBuilder.MARKER) return RadarStyleValueModel.MARKER;
    if (value == RadarStyleValueBuilder.FILLED) return RadarStyleValueModel.FILLED;
    return null;
  }

  public static STRadarStyle toDocx4j(RadarStyleValueModel value) {
    if (value == null) return null;
    if (value == RadarStyleValueModel.STANDARD) return RadarStyleValueBuilder.STANDARD;
    if (value == RadarStyleValueModel.MARKER) return RadarStyleValueBuilder.MARKER;
    if (value == RadarStyleValueModel.FILLED) return RadarStyleValueBuilder.FILLED;
    return null;
  }
}
