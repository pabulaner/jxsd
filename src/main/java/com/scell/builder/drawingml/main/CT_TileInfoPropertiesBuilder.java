package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_TileInfoPropertiesModel;
import com.scell.model.drawingml.main.ST_CoordinateModel;
import com.scell.model.drawingml.main.ST_PercentageModel;
import com.scell.model.drawingml.main.ST_RectAlignmentModel;
import com.scell.model.drawingml.main.ST_TileFlipModeModel;

public class CT_TileInfoPropertiesBuilder {
  private ST_PercentageModel sy;

  private ST_CoordinateModel ty;

  private ST_PercentageModel sx;

  private ST_TileFlipModeModel flip;

  private ST_CoordinateModel tx;

  private ST_RectAlignmentModel algn;

  public CT_TileInfoPropertiesBuilder() {
  }

  public CT_TileInfoPropertiesBuilder setSy(ST_PercentageModel sy) {
    this.sy = sy;
    return this;
  }

  public CT_TileInfoPropertiesBuilder setTy(ST_CoordinateModel ty) {
    this.ty = ty;
    return this;
  }

  public CT_TileInfoPropertiesBuilder setSx(ST_PercentageModel sx) {
    this.sx = sx;
    return this;
  }

  public CT_TileInfoPropertiesBuilder setFlip(ST_TileFlipModeModel flip) {
    this.flip = flip;
    return this;
  }

  public CT_TileInfoPropertiesBuilder setTx(ST_CoordinateModel tx) {
    this.tx = tx;
    return this;
  }

  public CT_TileInfoPropertiesBuilder setAlgn(ST_RectAlignmentModel algn) {
    this.algn = algn;
    return this;
  }

  public CT_TileInfoPropertiesModel build() {
    return new CT_TileInfoPropertiesModel(this.sy, this.ty, this.sx, this.flip, this.tx, this.algn);
  }

  public CT_TileInfoPropertiesBuilder from(CT_TileInfoPropertiesModel value) {
    this.sy = value.getSy();
    this.ty = value.getTy();
    this.sx = value.getSx();
    this.flip = value.getFlip();
    this.tx = value.getTx();
    this.algn = value.getAlgn();
    return this;
  }
}
