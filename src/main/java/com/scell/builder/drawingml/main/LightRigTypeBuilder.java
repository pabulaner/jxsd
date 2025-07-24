package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LightRigTypeModel;

public class LightRigTypeBuilder {
  private LightRigTypeModel value;

  public LightRigTypeBuilder() {
    this.value = null;
  }

  public LightRigTypeBuilder from(LightRigTypeModel value) {
    this.value = value;
    return this;
  }

  public LightRigTypeModel build() {
    return this.value;
  }

  public LightRigTypeBuilder setValue(LightRigTypeModel value) {
    this.value = value;
    return this;
  }
}
