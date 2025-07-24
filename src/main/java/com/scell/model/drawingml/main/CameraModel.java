package com.scell.model.drawingml.main;

public class CameraModel {
  private final PresetCameraTypeModel prst;

  private final FOVAngleModel fov;

  private final PositivePercentageModel zoom;

  private final SphereCoordsModel rot;

  public CameraModel(PresetCameraTypeModel prst, FOVAngleModel fov, PositivePercentageModel zoom,
      SphereCoordsModel rot) {
    this.prst = prst;
    this.fov = fov;
    this.zoom = zoom;
    this.rot = rot;
  }

  public PresetCameraTypeModel getPrst() {
    return this.prst;
  }

  public FOVAngleModel getFov() {
    return this.fov;
  }

  public PositivePercentageModel getZoom() {
    return this.zoom;
  }

  public SphereCoordsModel getRot() {
    return this.rot;
  }
}
