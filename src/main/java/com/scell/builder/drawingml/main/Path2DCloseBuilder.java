package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.Path2DCloseModel;

public class Path2DCloseBuilder {
  public Path2DCloseBuilder() {
  }

  public Path2DCloseModel build() {
    return new Path2DCloseModel();
  }

  public Path2DCloseBuilder from(Path2DCloseModel value) {
    return this;
  }
}
