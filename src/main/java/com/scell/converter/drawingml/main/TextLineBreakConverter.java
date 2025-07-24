package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextLineBreakModel;
import org.docx4j.dml.CTTextLineBreak;

public class TextLineBreakConverter {
  private TextLineBreakConverter() {
  }

  public static TextLineBreakModel fromDocx4J(CTTextLineBreak value) {
    if (value == null) return null;
    return new TextLineBreakModel(TextCharacterPropertiesConverter.fromDocx4J(value.getRPr()));
  }
}
