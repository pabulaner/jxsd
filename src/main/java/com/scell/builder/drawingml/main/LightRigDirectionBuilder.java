package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LightRigDirectionModel;

public class LightRigDirectionBuilder {
  private LightRigDirectionModel value;

  public LightRigDirectionBuilder() {
    this.value = null;
  }

  public LightRigDirectionBuilder from(LightRigDirectionModel value) {
    this.value = value;
    return this;
  }

  public LightRigDirectionModel build() {
    return this.value;
  }

  public LightRigDirectionBuilder setValue(LightRigDirectionModel value) {
    this.value = value;
    return this;
  }
}
