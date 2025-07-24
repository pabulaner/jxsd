package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextNoBulletModel;
import org.docx4j.dml.CTTextNoBullet;

public class TextNoBulletConverter {
  private TextNoBulletConverter() {
  }

  public static TextNoBulletModel fromDocx4J(CTTextNoBullet value) {
    if (value == null) return null;
    return new TextNoBulletModel();
  }
}
