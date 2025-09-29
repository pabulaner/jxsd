package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.MarkerSizeModel;
import org.docx4j.dml.chart.CTMarkerSize;

/**
 * This is a generated sequence class.
 */
public class MarkerSizeConverter {
  private MarkerSizeConverter() {
  }

  public static MarkerSizeModel fromDocx4j(CTMarkerSize value) {
    if (value == null) return null;
    return new MarkerSizeModel(MarkerSizeValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTMarkerSize toDocx4j(MarkerSizeModel value) {
    if (value == null) return null;
    CTMarkerSize result = new CTMarkerSize();
    result.setVal(MarkerSizeValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
