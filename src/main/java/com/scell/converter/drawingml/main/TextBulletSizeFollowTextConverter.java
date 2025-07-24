package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextBulletSizeFollowTextModel;
import org.docx4j.dml.CTTextBulletSizeFollowText;

public class TextBulletSizeFollowTextConverter {
  private TextBulletSizeFollowTextConverter() {
  }

  public static TextBulletSizeFollowTextModel fromDocx4J(CTTextBulletSizeFollowText value) {
    if (value == null) return null;
    return new TextBulletSizeFollowTextModel();
  }
}
