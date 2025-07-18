package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_Path2DCloseModel;

public class CT_Path2DCloseBuilder {
  public CT_Path2DCloseBuilder() {
  }

  public CT_Path2DCloseModel build() {
    return new CT_Path2DCloseModel();
  }

  public CT_Path2DCloseBuilder from(CT_Path2DCloseModel value) {
    return this;
  }
}
