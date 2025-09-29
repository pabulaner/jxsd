package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.TimeUnitValueBuilder;
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
    if (value == TimeUnitValueBuilder.DAYS) return TimeUnitValueModel.DAYS;
    if (value == TimeUnitValueBuilder.MONTHS) return TimeUnitValueModel.MONTHS;
    if (value == TimeUnitValueBuilder.YEARS) return TimeUnitValueModel.YEARS;
    return null;
  }

  public static STTimeUnit toDocx4j(TimeUnitValueModel value) {
    if (value == null) return null;
    if (value == TimeUnitValueModel.DAYS) return TimeUnitValueBuilder.DAYS;
    if (value == TimeUnitValueModel.MONTHS) return TimeUnitValueBuilder.MONTHS;
    if (value == TimeUnitValueModel.YEARS) return TimeUnitValueBuilder.YEARS;
    return null;
  }
}
