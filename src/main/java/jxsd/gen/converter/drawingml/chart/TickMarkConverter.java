package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TickMarkModel;
import org.docx4j.dml.chart.CTTickMark;

/**
 * This is a generated sequence class.
 */
public class TickMarkConverter {
  private TickMarkConverter() {
  }

  public static TickMarkModel fromDocx4j(CTTickMark value) {
    if (value == null) return null;
    return new TickMarkModel(TickMarkValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTTickMark toDocx4j(TickMarkModel value) {
    if (value == null) return null;
    CTTickMark result = new CTTickMark();
    result.setVal(TickMarkValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
