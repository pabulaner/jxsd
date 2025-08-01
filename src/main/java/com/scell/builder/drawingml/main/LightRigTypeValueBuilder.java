package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LightRigTypeValueModel;

public class LightRigTypeValueBuilder {
  private LightRigTypeValueModel value;

  public LightRigTypeValueBuilder() {
    this.value = null;
  }

  public LightRigTypeValueBuilder from(LightRigTypeValueModel value) {
    this.value = value;
    return this;
  }

  public LightRigTypeValueModel build() {
    return this.value;
  }

  public LightRigTypeValueBuilder setValue(LightRigTypeValueModel value) {
    this.value = value;
    return this;
  }
}
