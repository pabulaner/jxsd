package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineJoinRoundModel;
import org.docx4j.dml.CTLineJoinRound;

public class LineJoinRoundConverter {
  private LineJoinRoundConverter() {
  }

  public static LineJoinRoundModel fromDocx4J(CTLineJoinRound value) {
    if (value == null) return null;
    return new LineJoinRoundModel();
  }
}
