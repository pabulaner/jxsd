package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextSpacingPointModel;

public class ST_TextSpacingPointBuilder {
  private Long value;

  public ST_TextSpacingPointBuilder() {
    this.value = null;
  }

  public ST_TextSpacingPointBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_TextSpacingPointBuilder from(ST_TextSpacingPointModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_TextSpacingPointModel build() {
    return new ST_TextSpacingPointModel(this.value);
  }
}
