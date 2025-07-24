package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideNameModel;

public class GeomGuideNameBuilder {
  private String value;

  public GeomGuideNameBuilder() {
  }

  public GeomGuideNameBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public GeomGuideNameBuilder from(GeomGuideNameModel value) {
    this.value = value.getValue();
    return this;
  }

  public GeomGuideNameModel build() {
    return new GeomGuideNameModel(this.value);
  }
}
