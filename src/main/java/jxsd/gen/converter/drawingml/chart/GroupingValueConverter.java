package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.GroupingValueModel;
import org.docx4j.dml.chart.STGrouping;

/**
 * This is a generated enum class.
 */
public class GroupingValueConverter {
  private GroupingValueConverter() {
  }

  public static GroupingValueModel fromDocx4j(STGrouping value) {
    if (value == null) return null;
    if (value == STGrouping.PERCENT_STACKED) return GroupingValueModel.PERCENT_STACKED;
    if (value == STGrouping.STANDARD) return GroupingValueModel.STANDARD;
    if (value == STGrouping.STACKED) return GroupingValueModel.STACKED;
    return null;
  }

  public static STGrouping toDocx4j(GroupingValueModel value) {
    if (value == null) return null;
    if (value == GroupingValueModel.PERCENT_STACKED) return STGrouping.PERCENT_STACKED;
    if (value == GroupingValueModel.STANDARD) return STGrouping.STANDARD;
    if (value == GroupingValueModel.STACKED) return STGrouping.STACKED;
    return null;
  }
}
