package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjCoordinateModel;
import java.lang.String;

public class AdjCoordinateBuilder {
  private String value;

  public AdjCoordinateBuilder() {
  }

  public AdjCoordinateBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public AdjCoordinateBuilder from(AdjCoordinateModel value) {
    this.value = value.getValue();
    return this;
  }

  public AdjCoordinateModel build() {
    return new AdjCoordinateModel(this.value);
  }
}
