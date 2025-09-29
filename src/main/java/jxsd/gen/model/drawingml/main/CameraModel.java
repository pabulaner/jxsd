package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.CameraBuilder;

/**
 * This is a generated sequence class.
 */
public class CameraModel {
  private final PresetCameraTypeValueModel prst;

  private final int fov;

  private final int zoom;

  private final SphereCoordsModel rot;

  public CameraModel(PresetCameraTypeValueModel prst, int fov, int zoom, SphereCoordsModel rot) {
    this.prst = prst;
    this.fov = fov;
    this.zoom = zoom;
    this.rot = rot;
  }

  public CameraBuilder builder() {
    return new CameraBuilder().from(this);
  }

  public PresetCameraTypeValueModel getPrst() {
    return this.prst;
  }

  public int getFov() {
    return this.fov;
  }

  public int getZoom() {
    return this.zoom;
  }

  public SphereCoordsModel getRot() {
    return this.rot;
  }
}
