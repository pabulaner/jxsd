package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextAutonumberBulletModel;
import org.docx4j.dml.CTTextAutonumberBullet;

public class TextAutonumberBulletConverter {
  private TextAutonumberBulletConverter() {
  }

  public static TextAutonumberBulletModel fromDocx4J(CTTextAutonumberBullet value) {
    if (value == null) return null;
    return new TextAutonumberBulletModel(TextAutonumberSchemeValueConverter.fromDocx4J(value.getType()), TextBulletStartAtNumValueConverter.fromDocx4J(value.getStartAt()));
  }
}
