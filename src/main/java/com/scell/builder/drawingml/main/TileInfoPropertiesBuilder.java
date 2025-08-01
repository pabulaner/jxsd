package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CoordinateValueModel;
import com.scell.model.drawingml.main.PercentageValueModel;
import com.scell.model.drawingml.main.RectAlignmentValueModel;
import com.scell.model.drawingml.main.TileFlipModeValueModel;
import com.scell.model.drawingml.main.TileInfoPropertiesModel;

public class TileInfoPropertiesBuilder {
  private PercentageValueModel sy;

  private CoordinateValueModel ty;

  private PercentageValueModel sx;

  private TileFlipModeValueModel flip;

  private CoordinateValueModel tx;

  private RectAlignmentValueModel algn;

  public TileInfoPropertiesBuilder() {
  }

  public TileInfoPropertiesBuilder setSy(PercentageValueModel sy) {
    this.sy = sy;
    return this;
  }

  public TileInfoPropertiesBuilder setTy(CoordinateValueModel ty) {
    this.ty = ty;
    return this;
  }

  public TileInfoPropertiesBuilder setSx(PercentageValueModel sx) {
    this.sx = sx;
    return this;
  }

  public TileInfoPropertiesBuilder setFlip(TileFlipModeValueModel flip) {
    this.flip = flip;
    return this;
  }

  public TileInfoPropertiesBuilder setTx(CoordinateValueModel tx) {
    this.tx = tx;
    return this;
  }

  public TileInfoPropertiesBuilder setAlgn(RectAlignmentValueModel algn) {
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
