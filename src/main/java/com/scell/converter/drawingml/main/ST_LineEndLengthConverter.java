package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_LineEndLengthModel;
import org.docx4j.dml.STLineEndLength;

public class ST_LineEndLengthConverter {
  private ST_LineEndLengthConverter() {
  }

  public static ST_LineEndLengthModel fromDocx4j(STLineEndLength value) {
    if (value == null) return null;
    if (value == STLineEndLength.SM) return ST_LineEndLengthModel.SM;
    if (value == STLineEndLength.MED) return ST_LineEndLengthModel.MED;
    if (value == STLineEndLength.LG) return ST_LineEndLengthModel.LG;
    return null;
  }

  public static STLineEndLength toDocx4j(ST_LineEndLengthModel value) {
    return null;
  }
}
