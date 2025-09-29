package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BarGroupingModel;
import org.docx4j.dml.chart.CTBarGrouping;

/**
 * This is a generated sequence class.
 */
public class BarGroupingConverter {
  private BarGroupingConverter() {
  }

  public static BarGroupingModel fromDocx4j(CTBarGrouping value) {
    if (value == null) return null;
    return new BarGroupingModel(BarGroupingValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTBarGrouping toDocx4j(BarGroupingModel value) {
    if (value == null) return null;
    CTBarGrouping result = new CTBarGrouping();
    result.setVal(BarGroupingValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
