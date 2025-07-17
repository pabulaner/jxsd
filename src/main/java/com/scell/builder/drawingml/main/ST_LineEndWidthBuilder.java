package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_LineEndWidthModel;

public class ST_LineEndWidthBuilder {
  private ST_LineEndWidthModel value;

  public ST_LineEndWidthBuilder() {
    this.value = null;
  }

  public ST_LineEndWidthBuilder from(ST_LineEndWidthModel value) {
    this.value = value;
    return this;
  }

  public ST_LineEndWidthModel build() {
    return this.value;
  }

  public ST_LineEndWidthBuilder setValue(ST_LineEndWidthModel value) {
    this.value = value;
    return this;
  }
}
