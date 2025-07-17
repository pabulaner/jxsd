package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextLineBreakModel;
import org.docx4j.dml.CTTextLineBreak;

public class CT_TextLineBreakConverter {
  private CT_TextLineBreakConverter() {
  }

  public static CT_TextLineBreakModel fromDocx4j(CTTextLineBreak value) {
    if (value == null) return null;
    return new CT_TextLineBreakModel(CT_TextCharacterPropertiesConverter.fromDocx4j(value.getRPr()));
  }

  public static CTTextLineBreak toDocx4j(CT_TextLineBreakModel value) {
    return null;
  }
}
