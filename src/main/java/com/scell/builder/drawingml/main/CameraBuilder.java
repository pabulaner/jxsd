package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CameraModel;
import com.scell.model.drawingml.main.FOVAngleModel;
import com.scell.model.drawingml.main.PositivePercentageModel;
import com.scell.model.drawingml.main.PresetCameraTypeModel;
import com.scell.model.drawingml.main.SphereCoordsModel;

public class CameraBuilder {
  private PresetCameraTypeModel prst;

  private FOVAngleModel fov;

  private PositivePercentageModel zoom;

  private SphereCoordsModel rot;

  public CameraBuilder() {
  }

  public CameraBuilder setPrst(PresetCameraTypeModel prst) {
    this.prst = prst;
    return this;
  }

  public CameraBuilder setFov(FOVAngleModel fov) {
    this.fov = fov;
    return this;
  }

  public CameraBuilder setZoom(PositivePercentageModel zoom) {
    this.zoom = zoom;
    return this;
  }

  public CameraBuilder setRot(SphereCoordsModel rot) {
    this.rot = rot;
    return this;
  }

  public CameraModel build() {
    return new CameraModel(this.prst, this.fov, this.zoom, this.rot);
  }

  public CameraBuilder from(CameraModel value) {
    this.prst = value.getPrst();
    this.fov = value.getFov();
    this.zoom = value.getZoom();
    this.rot = value.getRot();
    return this;
  }
}
