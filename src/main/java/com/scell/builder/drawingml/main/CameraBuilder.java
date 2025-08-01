package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CameraModel;
import com.scell.model.drawingml.main.FOVAngleValueModel;
import com.scell.model.drawingml.main.PositivePercentageValueModel;
import com.scell.model.drawingml.main.PresetCameraTypeValueModel;
import com.scell.model.drawingml.main.SphereCoordsModel;

public class CameraBuilder {
  private PresetCameraTypeValueModel prst;

  private FOVAngleValueModel fov;

  private PositivePercentageValueModel zoom;

  private SphereCoordsModel rot;

  public CameraBuilder() {
  }

  public CameraBuilder setPrst(PresetCameraTypeValueModel prst) {
    this.prst = prst;
    return this;
  }

  public CameraBuilder setFov(FOVAngleValueModel fov) {
    this.fov = fov;
    return this;
  }

  public CameraBuilder setZoom(PositivePercentageValueModel zoom) {
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
