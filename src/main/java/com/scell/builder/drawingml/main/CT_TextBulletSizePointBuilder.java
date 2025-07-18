package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_TextBulletSizePointModel;
import com.scell.model.drawingml.main.ST_TextFontSizeModel;

public class CT_TextBulletSizePointBuilder {
  private ST_TextFontSizeModel val;

  public CT_TextBulletSizePointBuilder() {
  }

  public CT_TextBulletSizePointBuilder setVal(ST_TextFontSizeModel val) {
    this.val = val;
    return this;
  }

  public CT_TextBulletSizePointModel build() {
    return new CT_TextBulletSizePointModel(this.val);
  }

  public CT_TextBulletSizePointBuilder from(CT_TextBulletSizePointModel value) {
    this.val = value.getVal();
    return this;
  }
}
