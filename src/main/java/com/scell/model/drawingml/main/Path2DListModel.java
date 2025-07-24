package com.scell.model.drawingml.main;

import java.util.List;

public class Path2DListModel {
  private final List<Path2DModel> path;

  public Path2DListModel(List<Path2DModel> path) {
    this.path = path;
  }

  public List<Path2DModel> getPath() {
    return this.path;
  }
}
