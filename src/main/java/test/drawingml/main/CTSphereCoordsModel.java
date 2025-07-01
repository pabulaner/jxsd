package test.drawingml.main;

public class CTSphereCoordsModel {
  private final STPositiveFixedAngleModel lat;

  private final STPositiveFixedAngleModel rev;

  private final STPositiveFixedAngleModel lon;

  public CTSphereCoordsModel(STPositiveFixedAngleModel lat, STPositiveFixedAngleModel rev,
      STPositiveFixedAngleModel lon) {
    this.lat = lat;
    this.rev = rev;
    this.lon = lon;
  }

  public STPositiveFixedAngleModel getLat() {
    return this.lat;
  }

  public STPositiveFixedAngleModel getRev() {
    return this.rev;
  }

  public STPositiveFixedAngleModel getLon() {
    return this.lon;
  }
}
