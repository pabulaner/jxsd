package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextBlipBulletModel;
import org.docx4j.dml.CTTextBlipBullet;

public class TextBlipBulletConverter {
  private TextBlipBulletConverter() {
  }

  public static TextBlipBulletModel fromDocx4J(CTTextBlipBullet value) {
    if (value == null) return null;
    return new TextBlipBulletModel(BlipConverter.fromDocx4J(value.getBlip()));
  }
}
