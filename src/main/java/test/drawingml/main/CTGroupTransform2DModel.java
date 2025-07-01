package test.drawingml.main;

import test.XMLSchema.BooleanModel;

public class CTGroupTransform2DModel {
  private final BooleanModel flipV;

  private final STAngleModel rot;

  private final BooleanModel flipH;

  private final CTPoint2DModel off;

  private final CTPositiveSize2DModel ext;

  private final CTPoint2DModel chOff;

  private final CTPositiveSize2DModel chExt;

  public CTGroupTransform2DModel(BooleanModel flipV, STAngleModel rot, BooleanModel flipH,
      CTPoint2DModel off, CTPositiveSize2DModel ext, CTPoint2DModel chOff,
      CTPositiveSize2DModel chExt) {
    this.flipV = flipV;
    this.rot = rot;
    this.flipH = flipH;
    this.off = off;
    this.ext = ext;
    this.chOff = chOff;
    this.chExt = chExt;
  }

  public BooleanModel getFlipV() {
    return this.flipV;
  }

  public STAngleModel getRot() {
    return this.rot;
  }

  public BooleanModel getFlipH() {
    return this.flipH;
  }

  public CTPoint2DModel getOff() {
    return this.off;
  }

  public CTPositiveSize2DModel getExt() {
    return this.ext;
  }

  public CTPoint2DModel getChOff() {
    return this.chOff;
  }

  public CTPositiveSize2DModel getChExt() {
    return this.chExt;
  }
}
