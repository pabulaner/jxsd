package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.SkipModel;
import org.docx4j.dml.chart.CTSkip;

/**
 * This is a generated sequence class.
 */
public class SkipConverter {
  private SkipConverter() {
  }

  public static SkipModel fromDocx4j(CTSkip value) {
    if (value == null) return null;
    return new SkipModel(SkipValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTSkip toDocx4j(SkipModel value) {
    if (value == null) return null;
    CTSkip result = new CTSkip();
    result.setVal(SkipValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
