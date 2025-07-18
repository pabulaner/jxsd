package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_LineJoinBevelModel;

public class CT_LineJoinBevelBuilder {
  public CT_LineJoinBevelBuilder() {
  }

  public CT_LineJoinBevelModel build() {
    return new CT_LineJoinBevelModel();
  }

  public CT_LineJoinBevelBuilder from(CT_LineJoinBevelModel value) {
    return this;
  }
}
