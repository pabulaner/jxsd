package com.scell.model.drawingml.main;

public class CameraModel {
  private final PresetCameraTypeValueModel prst;

  private final FOVAngleValueModel fov;

  private final PositivePercentageValueModel zoom;

  private final SphereCoordsModel rot;

  public CameraModel(PresetCameraTypeValueModel prst, FOVAngleValueModel fov,
      PositivePercentageValueModel zoom, SphereCoordsModel rot) {
    this.prst = prst;
    this.fov = fov;
    this.zoom = zoom;
    this.rot = rot;
  }

  public PresetCameraTypeValueModel getPrst() {
    return this.prst;
  }

  public FOVAngleValueModel getFov() {
    return this.fov;
  }

  public PositivePercentageValueModel getZoom() {
    return this.zoom;
  }

  public SphereCoordsModel getRot() {
    return this.rot;
  }
}
