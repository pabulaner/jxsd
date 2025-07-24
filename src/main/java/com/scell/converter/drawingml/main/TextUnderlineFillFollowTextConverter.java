package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextUnderlineFillFollowTextModel;
import org.docx4j.dml.CTTextUnderlineFillFollowText;

public class TextUnderlineFillFollowTextConverter {
  private TextUnderlineFillFollowTextConverter() {
  }

  public static TextUnderlineFillFollowTextModel fromDocx4J(CTTextUnderlineFillFollowText value) {
    if (value == null) return null;
    return new TextUnderlineFillFollowTextModel();
  }
}
