package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_Path2DListModel;
import com.scell.model.drawingml.main.CT_Path2DModel;
import java.util.List;

public class CT_Path2DListBuilder {
  private List<CT_Path2DModel> path;

  public CT_Path2DListBuilder() {
  }

  public CT_Path2DListBuilder setPath(List<CT_Path2DModel> path) {
    this.path = path;
    return this;
  }

  public CT_Path2DListModel build() {
    return new CT_Path2DListModel(this.path);
  }

  public CT_Path2DListBuilder from(CT_Path2DListModel value) {
    this.path = value.getPath();
    return this;
  }
}
