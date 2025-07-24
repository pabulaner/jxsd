package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextBulletSizePercentModel;
import org.docx4j.dml.CTTextBulletSizePercent;

public class TextBulletSizePercentConverter {
  private TextBulletSizePercentConverter() {
  }

  public static TextBulletSizePercentModel fromDocx4J(CTTextBulletSizePercent value) {
    if (value == null) return null;
    return new TextBulletSizePercentModel(TextBulletSizePercentConverter.fromDocx4J(value.getVal()));
  }
}
