package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextUnderlineLineFollowTextModel;
import org.docx4j.dml.CTTextUnderlineLineFollowText;

public class CT_TextUnderlineLineFollowTextConverter {
  private CT_TextUnderlineLineFollowTextConverter() {
  }

  public static CT_TextUnderlineLineFollowTextModel fromDocx4J(
      CTTextUnderlineLineFollowText value) {
    if (value == null) return null;
    return new CT_TextUnderlineLineFollowTextModel();
  }

  public static CTTextUnderlineLineFollowText toDocx4J(CT_TextUnderlineLineFollowTextModel value) {
    return null;
  }
}
