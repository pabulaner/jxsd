package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_GeomGuideNameModel;

public class ST_GeomGuideNameBuilder {
  private String value;

  public ST_GeomGuideNameBuilder() {
    this.value = null;
  }

  public ST_GeomGuideNameBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public ST_GeomGuideNameBuilder from(ST_GeomGuideNameModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_GeomGuideNameModel build() {
    return new ST_GeomGuideNameModel(this.value);
  }
}
