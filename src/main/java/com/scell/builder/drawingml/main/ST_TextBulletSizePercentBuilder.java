package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextBulletSizePercentModel;

public class ST_TextBulletSizePercentBuilder {
  private Long value;

  public ST_TextBulletSizePercentBuilder() {
    this.value = null;
  }

  public ST_TextBulletSizePercentBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_TextBulletSizePercentBuilder from(ST_TextBulletSizePercentModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_TextBulletSizePercentModel build() {
    return new ST_TextBulletSizePercentModel(this.value);
  }
}
