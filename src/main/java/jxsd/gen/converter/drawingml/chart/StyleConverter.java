package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.StyleModel;
import org.docx4j.dml.chart.CTStyle;

/**
 * This is a generated sequence class.
 */
public class StyleConverter {
  private StyleConverter() {
  }

  public static StyleModel fromDocx4j(CTStyle value) {
    if (value == null) return null;
    return new StyleModel(StyleValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTStyle toDocx4j(StyleModel value) {
    if (value == null) return null;
    CTStyle result = new CTStyle();
    result.setVal(StyleValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
