package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineJoinRoundModel;

public class LineJoinRoundBuilder {
  public LineJoinRoundBuilder() {
  }

  public LineJoinRoundModel build() {
    return new LineJoinRoundModel();
  }

  public LineJoinRoundBuilder from(LineJoinRoundModel value) {
    return this;
  }
}
