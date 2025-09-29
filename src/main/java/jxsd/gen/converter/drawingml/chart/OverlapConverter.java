package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.OverlapModel;
import org.docx4j.dml.chart.CTOverlap;

/**
 * This is a generated sequence class.
 */
public class OverlapConverter {
  private OverlapConverter() {
  }

  public static OverlapModel fromDocx4j(CTOverlap value) {
    if (value == null) return null;
    return new OverlapModel(OverlapValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTOverlap toDocx4j(OverlapModel value) {
    if (value == null) return null;
    CTOverlap result = new CTOverlap();
    result.setVal(OverlapValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
