package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextNoBulletModel;
import org.docx4j.dml.CTTextNoBullet;

public class CT_TextNoBulletConverter {
  private CT_TextNoBulletConverter() {
  }

  public static CT_TextNoBulletModel fromDocx4J(CTTextNoBullet value) {
    if (value == null) return null;
    return new CT_TextNoBulletModel();
  }

  public static CTTextNoBullet toDocx4J(CT_TextNoBulletModel value) {
    return null;
  }
}
