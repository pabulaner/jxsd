package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.Path2DListModel;
import com.scell.model.drawingml.main.Path2DModel;
import java.util.List;

public class Path2DListBuilder {
  private List<Path2DModel> path;

  public Path2DListBuilder() {
  }

  public Path2DListBuilder setPath(List<Path2DModel> path) {
    this.path = path;
    return this;
  }

  public Path2DListModel build() {
    return new Path2DListModel(this.path);
  }

  public Path2DListBuilder from(Path2DListModel value) {
    this.path = value.getPath();
    return this;
  }
}
