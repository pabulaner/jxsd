package model.drawingml.main;

import model.XMLSchema.booleanModel;

public class CT_Transform2DModel {
  private final booleanModel flipV;

  private final ST_AngleModel rot;

  private final booleanModel flipH;

  private final CT_Point2DModel off;

  private final CT_PositiveSize2DModel ext;

  public CT_Transform2DModel(booleanModel flipV, ST_AngleModel rot, booleanModel flipH,
      CT_Point2DModel off, CT_PositiveSize2DModel ext) {
    this.flipV = flipV;
    this.rot = rot;
    this.flipH = flipH;
    this.off = off;
    this.ext = ext;
  }

  public booleanModel getFlipV() {
    return this.flipV;
  }

  public ST_AngleModel getRot() {
    return this.rot;
  }

  public booleanModel getFlipH() {
    return this.flipH;
  }

  public CT_Point2DModel getOff() {
    return this.off;
  }

  public CT_PositiveSize2DModel getExt() {
    return this.ext;
  }
}
