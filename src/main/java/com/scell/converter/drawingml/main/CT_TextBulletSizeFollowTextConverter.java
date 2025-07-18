package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextBulletSizeFollowTextModel;
import org.docx4j.dml.CTTextBulletSizeFollowText;

public class CT_TextBulletSizeFollowTextConverter {
  private CT_TextBulletSizeFollowTextConverter() {
  }

  public static CT_TextBulletSizeFollowTextModel fromDocx4J(CTTextBulletSizeFollowText value) {
    if (value == null) return null;
    return new CT_TextBulletSizeFollowTextModel();
  }

  public static CTTextBulletSizeFollowText toDocx4J(CT_TextBulletSizeFollowTextModel value) {
    return null;
  }
}
