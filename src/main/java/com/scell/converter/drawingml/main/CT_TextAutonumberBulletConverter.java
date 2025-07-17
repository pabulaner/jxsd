package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextAutonumberBulletModel;
import org.docx4j.dml.CTTextAutonumberBullet;

public class CT_TextAutonumberBulletConverter {
  private CT_TextAutonumberBulletConverter() {
  }

  public static CT_TextAutonumberBulletModel fromDocx4j(CTTextAutonumberBullet value) {
    if (value == null) return null;
    return new CT_TextAutonumberBulletModel(ST_TextAutonumberSchemeConverter.fromDocx4j(value.getType()), ST_TextBulletStartAtNumConverter.fromDocx4j(value.getStartAt()));
  }

  public static CTTextAutonumberBullet toDocx4j(CT_TextAutonumberBulletModel value) {
    return null;
  }
}
