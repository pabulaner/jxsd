package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjCoordinateValueModel;
import java.lang.String;

public class AdjCoordinateValueBuilder {
  private String value;

  public AdjCoordinateValueBuilder() {
  }

  public AdjCoordinateValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public AdjCoordinateValueBuilder from(AdjCoordinateValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public AdjCoordinateValueModel build() {
    return new AdjCoordinateValueModel(this.value);
  }
}
