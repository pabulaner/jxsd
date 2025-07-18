package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_RatioModel;
import com.scell.model.drawingml.main.CT_Scale2DModel;

public class CT_Scale2DBuilder {
  private CT_RatioModel sx;

  private CT_RatioModel sy;

  public CT_Scale2DBuilder() {
  }

  public CT_Scale2DBuilder setSx(CT_RatioModel sx) {
    this.sx = sx;
    return this;
  }

  public CT_Scale2DBuilder setSy(CT_RatioModel sy) {
    this.sy = sy;
    return this;
  }

  public CT_Scale2DModel build() {
    return new CT_Scale2DModel(this.sx, this.sy);
  }

  public CT_Scale2DBuilder from(CT_Scale2DModel value) {
    this.sx = value.getSx();
    this.sy = value.getSy();
    return this;
  }
}
