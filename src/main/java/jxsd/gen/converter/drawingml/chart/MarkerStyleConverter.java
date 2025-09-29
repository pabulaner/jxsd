package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.MarkerStyleModel;
import org.docx4j.dml.chart.CTMarkerStyle;

/**
 * This is a generated sequence class.
 */
public class MarkerStyleConverter {
  private MarkerStyleConverter() {
  }

  public static MarkerStyleModel fromDocx4j(CTMarkerStyle value) {
    if (value == null) return null;
    return new MarkerStyleModel(MarkerStyleValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTMarkerStyle toDocx4j(MarkerStyleModel value) {
    if (value == null) return null;
    CTMarkerStyle result = new CTMarkerStyle();
    result.setVal(MarkerStyleValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
