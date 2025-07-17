package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_SchemeColorValModel;

public class ST_SchemeColorValBuilder {
  private ST_SchemeColorValModel value;

  public ST_SchemeColorValBuilder() {
    this.value = null;
  }

  public ST_SchemeColorValBuilder from(ST_SchemeColorValModel value) {
    this.value = value;
    return this;
  }

  public ST_SchemeColorValModel build() {
    return this.value;
  }

  public ST_SchemeColorValBuilder setValue(ST_SchemeColorValModel value) {
    this.value = value;
    return this;
  }
}
