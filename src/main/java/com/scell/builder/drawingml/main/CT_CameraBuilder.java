package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_CameraModel;
import com.scell.model.drawingml.main.CT_SphereCoordsModel;
import com.scell.model.drawingml.main.ST_FOVAngleModel;
import com.scell.model.drawingml.main.ST_PositivePercentageModel;
import com.scell.model.drawingml.main.ST_PresetCameraTypeModel;

public class CT_CameraBuilder {
  private ST_PresetCameraTypeModel prst;

  private ST_FOVAngleModel fov;

  private ST_PositivePercentageModel zoom;

  private CT_SphereCoordsModel rot;

  public CT_CameraBuilder() {
  }

  public CT_CameraBuilder setPrst(ST_PresetCameraTypeModel prst) {
    this.prst = prst;
    return this;
  }

  public CT_CameraBuilder setFov(ST_FOVAngleModel fov) {
    this.fov = fov;
    return this;
  }

  public CT_CameraBuilder setZoom(ST_PositivePercentageModel zoom) {
    this.zoom = zoom;
    return this;
  }

  public CT_CameraBuilder setRot(CT_SphereCoordsModel rot) {
    this.rot = rot;
    return this;
  }

  public CT_CameraModel build() {
    return new CT_CameraModel(this.prst, this.fov, this.zoom, this.rot);
  }

  public CT_CameraBuilder from(CT_CameraModel value) {
    this.prst = value.getPrst();
    this.fov = value.getFov();
    this.zoom = value.getZoom();
    this.rot = value.getRot();
    return this;
  }
}
