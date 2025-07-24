package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextBulletSizeFollowTextModel;

public class TextBulletSizeFollowTextBuilder {
  public TextBulletSizeFollowTextBuilder() {
  }

  public TextBulletSizeFollowTextModel build() {
    return new TextBulletSizeFollowTextModel();
  }

  public TextBulletSizeFollowTextBuilder from(TextBulletSizeFollowTextModel value) {
    return this;
  }
}
