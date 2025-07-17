package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_LineEndLengthModel;

public class ST_LineEndLengthBuilder {
  private ST_LineEndLengthModel value;

  public ST_LineEndLengthBuilder() {
    this.value = null;
  }

  public ST_LineEndLengthBuilder from(ST_LineEndLengthModel value) {
    this.value = value;
    return this;
  }

  public ST_LineEndLengthModel build() {
    return this.value;
  }

  public ST_LineEndLengthBuilder setValue(ST_LineEndLengthModel value) {
    this.value = value;
    return this;
  }
}
