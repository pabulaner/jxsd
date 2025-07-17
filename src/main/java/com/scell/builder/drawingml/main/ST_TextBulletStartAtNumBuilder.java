package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextBulletStartAtNumModel;

public class ST_TextBulletStartAtNumBuilder {
  private Long value;

  public ST_TextBulletStartAtNumBuilder() {
    this.value = null;
  }

  public ST_TextBulletStartAtNumBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_TextBulletStartAtNumBuilder from(ST_TextBulletStartAtNumModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_TextBulletStartAtNumModel build() {
    return new ST_TextBulletStartAtNumModel(this.value);
  }
}
