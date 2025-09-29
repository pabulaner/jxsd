package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.SplitTypeModel;
import org.docx4j.dml.chart.CTSplitType;

/**
 * This is a generated sequence class.
 */
public class SplitTypeConverter {
  private SplitTypeConverter() {
  }

  public static SplitTypeModel fromDocx4j(CTSplitType value) {
    if (value == null) return null;
    return new SplitTypeModel(SplitTypeValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTSplitType toDocx4j(SplitTypeModel value) {
    if (value == null) return null;
    CTSplitType result = new CTSplitType();
    result.setVal(SplitTypeValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
