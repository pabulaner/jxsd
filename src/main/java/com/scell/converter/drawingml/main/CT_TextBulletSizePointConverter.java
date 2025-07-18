package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextBulletSizePointModel;
import org.docx4j.dml.CTTextBulletSizePoint;

public class CT_TextBulletSizePointConverter {
  private CT_TextBulletSizePointConverter() {
  }

  public static CT_TextBulletSizePointModel fromDocx4J(CTTextBulletSizePoint value) {
    if (value == null) return null;
    return new CT_TextBulletSizePointModel(ST_TextFontSizeConverter.fromDocx4J(value.getVal()));
  }

  public static CTTextBulletSizePoint toDocx4J(CT_TextBulletSizePointModel value) {
    return null;
  }
}
