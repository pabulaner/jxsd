package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.SystemColorValModel;

public class SystemColorValBuilder {
  private SystemColorValModel value;

  public SystemColorValBuilder() {
    this.value = null;
  }

  public SystemColorValBuilder from(SystemColorValModel value) {
    this.value = value;
    return this;
  }

  public SystemColorValModel build() {
    return this.value;
  }

  public SystemColorValBuilder setValue(SystemColorValModel value) {
    this.value = value;
    return this;
  }
}
