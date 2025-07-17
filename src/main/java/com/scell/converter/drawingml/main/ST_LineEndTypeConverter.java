package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_LineEndTypeModel;
import org.docx4j.dml.STLineEndType;

public class ST_LineEndTypeConverter {
  private ST_LineEndTypeConverter() {
  }

  public static ST_LineEndTypeModel fromDocx4j(STLineEndType value) {
    if (value == null) return null;
    if (value == STLineEndType.NONE) return ST_LineEndTypeModel.NONE;
    if (value == STLineEndType.TRIANGLE) return ST_LineEndTypeModel.TRIANGLE;
    if (value == STLineEndType.STEALTH) return ST_LineEndTypeModel.STEALTH;
    if (value == STLineEndType.DIAMOND) return ST_LineEndTypeModel.DIAMOND;
    if (value == STLineEndType.OVAL) return ST_LineEndTypeModel.OVAL;
    if (value == STLineEndType.ARROW) return ST_LineEndTypeModel.ARROW;
    return null;
  }

  public static STLineEndType toDocx4j(ST_LineEndTypeModel value) {
    return null;
  }
}
