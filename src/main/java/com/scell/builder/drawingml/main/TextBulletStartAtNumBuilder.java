package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextBulletStartAtNumModel;

public class TextBulletStartAtNumBuilder {
  private int value;

  public TextBulletStartAtNumBuilder() {
  }

  public TextBulletStartAtNumBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextBulletStartAtNumBuilder from(TextBulletStartAtNumModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextBulletStartAtNumModel build() {
    return new TextBulletStartAtNumModel(this.value);
  }
}
