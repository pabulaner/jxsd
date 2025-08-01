package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LightRigDirectionValueModel;

public class LightRigDirectionValueBuilder {
  private LightRigDirectionValueModel value;

  public LightRigDirectionValueBuilder() {
    this.value = null;
  }

  public LightRigDirectionValueBuilder from(LightRigDirectionValueModel value) {
    this.value = value;
    return this;
  }

  public LightRigDirectionValueModel build() {
    return this.value;
  }

  public LightRigDirectionValueBuilder setValue(LightRigDirectionValueModel value) {
    this.value = value;
    return this;
  }
}
