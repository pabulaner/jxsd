package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_AdjAngleModel;
import com.scell.model.drawingml.main.ST_AngleModel;
import com.scell.model.drawingml.main.ST_GeomGuideNameModel;
import java.lang.Object;

public class ST_AdjAngleBuilder {
  private Object value;

  public ST_AdjAngleBuilder() {
    this.value = null;
  }

  public ST_AdjAngleBuilder setST_Angle(ST_AngleModel value) {
    this.value = value;
    return this;
  }

  public ST_AdjAngleBuilder from(ST_AngleModel value) {
    this.value = value;
    return this;
  }

  public ST_AdjAngleBuilder setST_GeomGuideName(ST_GeomGuideNameModel value) {
    this.value = value;
    return this;
  }

  public ST_AdjAngleBuilder from(ST_GeomGuideNameModel value) {
    this.value = value;
    return this;
  }

  public ST_AdjAngleModel build() {
    if (this.value instanceof ST_AngleModel) return new ST_AdjAngleModel((ST_AngleModel) this.value);
    if (this.value instanceof ST_GeomGuideNameModel) return new ST_AdjAngleModel((ST_GeomGuideNameModel) this.value);
    return null;
  }
}
