package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CoordinateModel;
import com.scell.model.drawingml.main.PercentageModel;
import com.scell.model.drawingml.main.RectAlignmentModel;
import com.scell.model.drawingml.main.TileFlipModeModel;
import com.scell.model.drawingml.main.TileInfoPropertiesModel;

public class TileInfoPropertiesBuilder {
  private PercentageModel sy;

  private CoordinateModel ty;

  private PercentageModel sx;

  private TileFlipModeModel flip;

  private CoordinateModel tx;

  private RectAlignmentModel algn;

  public TileInfoPropertiesBuilder() {
  }

  public TileInfoPropertiesBuilder setSy(PercentageModel sy) {
    this.sy = sy;
    return this;
  }

  public TileInfoPropertiesBuilder setTy(CoordinateModel ty) {
    this.ty = ty;
    return this;
  }

  public TileInfoPropertiesBuilder setSx(PercentageModel sx) {
    this.sx = sx;
    return this;
  }

  public TileInfoPropertiesBuilder setFlip(TileFlipModeModel flip) {
    this.flip = flip;
    return this;
  }

  public TileInfoPropertiesBuilder setTx(CoordinateModel tx) {
    this.tx = tx;
    return this;
  }

  public TileInfoPropertiesBuilder setAlgn(RectAlignmentModel algn) {
    this.algn = algn;
    return this;
  }

  public TileInfoPropertiesModel build() {
    return new TileInfoPropertiesModel(this.sy, this.ty, this.sx, this.flip, this.tx, this.algn);
  }

  public TileInfoPropertiesBuilder from(TileInfoPropertiesModel value) {
    this.sy = value.getSy();
    this.ty = value.getTy();
    this.sx = value.getSx();
    this.flip = value.getFlip();
    this.tx = value.getTx();
    this.algn = value.getAlgn();
    return this;
  }
}
