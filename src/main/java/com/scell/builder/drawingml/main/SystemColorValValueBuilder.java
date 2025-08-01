package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.SystemColorValValueModel;

public class SystemColorValValueBuilder {
  private SystemColorValValueModel value;

  public SystemColorValValueBuilder() {
    this.value = null;
  }

  public SystemColorValValueBuilder from(SystemColorValValueModel value) {
    this.value = value;
    return this;
  }

  public SystemColorValValueModel build() {
    return this.value;
  }

  public SystemColorValValueBuilder setValue(SystemColorValValueModel value) {
    this.value = value;
    return this;
  }
}
