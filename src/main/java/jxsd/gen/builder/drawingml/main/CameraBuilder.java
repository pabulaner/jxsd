package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.CameraModel;
import jxsd.gen.model.drawingml.main.PresetCameraTypeValueModel;
import jxsd.gen.model.drawingml.main.SphereCoordsModel;

/**
 * This is a generated sequence class.
 */
public class CameraBuilder {
  private PresetCameraTypeValueModel prst;

  private int fov;

  private int zoom;

  private SphereCoordsModel rot;

  public CameraBuilder() {
  }

  public CameraBuilder setPrst(PresetCameraTypeValueModel prst) {
    this.prst = prst;
    return this;
  }

  public CameraBuilder setFov(int fov) {
    this.fov = fov;
    return this;
  }

  public CameraBuilder setZoom(int zoom) {
    this.zoom = zoom;
    return this;
  }

  public CameraBuilder setRot(SphereCoordsModel rot) {
    this.rot = rot;
    return this;
  }

  public CameraBuilder from(CameraModel value) {
    this.prst = value.getPrst();
    this.fov = value.getFov();
    this.zoom = value.getZoom();
    this.rot = value.getRot();
    return this;
  }

  public CameraModel build() {
    return new CameraModel(this.prst, this.fov, this.zoom, this.rot);
  }
}
