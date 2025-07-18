package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextUnderlineFillFollowTextModel;
import org.docx4j.dml.CTTextUnderlineFillFollowText;

public class CT_TextUnderlineFillFollowTextConverter {
  private CT_TextUnderlineFillFollowTextConverter() {
  }

  public static CT_TextUnderlineFillFollowTextModel fromDocx4J(
      CTTextUnderlineFillFollowText value) {
    if (value == null) return null;
    return new CT_TextUnderlineFillFollowTextModel();
  }

  public static CTTextUnderlineFillFollowText toDocx4J(CT_TextUnderlineFillFollowTextModel value) {
    return null;
  }
}
