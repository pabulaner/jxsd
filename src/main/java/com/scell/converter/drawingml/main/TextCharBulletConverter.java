package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.TextCharBulletModel;
import org.docx4j.dml.CTTextCharBullet;

public class TextCharBulletConverter {
  private TextCharBulletConverter() {
  }

  public static TextCharBulletModel fromDocx4J(CTTextCharBullet value) {
    if (value == null) return null;
    return new TextCharBulletModel(StringConverter.fromDocx4J(value.getChar()));
  }
}
