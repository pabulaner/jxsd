package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_LightRigDirectionModel;

public class ST_LightRigDirectionBuilder {
  private ST_LightRigDirectionModel value;

  public ST_LightRigDirectionBuilder() {
    this.value = null;
  }

  public ST_LightRigDirectionBuilder from(ST_LightRigDirectionModel value) {
    this.value = value;
    return this;
  }

  public ST_LightRigDirectionModel build() {
    return this.value;
  }

  public ST_LightRigDirectionBuilder setValue(ST_LightRigDirectionModel value) {
    this.value = value;
    return this;
  }
}
