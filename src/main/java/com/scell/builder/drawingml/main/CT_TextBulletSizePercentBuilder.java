package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_TextBulletSizePercentModel;
import com.scell.model.drawingml.main.ST_TextBulletSizePercentModel;

public class CT_TextBulletSizePercentBuilder {
  private ST_TextBulletSizePercentModel val;

  public CT_TextBulletSizePercentBuilder() {
  }

  public CT_TextBulletSizePercentBuilder setVal(ST_TextBulletSizePercentModel val) {
    this.val = val;
    return this;
  }

  public CT_TextBulletSizePercentModel build() {
    return new CT_TextBulletSizePercentModel(this.val);
  }

  public CT_TextBulletSizePercentBuilder from(CT_TextBulletSizePercentModel value) {
    this.val = value.getVal();
    return this;
  }
}
