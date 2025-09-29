package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.FontCollectionIndexValueBuilder;
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
    if (value == FontCollectionIndexValueBuilder.MAJOR) return FontCollectionIndexValueModel.MAJOR;
    if (value == FontCollectionIndexValueBuilder.MINOR) return FontCollectionIndexValueModel.MINOR;
    if (value == FontCollectionIndexValueBuilder.NONE) return FontCollectionIndexValueModel.NONE;
    return null;
  }

  public static STFontCollectionIndex toDocx4j(FontCollectionIndexValueModel value) {
    if (value == null) return null;
    if (value == FontCollectionIndexValueModel.MAJOR) return FontCollectionIndexValueBuilder.MAJOR;
    if (value == FontCollectionIndexValueModel.MINOR) return FontCollectionIndexValueBuilder.MINOR;
    if (value == FontCollectionIndexValueModel.NONE) return FontCollectionIndexValueBuilder.NONE;
    return null;
  }
}
