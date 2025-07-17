package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_AngleModel;

public class ST_AngleBuilder {
  private Long value;

  public ST_AngleBuilder() {
    this.value = null;
  }

  public ST_AngleBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_AngleBuilder from(ST_AngleModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_AngleModel build() {
    return new ST_AngleModel(this.value);
  }
}
