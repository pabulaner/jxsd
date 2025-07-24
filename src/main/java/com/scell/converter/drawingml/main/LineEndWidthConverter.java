package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineEndWidthModel;
import org.docx4j.dml.STLineEndWidth;

public class LineEndWidthConverter {
  private LineEndWidthConverter() {
  }

  public static LineEndWidthModel fromDocx4J(STLineEndWidth value) {
    if (value == null) return null;
    if (value == STLineEndWidth.SM) return LineEndWidthModel.SM;
    if (value == STLineEndWidth.MED) return LineEndWidthModel.MED;
    if (value == STLineEndWidth.LG) return LineEndWidthModel.LG;
    return null;
  }
}
