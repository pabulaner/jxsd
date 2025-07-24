package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextBulletStartAtNumModel;

public class TextBulletStartAtNumConverter {
  private TextBulletStartAtNumConverter() {
  }

  public static TextBulletStartAtNumModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextBulletStartAtNumModel(value);
  }
}
