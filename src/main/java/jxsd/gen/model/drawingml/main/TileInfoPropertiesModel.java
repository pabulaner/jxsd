package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TileInfoPropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class TileInfoPropertiesModel {
  private final int sy;

  private final long ty;

  private final int sx;

  private final TileFlipModeValueModel flip;

  private final long tx;

  private final RectAlignmentValueModel algn;

  public TileInfoPropertiesModel(int sy, long ty, int sx, TileFlipModeValueModel flip, long tx,
      RectAlignmentValueModel algn) {
    this.sy = sy;
    this.ty = ty;
    this.sx = sx;
    this.flip = flip;
    this.tx = tx;
    this.algn = algn;
  }

  public TileInfoPropertiesBuilder builder() {
    return new TileInfoPropertiesBuilder().from(this);
  }

  public int getSy() {
    return this.sy;
  }

  public long getTy() {
    return this.ty;
  }

  public int getSx() {
    return this.sx;
  }

  public TileFlipModeValueModel getFlip() {
    return this.flip;
  }

  public long getTx() {
    return this.tx;
  }

  public RectAlignmentValueModel getAlgn() {
    return this.algn;
  }
}
