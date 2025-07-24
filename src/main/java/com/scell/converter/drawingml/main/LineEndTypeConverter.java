package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineEndTypeModel;
import org.docx4j.dml.STLineEndType;

public class LineEndTypeConverter {
  private LineEndTypeConverter() {
  }

  public static LineEndTypeModel fromDocx4J(STLineEndType value) {
    if (value == null) return null;
    if (value == STLineEndType.NONE) return LineEndTypeModel.NONE;
    if (value == STLineEndType.TRIANGLE) return LineEndTypeModel.TRIANGLE;
    if (value == STLineEndType.STEALTH) return LineEndTypeModel.STEALTH;
    if (value == STLineEndType.DIAMOND) return LineEndTypeModel.DIAMOND;
    if (value == STLineEndType.OVAL) return LineEndTypeModel.OVAL;
    if (value == STLineEndType.ARROW) return LineEndTypeModel.ARROW;
    return null;
  }
}
