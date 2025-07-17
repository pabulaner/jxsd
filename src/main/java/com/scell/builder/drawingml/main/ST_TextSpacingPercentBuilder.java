package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextSpacingPercentModel;

public class ST_TextSpacingPercentBuilder {
  private Long value;

  public ST_TextSpacingPercentBuilder() {
    this.value = null;
  }

  public ST_TextSpacingPercentBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_TextSpacingPercentBuilder from(ST_TextSpacingPercentModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_TextSpacingPercentModel build() {
    return new ST_TextSpacingPercentModel(this.value);
  }
}
