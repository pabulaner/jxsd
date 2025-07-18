package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_GuidModel;

public class ST_GuidBuilder {
  private String value;

  public ST_GuidBuilder() {
    this.value = null;
  }

  public ST_GuidBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public ST_GuidBuilder from(ST_GuidModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_GuidModel build() {
    return new ST_GuidModel(this.value);
  }
}
