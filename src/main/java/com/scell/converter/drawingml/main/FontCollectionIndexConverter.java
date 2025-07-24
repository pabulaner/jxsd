package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.FontCollectionIndexModel;
import org.docx4j.dml.STFontCollectionIndex;

public class FontCollectionIndexConverter {
  private FontCollectionIndexConverter() {
  }

  public static FontCollectionIndexModel fromDocx4J(STFontCollectionIndex value) {
    if (value == null) return null;
    if (value == STFontCollectionIndex.MAJOR) return FontCollectionIndexModel.MAJOR;
    if (value == STFontCollectionIndex.MINOR) return FontCollectionIndexModel.MINOR;
    if (value == STFontCollectionIndex.NONE) return FontCollectionIndexModel.NONE;
    return null;
  }
}
