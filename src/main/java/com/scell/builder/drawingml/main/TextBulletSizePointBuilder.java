package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextBulletSizePointModel;
import com.scell.model.drawingml.main.TextFontSizeModel;

public class TextBulletSizePointBuilder {
  private TextFontSizeModel val;

  public TextBulletSizePointBuilder() {
  }

  public TextBulletSizePointBuilder setVal(TextFontSizeModel val) {
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
