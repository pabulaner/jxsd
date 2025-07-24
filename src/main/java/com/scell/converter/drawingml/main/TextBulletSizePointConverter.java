package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextBulletSizePointModel;
import org.docx4j.dml.CTTextBulletSizePoint;

public class TextBulletSizePointConverter {
  private TextBulletSizePointConverter() {
  }

  public static TextBulletSizePointModel fromDocx4J(CTTextBulletSizePoint value) {
    if (value == null) return null;
    return new TextBulletSizePointModel(TextFontSizeConverter.fromDocx4J(value.getVal()));
  }
}
