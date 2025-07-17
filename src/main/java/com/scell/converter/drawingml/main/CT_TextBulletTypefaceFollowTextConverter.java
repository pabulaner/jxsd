package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextBulletTypefaceFollowTextModel;
import org.docx4j.dml.CTTextBulletTypefaceFollowText;

public class CT_TextBulletTypefaceFollowTextConverter {
  private CT_TextBulletTypefaceFollowTextConverter() {
  }

  public static CT_TextBulletTypefaceFollowTextModel fromDocx4j(
      CTTextBulletTypefaceFollowText value) {
    if (value == null) return null;
    return new CT_TextBulletTypefaceFollowTextModel();
  }

  public static CTTextBulletTypefaceFollowText toDocx4j(
      CT_TextBulletTypefaceFollowTextModel value) {
    return null;
  }
}
