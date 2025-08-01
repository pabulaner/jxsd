package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextBulletStartAtNumValueModel;

public class TextBulletStartAtNumValueBuilder {
  private int value;

  public TextBulletStartAtNumValueBuilder() {
  }

  public TextBulletStartAtNumValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextBulletStartAtNumValueBuilder from(TextBulletStartAtNumValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextBulletStartAtNumValueModel build() {
    return new TextBulletStartAtNumValueModel(this.value);
  }
}
