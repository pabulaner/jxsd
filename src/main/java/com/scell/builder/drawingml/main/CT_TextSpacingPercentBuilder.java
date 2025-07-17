package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_TextSpacingPercentModel;
import com.scell.model.drawingml.main.ST_TextSpacingPercentModel;

public class CT_TextSpacingPercentBuilder {
  private ST_TextSpacingPercentModel val;

  public CT_TextSpacingPercentBuilder() {
  }

  public CT_TextSpacingPercentBuilder setVal(ST_TextSpacingPercentModel val) {
    this.val = val;
    return this;
  }

  public CT_TextSpacingPercentModel build() {
    return new CT_TextSpacingPercentModel(this.val);
  }

  public CT_TextSpacingPercentBuilder from(CT_TextSpacingPercentModel value) {
    this.val = value.getVal();
    return this;
  }
}
