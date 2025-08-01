package com.scell.model.drawingml.main;

public class TileInfoPropertiesModel {
  private final PercentageValueModel sy;

  private final CoordinateValueModel ty;

  private final PercentageValueModel sx;

  private final TileFlipModeValueModel flip;

  private final CoordinateValueModel tx;

  private final RectAlignmentValueModel algn;

  public TileInfoPropertiesModel(PercentageValueModel sy, CoordinateValueModel ty,
      PercentageValueModel sx, TileFlipModeValueModel flip, CoordinateValueModel tx,
      RectAlignmentValueModel algn) {
    this.sy = sy;
    this.ty = ty;
    this.sx = sx;
    this.flip = flip;
    this.tx = tx;
    this.algn = algn;
  }

  public PercentageValueModel getSy() {
    return this.sy;
  }

  public CoordinateValueModel getTy() {
    return this.ty;
  }

  public PercentageValueModel getSx() {
    return this.sx;
  }

  public TileFlipModeValueModel getFlip() {
    return this.flip;
  }

  public CoordinateValueModel getTx() {
    return this.tx;
  }

  public RectAlignmentValueModel getAlgn() {
    return this.algn;
  }
}
