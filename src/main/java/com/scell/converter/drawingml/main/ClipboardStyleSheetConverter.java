package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ClipboardStyleSheetModel;
import org.docx4j.dml.CTClipboardStyleSheet;

public class ClipboardStyleSheetConverter {
  private ClipboardStyleSheetConverter() {
  }

  public static ClipboardStyleSheetModel fromDocx4J(CTClipboardStyleSheet value) {
    if (value == null) return null;
    return new ClipboardStyleSheetModel(BaseStylesConverter.fromDocx4J(value.getThemeElements()), ColorMappingConverter.fromDocx4J(value.getClrMap()));
  }
}
