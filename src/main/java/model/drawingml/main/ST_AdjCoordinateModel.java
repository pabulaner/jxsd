package model.drawingml.main;

import java.lang.Object;

public class ST_AdjCoordinateModel {
  private final Object value;

  public ST_AdjCoordinateModel() {
    this.value = null;
  }

  public ST_AdjCoordinateModel(ST_CoordinateModel value) {
    this.value = value;
  }

  public ST_AdjCoordinateModel(ST_GeomGuideNameModel value) {
    this.value = value;
  }

  public boolean isST_Coordinate() {
    return this.value instanceof ST_CoordinateModel;
  }

  public ST_CoordinateModel getST_Coordinate() {
    return (ST_CoordinateModel) this.value;
  }

  public boolean isST_GeomGuideName() {
    return this.value instanceof ST_GeomGuideNameModel;
  }

  public ST_GeomGuideNameModel getST_GeomGuideName() {
    return (ST_GeomGuideNameModel) this.value;
  }
}
