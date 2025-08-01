package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextBulletSizePercentValueModel;

public class TextBulletSizePercentValueConverter {
  private TextBulletSizePercentValueConverter() {
  }

  public static TextBulletSizePercentValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextBulletSizePercentValueModel(value);
  }
}
