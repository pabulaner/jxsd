package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextBulletSizePercentModel;

public class TextBulletSizePercentBuilder {
  private TextBulletSizePercentModel val;

  public TextBulletSizePercentBuilder() {
  }

  public TextBulletSizePercentBuilder setVal(TextBulletSizePercentModel val) {
    this.val = val;
    return this;
  }

  public TextBulletSizePercentModel build() {
    return new TextBulletSizePercentModel(this.val);
  }

  public TextBulletSizePercentBuilder from(TextBulletSizePercentModel value) {
    this.val = value.getVal();
    return this;
  }
}
