package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_LineEndWidthModel;
import org.docx4j.dml.STLineEndWidth;

public class ST_LineEndWidthConverter {
  private ST_LineEndWidthConverter() {
  }

  public static ST_LineEndWidthModel fromDocx4j(STLineEndWidth value) {
    if (value == null) return null;
    if (value == STLineEndWidth.SM) return ST_LineEndWidthModel.SM;
    if (value == STLineEndWidth.MED) return ST_LineEndWidthModel.MED;
    if (value == STLineEndWidth.LG) return ST_LineEndWidthModel.LG;
    return null;
  }

  public static STLineEndWidth toDocx4j(ST_LineEndWidthModel value) {
    return null;
  }
}
