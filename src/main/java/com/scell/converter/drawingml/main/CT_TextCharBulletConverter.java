package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_TextCharBulletModel;
import org.docx4j.dml.CTTextCharBullet;

public class CT_TextCharBulletConverter {
  private CT_TextCharBulletConverter() {
  }

  public static CT_TextCharBulletModel fromDocx4j(CTTextCharBullet value) {
    if (value == null) return null;
    return new CT_TextCharBulletModel(StringConverter.fromDocx4j(value.getChar()));
  }

  public static CTTextCharBullet toDocx4j(CT_TextCharBulletModel value) {
    return null;
  }
}
