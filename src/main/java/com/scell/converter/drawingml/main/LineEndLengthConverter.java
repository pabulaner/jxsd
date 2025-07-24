package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineEndLengthModel;
import org.docx4j.dml.STLineEndLength;

public class LineEndLengthConverter {
  private LineEndLengthConverter() {
  }

  public static LineEndLengthModel fromDocx4J(STLineEndLength value) {
    if (value == null) return null;
    if (value == STLineEndLength.SM) return LineEndLengthModel.SM;
    if (value == STLineEndLength.MED) return LineEndLengthModel.MED;
    if (value == STLineEndLength.LG) return LineEndLengthModel.LG;
    return null;
  }
}
