package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_LineJoinRoundModel;
import org.docx4j.dml.CTLineJoinRound;

public class CT_LineJoinRoundConverter {
  private CT_LineJoinRoundConverter() {
  }

  public static CT_LineJoinRoundModel fromDocx4j(CTLineJoinRound value) {
    if (value == null) return null;
    return new CT_LineJoinRoundModel();
  }

  public static CTLineJoinRound toDocx4j(CT_LineJoinRoundModel value) {
    return null;
  }
}
