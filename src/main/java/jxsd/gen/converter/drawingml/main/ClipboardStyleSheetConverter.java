package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.ClipboardStyleSheetModel;
import org.docx4j.dml.CTClipboardStyleSheet;

/**
 * This is a generated sequence class.
 */
public class ClipboardStyleSheetConverter {
  private ClipboardStyleSheetConverter() {
  }

  public static ClipboardStyleSheetModel fromDocx4j(CTClipboardStyleSheet value) {
    if (value == null) return null;
    return new ClipboardStyleSheetModel(BaseStylesValueConverter.fromDocx4j(value.getThemeElements()), ColorMappingConverter.fromDocx4j(value.getClrMap()));
  }

  public static CTClipboardStyleSheet toDocx4j(ClipboardStyleSheetModel value) {
    if (value == null) return null;
    CTClipboardStyleSheet result = new CTClipboardStyleSheet();
    result.setThemeElements(BaseStylesValueConverter.toDocx4j(value.getThemeElements()));
    result.setClrMap(ColorMappingConverter.toDocx4j(value.getClrMap()));
    return result;
  }
}
