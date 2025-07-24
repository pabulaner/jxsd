package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextNoBulletModel;

public class TextNoBulletBuilder {
  public TextNoBulletBuilder() {
  }

  public TextNoBulletModel build() {
    return new TextNoBulletModel();
  }

  public TextNoBulletBuilder from(TextNoBulletModel value) {
    return this;
  }
}
