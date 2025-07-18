package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ClipboardStyleSheetModel;
import org.docx4j.dml.CTClipboardStyleSheet;

public class CT_ClipboardStyleSheetConverter {
  private CT_ClipboardStyleSheetConverter() {
  }

  public static CT_ClipboardStyleSheetModel fromDocx4J(CTClipboardStyleSheet value) {
    if (value == null) return null;
    return new CT_ClipboardStyleSheetModel(CT_BaseStylesConverter.fromDocx4J(value.getThemeElements()), CT_ColorMappingConverter.fromDocx4J(value.getClrMap()));
  }

  public static CTClipboardStyleSheet toDocx4J(CT_ClipboardStyleSheetModel value) {
    return null;
  }
}
