package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.BarGroupingValueBuilder;
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
    if (value == BarGroupingValueBuilder.PERCENT_STACKED) return BarGroupingValueModel.PERCENT_STACKED;
    if (value == BarGroupingValueBuilder.CLUSTERED) return BarGroupingValueModel.CLUSTERED;
    if (value == BarGroupingValueBuilder.STANDARD) return BarGroupingValueModel.STANDARD;
    if (value == BarGroupingValueBuilder.STACKED) return BarGroupingValueModel.STACKED;
    return null;
  }

  public static STBarGrouping toDocx4j(BarGroupingValueModel value) {
    if (value == null) return null;
    if (value == BarGroupingValueModel.PERCENT_STACKED) return BarGroupingValueBuilder.PERCENT_STACKED;
    if (value == BarGroupingValueModel.CLUSTERED) return BarGroupingValueBuilder.CLUSTERED;
    if (value == BarGroupingValueModel.STANDARD) return BarGroupingValueBuilder.STANDARD;
    if (value == BarGroupingValueModel.STACKED) return BarGroupingValueBuilder.STACKED;
    return null;
  }
}
