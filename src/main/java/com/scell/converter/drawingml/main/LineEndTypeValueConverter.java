package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineEndTypeValueModel;
import org.docx4j.dml.STLineEndType;

public class LineEndTypeValueConverter {
  private LineEndTypeValueConverter() {
  }

  public static LineEndTypeValueModel fromDocx4J(STLineEndType value) {
    if (value == null) return null;
    if (value == STLineEndType.NONE) return LineEndTypeValueModel.NONE;
    if (value == STLineEndType.TRIANGLE) return LineEndTypeValueModel.TRIANGLE;
    if (value == STLineEndType.STEALTH) return LineEndTypeValueModel.STEALTH;
    if (value == STLineEndType.DIAMOND) return LineEndTypeValueModel.DIAMOND;
    if (value == STLineEndType.OVAL) return LineEndTypeValueModel.OVAL;
    if (value == STLineEndType.ARROW) return LineEndTypeValueModel.ARROW;
    return null;
  }
}
