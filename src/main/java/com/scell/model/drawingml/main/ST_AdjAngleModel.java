package com.scell.model.drawingml.main;

import java.lang.Object;

public class ST_AdjAngleModel {
  private final Object value;

  public ST_AdjAngleModel() {
    this.value = null;
  }

  public ST_AdjAngleModel(ST_AngleModel value) {
    this.value = value;
  }

  public ST_AdjAngleModel(ST_GeomGuideNameModel value) {
    this.value = value;
  }

  public boolean isST_Angle() {
    return this.value instanceof ST_AngleModel;
  }

  public ST_AngleModel getST_Angle() {
    return (ST_AngleModel) this.value;
  }

  public boolean isST_GeomGuideName() {
    return this.value instanceof ST_GeomGuideNameModel;
  }

  public ST_GeomGuideNameModel getST_GeomGuideName() {
    return (ST_GeomGuideNameModel) this.value;
  }
}
