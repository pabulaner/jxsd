package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.FontCollectionIndexValueModel;
import org.docx4j.dml.STFontCollectionIndex;

/**
 * This is a generated enum class.
 */
public class FontCollectionIndexValueConverter {
  private FontCollectionIndexValueConverter() {
  }

  public static FontCollectionIndexValueModel fromDocx4j(STFontCollectionIndex value) {
    if (value == null) return null;
    if (value == STFontCollectionIndex.MAJOR) return FontCollectionIndexValueModel.MAJOR;
    if (value == STFontCollectionIndex.MINOR) return FontCollectionIndexValueModel.MINOR;
    if (value == STFontCollectionIndex.NONE) return FontCollectionIndexValueModel.NONE;
    return null;
  }

  public static STFontCollectionIndex toDocx4j(FontCollectionIndexValueModel value) {
    if (value == null) return null;
    if (value == FontCollectionIndexValueModel.MAJOR) return STFontCollectionIndex.MAJOR;
    if (value == FontCollectionIndexValueModel.MINOR) return STFontCollectionIndex.MINOR;
    if (value == FontCollectionIndexValueModel.NONE) return STFontCollectionIndex.NONE;
    return null;
  }
}
