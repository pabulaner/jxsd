package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TimeUnitModel;
import org.docx4j.dml.chart.CTTimeUnit;

/**
 * This is a generated sequence class.
 */
public class TimeUnitConverter {
  private TimeUnitConverter() {
  }

  public static TimeUnitModel fromDocx4j(CTTimeUnit value) {
    if (value == null) return null;
    return new TimeUnitModel(TimeUnitValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTTimeUnit toDocx4j(TimeUnitModel value) {
    if (value == null) return null;
    CTTimeUnit result = new CTTimeUnit();
    result.setVal(TimeUnitValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
