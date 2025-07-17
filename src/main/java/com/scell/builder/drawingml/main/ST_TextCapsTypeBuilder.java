package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextCapsTypeModel;

public class ST_TextCapsTypeBuilder {
  private ST_TextCapsTypeModel value;

  public ST_TextCapsTypeBuilder() {
    this.value = null;
  }

  public ST_TextCapsTypeBuilder from(ST_TextCapsTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_TextCapsTypeModel build() {
    return this.value;
  }

  public ST_TextCapsTypeBuilder setValue(ST_TextCapsTypeModel value) {
    this.value = value;
    return this;
  }
}
