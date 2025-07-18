package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_TextSpacingPointModel;
import com.scell.model.drawingml.main.ST_TextSpacingPointModel;

public class CT_TextSpacingPointBuilder {
  private ST_TextSpacingPointModel val;

  public CT_TextSpacingPointBuilder() {
  }

  public CT_TextSpacingPointBuilder setVal(ST_TextSpacingPointModel val) {
    this.val = val;
    return this;
  }

  public CT_TextSpacingPointModel build() {
    return new CT_TextSpacingPointModel(this.val);
  }

  public CT_TextSpacingPointBuilder from(CT_TextSpacingPointModel value) {
    this.val = value.getVal();
    return this;
  }
}
