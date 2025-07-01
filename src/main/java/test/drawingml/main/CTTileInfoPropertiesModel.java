package test.drawingml.main;

public class CTTileInfoPropertiesModel {
  private final STPercentageModel sy;

  private final STCoordinateModel ty;

  private final STPercentageModel sx;

  private final STTileFlipModeModel flip;

  private final STCoordinateModel tx;

  private final STRectAlignmentModel algn;

  public CTTileInfoPropertiesModel(STPercentageModel sy, STCoordinateModel ty, STPercentageModel sx,
      STTileFlipModeModel flip, STCoordinateModel tx, STRectAlignmentModel algn) {
    this.sy = sy;
    this.ty = ty;
    this.sx = sx;
    this.flip = flip;
    this.tx = tx;
    this.algn = algn;
  }

  public STPercentageModel getSy() {
    return this.sy;
  }

  public STCoordinateModel getTy() {
    return this.ty;
  }

  public STPercentageModel getSx() {
    return this.sx;
  }

  public STTileFlipModeModel getFlip() {
    return this.flip;
  }

  public STCoordinateModel getTx() {
    return this.tx;
  }

  public STRectAlignmentModel getAlgn() {
    return this.algn;
  }
}
