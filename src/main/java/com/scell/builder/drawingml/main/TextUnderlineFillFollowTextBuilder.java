package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextUnderlineFillFollowTextModel;

public class TextUnderlineFillFollowTextBuilder {
  public TextUnderlineFillFollowTextBuilder() {
  }

  public TextUnderlineFillFollowTextModel build() {
    return new TextUnderlineFillFollowTextModel();
  }

  public TextUnderlineFillFollowTextBuilder from(TextUnderlineFillFollowTextModel value) {
    return this;
  }
}
