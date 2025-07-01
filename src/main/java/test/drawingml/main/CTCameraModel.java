package test.drawingml.main;

public class CTCameraModel {
  private final STPresetCameraTypeModel prst;

  private final STFOVAngleModel fov;

  private final STPositivePercentageModel zoom;

  private final CTSphereCoordsModel rot;

  public CTCameraModel(STPresetCameraTypeModel prst, STFOVAngleModel fov,
      STPositivePercentageModel zoom, CTSphereCoordsModel rot) {
    this.prst = prst;
    this.fov = fov;
    this.zoom = zoom;
    this.rot = rot;
  }

  public STPresetCameraTypeModel getPrst() {
    return this.prst;
  }

  public STFOVAngleModel getFov() {
    return this.fov;
  }

  public STPositivePercentageModel getZoom() {
    return this.zoom;
  }

  public CTSphereCoordsModel getRot() {
    return this.rot;
  }
}
