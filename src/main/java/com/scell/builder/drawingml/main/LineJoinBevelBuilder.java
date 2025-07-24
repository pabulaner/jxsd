package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineJoinBevelModel;

public class LineJoinBevelBuilder {
  public LineJoinBevelBuilder() {
  }

  public LineJoinBevelModel build() {
    return new LineJoinBevelModel();
  }

  public LineJoinBevelBuilder from(LineJoinBevelModel value) {
    return this;
  }
}
