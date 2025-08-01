package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextBulletSizePointModel;
import com.scell.model.drawingml.main.TextFontSizeValueModel;

public class TextBulletSizePointBuilder {
  private TextFontSizeValueModel val;

  public TextBulletSizePointBuilder() {
  }

  public TextBulletSizePointBuilder setVal(TextFontSizeValueModel val) {
    this.val = val;
    return this;
  }

  public TextBulletSizePointModel build() {
    return new TextBulletSizePointModel(this.val);
  }

  public TextBulletSizePointBuilder from(TextBulletSizePointModel value) {
    this.val = value.getVal();
    return this;
  }
}
