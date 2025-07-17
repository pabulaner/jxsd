package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_LightRigTypeModel;

public class ST_LightRigTypeBuilder {
  private ST_LightRigTypeModel value;

  public ST_LightRigTypeBuilder() {
    this.value = null;
  }

  public ST_LightRigTypeBuilder from(ST_LightRigTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_LightRigTypeModel build() {
    return this.value;
  }

  public ST_LightRigTypeBuilder setValue(ST_LightRigTypeModel value) {
    this.value = value;
    return this;
  }
}
