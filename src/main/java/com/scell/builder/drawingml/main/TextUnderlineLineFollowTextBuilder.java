package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextUnderlineLineFollowTextModel;

public class TextUnderlineLineFollowTextBuilder {
  public TextUnderlineLineFollowTextBuilder() {
  }

  public TextUnderlineLineFollowTextModel build() {
    return new TextUnderlineLineFollowTextModel();
  }

  public TextUnderlineLineFollowTextBuilder from(TextUnderlineLineFollowTextModel value) {
    return this;
  }
}
