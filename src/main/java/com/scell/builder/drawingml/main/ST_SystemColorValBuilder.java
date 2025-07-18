package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_SystemColorValModel;

public class ST_SystemColorValBuilder {
  private ST_SystemColorValModel value;

  public ST_SystemColorValBuilder() {
    this.value = null;
  }

  public ST_SystemColorValBuilder from(ST_SystemColorValModel value) {
    this.value = value;
    return this;
  }

  public ST_SystemColorValModel build() {
    return this.value;
  }

  public ST_SystemColorValBuilder setValue(ST_SystemColorValModel value) {
    this.value = value;
    return this;
  }
}
