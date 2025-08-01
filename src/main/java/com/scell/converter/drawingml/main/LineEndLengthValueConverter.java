package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineEndLengthValueModel;
import org.docx4j.dml.STLineEndLength;

public class LineEndLengthValueConverter {
  private LineEndLengthValueConverter() {
  }

  public static LineEndLengthValueModel fromDocx4J(STLineEndLength value) {
    if (value == null) return null;
    if (value == STLineEndLength.SM) return LineEndLengthValueModel.SM;
    if (value == STLineEndLength.MED) return LineEndLengthValueModel.MED;
    if (value == STLineEndLength.LG) return LineEndLengthValueModel.LG;
    return null;
  }
}
