package test.drawingml.main;

public class CTBevelModel {
  private final STPositiveCoordinateModel h;

  private final STPositiveCoordinateModel w;

  private final STBevelPresetTypeModel prst;

  public CTBevelModel(STPositiveCoordinateModel h, STPositiveCoordinateModel w,
      STBevelPresetTypeModel prst) {
    this.h = h;
    this.w = w;
    this.prst = prst;
  }

  public STPositiveCoordinateModel getH() {
    return this.h;
  }

  public STPositiveCoordinateModel getW() {
    return this.w;
  }

  public STBevelPresetTypeModel getPrst() {
    return this.prst;
  }
}
