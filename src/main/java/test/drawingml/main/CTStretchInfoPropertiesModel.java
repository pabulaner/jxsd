package test.drawingml.main;

public class CTStretchInfoPropertiesModel {
  private final CTRelativeRectModel fillRect;

  public CTStretchInfoPropertiesModel(CTRelativeRectModel fillRect) {
    this.fillRect = fillRect;
  }

  public CTRelativeRectModel getFillRect() {
    return this.fillRect;
  }
}
