package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_LineJoinRoundModel;

public class CT_LineJoinRoundBuilder {
  public CT_LineJoinRoundBuilder() {
  }

  public CT_LineJoinRoundModel build() {
    return new CT_LineJoinRoundModel();
  }

  public CT_LineJoinRoundBuilder from(CT_LineJoinRoundModel value) {
    return this;
  }
}
