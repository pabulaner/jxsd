package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.RatioModel;
import com.scell.model.drawingml.main.Scale2DModel;

public class Scale2DBuilder {
  private RatioModel sx;

  private RatioModel sy;

  public Scale2DBuilder() {
  }

  public Scale2DBuilder setSx(RatioModel sx) {
    this.sx = sx;
    return this;
  }

  public Scale2DBuilder setSy(RatioModel sy) {
    this.sy = sy;
    return this;
  }

  public Scale2DModel build() {
    return new Scale2DModel(this.sx, this.sy);
  }

  public Scale2DBuilder from(Scale2DModel value) {
    this.sx = value.getSx();
    this.sy = value.getSy();
    return this;
  }
}
