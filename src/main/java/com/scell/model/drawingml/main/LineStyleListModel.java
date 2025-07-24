package com.scell.model.drawingml.main;

import java.util.List;

public class LineStyleListModel {
  private final List<LinePropertiesModel> ln;

  public LineStyleListModel(List<LinePropertiesModel> ln) {
    this.ln = ln;
  }

  public List<LinePropertiesModel> getLn() {
    return this.ln;
  }
}
