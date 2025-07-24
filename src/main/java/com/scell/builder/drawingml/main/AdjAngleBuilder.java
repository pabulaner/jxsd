package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjAngleModel;
import java.lang.String;

public class AdjAngleBuilder {
  private String value;

  public AdjAngleBuilder() {
  }

  public AdjAngleBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public AdjAngleBuilder from(AdjAngleModel value) {
    this.value = value.getValue();
    return this;
  }

  public AdjAngleModel build() {
    return new AdjAngleModel(this.value);
  }
}
