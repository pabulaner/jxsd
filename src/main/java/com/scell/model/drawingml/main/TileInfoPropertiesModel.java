package com.scell.model.drawingml.main;

public class TileInfoPropertiesModel {
  private final PercentageModel sy;

  private final CoordinateModel ty;

  private final PercentageModel sx;

  private final TileFlipModeModel flip;

  private final CoordinateModel tx;

  private final RectAlignmentModel algn;

  public TileInfoPropertiesModel(PercentageModel sy, CoordinateModel ty, PercentageModel sx,
      TileFlipModeModel flip, CoordinateModel tx, RectAlignmentModel algn) {
    this.sy = sy;
    this.ty = ty;
    this.sx = sx;
    this.flip = flip;
    this.tx = tx;
    this.algn = algn;
  }

  public PercentageModel getSy() {
    return this.sy;
  }

  public CoordinateModel getTy() {
    return this.ty;
  }

  public PercentageModel getSx() {
    return this.sx;
  }

  public TileFlipModeModel getFlip() {
    return this.flip;
  }

  public CoordinateModel getTx() {
    return this.tx;
  }

  public RectAlignmentModel getAlgn() {
    return this.algn;
  }
}
