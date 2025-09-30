package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TimeUnitValueModel;
import org.docx4j.dml.chart.STTimeUnit;

/**
 * This is a generated enum class.
 */
public class TimeUnitValueConverter {
  private TimeUnitValueConverter() {
  }

  public static TimeUnitValueModel fromDocx4j(STTimeUnit value) {
    if (value == null) return null;
    if (value == STTimeUnit.DAYS) return TimeUnitValueModel.DAYS;
    if (value == STTimeUnit.MONTHS) return TimeUnitValueModel.MONTHS;
    if (value == STTimeUnit.YEARS) return TimeUnitValueModel.YEARS;
    return null;
  }

  public static STTimeUnit toDocx4j(TimeUnitValueModel value) {
    if (value == null) return null;
    if (value == TimeUnitValueModel.DAYS) return STTimeUnit.DAYS;
    if (value == TimeUnitValueModel.MONTHS) return STTimeUnit.MONTHS;
    if (value == TimeUnitValueModel.YEARS) return STTimeUnit.YEARS;
    return null;
  }
}
