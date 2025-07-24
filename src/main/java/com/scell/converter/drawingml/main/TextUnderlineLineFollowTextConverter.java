package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextUnderlineLineFollowTextModel;
import org.docx4j.dml.CTTextUnderlineLineFollowText;

public class TextUnderlineLineFollowTextConverter {
  private TextUnderlineLineFollowTextConverter() {
  }

  public static TextUnderlineLineFollowTextModel fromDocx4J(CTTextUnderlineLineFollowText value) {
    if (value == null) return null;
    return new TextUnderlineLineFollowTextModel();
  }
}
