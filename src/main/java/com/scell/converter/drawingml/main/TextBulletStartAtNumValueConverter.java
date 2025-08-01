package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextBulletStartAtNumValueModel;

public class TextBulletStartAtNumValueConverter {
  private TextBulletStartAtNumValueConverter() {
  }

  public static TextBulletStartAtNumValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextBulletStartAtNumValueModel(value);
  }
}
