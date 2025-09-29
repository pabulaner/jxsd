package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TextLanguageIDModel;
import org.docx4j.dml.chart.CTTextLanguageID;

/**
 * This is a generated sequence class.
 */
public class TextLanguageIDConverter {
  private TextLanguageIDConverter() {
  }

  public static TextLanguageIDModel fromDocx4j(CTTextLanguageID value) {
    if (value == null) return null;
    return new TextLanguageIDModel(TextLanguageIDValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTTextLanguageID toDocx4j(TextLanguageIDModel value) {
    if (value == null) return null;
    CTTextLanguageID result = new CTTextLanguageID();
    result.setVal(TextLanguageIDValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
