package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextLineBreakModel;
import org.docx4j.dml.CTTextLineBreak;

/**
 * This is a generated sequence class.
 */
public class TextLineBreakConverter {
  private TextLineBreakConverter() {
  }

  public static TextLineBreakModel fromDocx4j(CTTextLineBreak value) {
    if (value == null) return null;
    return new TextLineBreakModel(TextCharacterPropertiesConverter.fromDocx4j(value.getRPr()));
  }

  public static CTTextLineBreak toDocx4j(TextLineBreakModel value) {
    if (value == null) return null;
    CTTextLineBreak result = new CTTextLineBreak();
    result.setRPr(TextCharacterPropertiesConverter.toDocx4j(value.getRPr()));
    return result;
  }
}
