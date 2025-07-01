package test.drawingml.main;

public class CTPathShadePropertiesModel {
  private final STPathShadeTypeModel path;

  private final CTRelativeRectModel fillToRect;

  public CTPathShadePropertiesModel(STPathShadeTypeModel path, CTRelativeRectModel fillToRect) {
    this.path = path;
    this.fillToRect = fillToRect;
  }

  public STPathShadeTypeModel getPath() {
    return this.path;
  }

  public CTRelativeRectModel getFillToRect() {
    return this.fillToRect;
  }
}
