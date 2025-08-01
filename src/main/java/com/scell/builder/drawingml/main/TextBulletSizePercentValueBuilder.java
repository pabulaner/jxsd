package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextBulletSizePercentValueModel;

public class TextBulletSizePercentValueBuilder {
  private int value;

  public TextBulletSizePercentValueBuilder() {
  }

  public TextBulletSizePercentValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextBulletSizePercentValueBuilder from(TextBulletSizePercentValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextBulletSizePercentValueModel build() {
    return new TextBulletSizePercentValueModel(this.value);
  }
}
