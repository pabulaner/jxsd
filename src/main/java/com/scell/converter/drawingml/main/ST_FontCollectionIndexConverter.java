package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_FontCollectionIndexModel;
import org.docx4j.dml.STFontCollectionIndex;

public class ST_FontCollectionIndexConverter {
  private ST_FontCollectionIndexConverter() {
  }

  public static ST_FontCollectionIndexModel fromDocx4J(STFontCollectionIndex value) {
    if (value == null) return null;
    if (value == STFontCollectionIndex.MAJOR) return ST_FontCollectionIndexModel.MAJOR;
    if (value == STFontCollectionIndex.MINOR) return ST_FontCollectionIndexModel.MINOR;
    if (value == STFontCollectionIndex.NONE) return ST_FontCollectionIndexModel.NONE;
    return null;
  }

  public static STFontCollectionIndex toDocx4J(ST_FontCollectionIndexModel value) {
    return null;
  }
}
