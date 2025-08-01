package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.FontCollectionIndexValueModel;
import org.docx4j.dml.STFontCollectionIndex;

public class FontCollectionIndexValueConverter {
  private FontCollectionIndexValueConverter() {
  }

  public static FontCollectionIndexValueModel fromDocx4J(STFontCollectionIndex value) {
    if (value == null) return null;
    if (value == STFontCollectionIndex.MAJOR) return FontCollectionIndexValueModel.MAJOR;
    if (value == STFontCollectionIndex.MINOR) return FontCollectionIndexValueModel.MINOR;
    if (value == STFontCollectionIndex.NONE) return FontCollectionIndexValueModel.NONE;
    return null;
  }
}
