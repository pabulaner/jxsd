package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_AdjCoordinateModel;
import com.scell.model.drawingml.main.ST_CoordinateModel;
import com.scell.model.drawingml.main.ST_GeomGuideNameModel;
import java.lang.Object;

public class ST_AdjCoordinateBuilder {
  private Object value;

  public ST_AdjCoordinateBuilder() {
    this.value = null;
  }

  public ST_AdjCoordinateBuilder setST_Coordinate(ST_CoordinateModel value) {
    this.value = value;
    return this;
  }

  public ST_AdjCoordinateBuilder from(ST_CoordinateModel value) {
    this.value = value;
    return this;
  }

  public ST_AdjCoordinateBuilder setST_GeomGuideName(ST_GeomGuideNameModel value) {
    this.value = value;
    return this;
  }

  public ST_AdjCoordinateBuilder from(ST_GeomGuideNameModel value) {
    this.value = value;
    return this;
  }

  public ST_AdjCoordinateModel build() {
    if (this.value instanceof ST_CoordinateModel) return new ST_AdjCoordinateModel((ST_CoordinateModel) this.value);
    if (this.value instanceof ST_GeomGuideNameModel) return new ST_AdjCoordinateModel((ST_GeomGuideNameModel) this.value);
    return null;
  }
}
