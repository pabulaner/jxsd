package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.GroupingModel;
import org.docx4j.dml.chart.CTGrouping;

/**
 * This is a generated sequence class.
 */
public class GroupingConverter {
  private GroupingConverter() {
  }

  public static GroupingModel fromDocx4j(CTGrouping value) {
    if (value == null) return null;
    return new GroupingModel(GroupingValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTGrouping toDocx4j(GroupingModel value) {
    if (value == null) return null;
    CTGrouping result = new CTGrouping();
    result.setVal(GroupingValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
