package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.RectAlignmentValueModel;
import jxsd.gen.model.drawingml.main.TileFlipModeValueModel;
import jxsd.gen.model.drawingml.main.TileInfoPropertiesModel;

/**
 * This is a generated sequence class.
 */
public class TileInfoPropertiesBuilder {
  private int sy;

  private long ty;

  private int sx;

  private TileFlipModeValueModel flip;

  private long tx;

  private RectAlignmentValueModel algn;

  public TileInfoPropertiesBuilder() {
  }

  public TileInfoPropertiesBuilder setSy(int sy) {
    this.sy = sy;
    return this;
  }

  public TileInfoPropertiesBuilder setTy(long ty) {
    this.ty = ty;
    return this;
  }

  public TileInfoPropertiesBuilder setSx(int sx) {
    this.sx = sx;
    return this;
  }

  public TileInfoPropertiesBuilder setFlip(TileFlipModeValueModel flip) {
    this.flip = flip;
    return this;
  }

  public TileInfoPropertiesBuilder setTx(long tx) {
    this.tx = tx;
    return this;
  }

  public TileInfoPropertiesBuilder setAlgn(RectAlignmentValueModel algn) {
    this.algn = algn;
    return this;
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

  public TileInfoPropertiesModel build() {
    return new TileInfoPropertiesModel(this.sy, this.ty, this.sx, this.flip, this.tx, this.algn);
  }
}
