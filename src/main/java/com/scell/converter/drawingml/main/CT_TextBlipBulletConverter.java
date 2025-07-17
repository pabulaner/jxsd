package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextBlipBulletModel;
import org.docx4j.dml.CTTextBlipBullet;

public class CT_TextBlipBulletConverter {
  private CT_TextBlipBulletConverter() {
  }

  public static CT_TextBlipBulletModel fromDocx4j(CTTextBlipBullet value) {
    if (value == null) return null;
    return new CT_TextBlipBulletModel(CT_BlipConverter.fromDocx4j(value.getBlip()));
  }

  public static CTTextBlipBullet toDocx4j(CT_TextBlipBulletModel value) {
    return null;
  }
}
