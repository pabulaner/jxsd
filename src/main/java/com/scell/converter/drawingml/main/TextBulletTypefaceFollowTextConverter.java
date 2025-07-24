package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextBulletTypefaceFollowTextModel;
import org.docx4j.dml.CTTextBulletTypefaceFollowText;

public class TextBulletTypefaceFollowTextConverter {
  private TextBulletTypefaceFollowTextConverter() {
  }

  public static TextBulletTypefaceFollowTextModel fromDocx4J(CTTextBulletTypefaceFollowText value) {
    if (value == null) return null;
    return new TextBulletTypefaceFollowTextModel();
  }
}
