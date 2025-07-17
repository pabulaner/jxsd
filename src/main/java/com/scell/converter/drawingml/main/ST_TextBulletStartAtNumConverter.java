package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextBulletStartAtNumModel;

public class ST_TextBulletStartAtNumConverter {
  private ST_TextBulletStartAtNumConverter() {
  }

  public static ST_TextBulletStartAtNumModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_TextBulletStartAtNumModel(value);
  }

  public static Long toDocx4j(ST_TextBulletStartAtNumModel value) {
    return null;
  }
}
