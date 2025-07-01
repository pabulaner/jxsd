package test.drawingml.main;

public class CTScale2DModel {
  private final CTRatioModel sx;

  private final CTRatioModel sy;

  public CTScale2DModel(CTRatioModel sx, CTRatioModel sy) {
    this.sx = sx;
    this.sy = sy;
  }

  public CTRatioModel getSx() {
    return this.sx;
  }

  public CTRatioModel getSy() {
    return this.sy;
  }
}
