package com.scell.model.drawingml.main;

public class CT_TileInfoPropertiesModel {
  private final ST_PercentageModel sy;

  private final ST_CoordinateModel ty;

  private final ST_PercentageModel sx;

  private final ST_TileFlipModeModel flip;

  private final ST_CoordinateModel tx;

  private final ST_RectAlignmentModel algn;

  public CT_TileInfoPropertiesModel(ST_PercentageModel sy, ST_CoordinateModel ty,
      ST_PercentageModel sx, ST_TileFlipModeModel flip, ST_CoordinateModel tx,
      ST_RectAlignmentModel algn) {
    this.sy = sy;
    this.ty = ty;
    this.sx = sx;
    this.flip = flip;
    this.tx = tx;
    this.algn = algn;
  }

  public ST_PercentageModel getSy() {
    return this.sy;
  }

  public ST_CoordinateModel getTy() {
    return this.ty;
  }

  public ST_PercentageModel getSx() {
    return this.sx;
  }

  public ST_TileFlipModeModel getFlip() {
    return this.flip;
  }

  public ST_CoordinateModel getTx() {
    return this.tx;
  }

  public ST_RectAlignmentModel getAlgn() {
    return this.algn;
  }
}
