package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BarGroupingValueModel;
import org.docx4j.dml.chart.STBarGrouping;

/**
 * This is a generated enum class.
 */
public class BarGroupingValueConverter {
  private BarGroupingValueConverter() {
  }

  public static BarGroupingValueModel fromDocx4j(STBarGrouping value) {
    if (value == null) return null;
    if (value == STBarGrouping.PERCENT_STACKED) return BarGroupingValueModel.PERCENT_STACKED;
    if (value == STBarGrouping.CLUSTERED) return BarGroupingValueModel.CLUSTERED;
    if (value == STBarGrouping.STANDARD) return BarGroupingValueModel.STANDARD;
    if (value == STBarGrouping.STACKED) return BarGroupingValueModel.STACKED;
    return null;
  }

  public static STBarGrouping toDocx4j(BarGroupingValueModel value) {
    if (value == null) return null;
    if (value == BarGroupingValueModel.PERCENT_STACKED) return STBarGrouping.PERCENT_STACKED;
    if (value == BarGroupingValueModel.CLUSTERED) return STBarGrouping.CLUSTERED;
    if (value == BarGroupingValueModel.STANDARD) return STBarGrouping.STANDARD;
    if (value == BarGroupingValueModel.STACKED) return STBarGrouping.STACKED;
    return null;
  }
}
