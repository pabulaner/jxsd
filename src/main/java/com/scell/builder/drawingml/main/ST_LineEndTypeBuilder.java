package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_LineEndTypeModel;

public class ST_LineEndTypeBuilder {
  private ST_LineEndTypeModel value;

  public ST_LineEndTypeBuilder() {
    this.value = null;
  }

  public ST_LineEndTypeBuilder from(ST_LineEndTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_LineEndTypeModel build() {
    return this.value;
  }

  public ST_LineEndTypeBuilder setValue(ST_LineEndTypeModel value) {
    this.value = value;
    return this;
  }
}
