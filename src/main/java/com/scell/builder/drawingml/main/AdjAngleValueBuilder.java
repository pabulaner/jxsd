package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjAngleValueModel;
import java.lang.String;

public class AdjAngleValueBuilder {
  private String value;

  public AdjAngleValueBuilder() {
  }

  public AdjAngleValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public AdjAngleValueBuilder from(AdjAngleValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public AdjAngleValueModel build() {
    return new AdjAngleValueModel(this.value);
  }
}
