package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextBulletSizePercentModel;

public class ST_TextBulletSizePercentConverter {
  private ST_TextBulletSizePercentConverter() {
  }

  public static ST_TextBulletSizePercentModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_TextBulletSizePercentModel(value);
  }

  public static Long toDocx4j(ST_TextBulletSizePercentModel value) {
    return null;
  }
}
