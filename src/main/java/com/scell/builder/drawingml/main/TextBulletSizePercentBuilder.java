package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextBulletSizePercentModel;
import com.scell.model.drawingml.main.TextBulletSizePercentValueModel;

public class TextBulletSizePercentBuilder {
  private TextBulletSizePercentValueModel val;

  public TextBulletSizePercentBuilder() {
  }

  public TextBulletSizePercentBuilder setVal(TextBulletSizePercentValueModel val) {
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
