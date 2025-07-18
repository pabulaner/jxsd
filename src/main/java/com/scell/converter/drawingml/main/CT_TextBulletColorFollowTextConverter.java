package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextBulletColorFollowTextModel;
import org.docx4j.dml.CTTextBulletColorFollowText;

public class CT_TextBulletColorFollowTextConverter {
  private CT_TextBulletColorFollowTextConverter() {
  }

  public static CT_TextBulletColorFollowTextModel fromDocx4J(CTTextBulletColorFollowText value) {
    if (value == null) return null;
    return new CT_TextBulletColorFollowTextModel();
  }

  public static CTTextBulletColorFollowText toDocx4J(CT_TextBulletColorFollowTextModel value) {
    return null;
  }
}
