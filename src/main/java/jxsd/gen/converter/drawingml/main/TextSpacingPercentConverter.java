package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextSpacingPercentModel;
import org.docx4j.dml.CTTextSpacingPercent;

/**
 * This is a generated sequence class.
 */
public class TextSpacingPercentConverter {
  private TextSpacingPercentConverter() {
  }

  public static TextSpacingPercentModel fromDocx4j(CTTextSpacingPercent value) {
    if (value == null) return null;
    return new TextSpacingPercentModel(TextSpacingPercentValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTTextSpacingPercent toDocx4j(TextSpacingPercentModel value) {
    if (value == null) return null;
    CTTextSpacingPercent result = new CTTextSpacingPercent();
    result.setVal(TextSpacingPercentValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
