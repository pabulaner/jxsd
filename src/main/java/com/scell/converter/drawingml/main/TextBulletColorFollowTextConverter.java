package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextBulletColorFollowTextModel;
import org.docx4j.dml.CTTextBulletColorFollowText;

public class TextBulletColorFollowTextConverter {
  private TextBulletColorFollowTextConverter() {
  }

  public static TextBulletColorFollowTextModel fromDocx4J(CTTextBulletColorFollowText value) {
    if (value == null) return null;
    return new TextBulletColorFollowTextModel();
  }
}
