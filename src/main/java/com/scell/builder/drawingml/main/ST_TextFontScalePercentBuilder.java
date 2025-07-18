package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextFontScalePercentModel;

public class ST_TextFontScalePercentBuilder {
  private Long value;

  public ST_TextFontScalePercentBuilder() {
    this.value = null;
  }

  public ST_TextFontScalePercentBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_TextFontScalePercentBuilder from(ST_TextFontScalePercentModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_TextFontScalePercentModel build() {
    return new ST_TextFontScalePercentModel(this.value);
  }
}
