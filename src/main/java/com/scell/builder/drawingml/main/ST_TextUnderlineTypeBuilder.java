package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextUnderlineTypeModel;

public class ST_TextUnderlineTypeBuilder {
  private ST_TextUnderlineTypeModel value;

  public ST_TextUnderlineTypeBuilder() {
    this.value = null;
  }

  public ST_TextUnderlineTypeBuilder from(ST_TextUnderlineTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_TextUnderlineTypeModel build() {
    return this.value;
  }

  public ST_TextUnderlineTypeBuilder setValue(ST_TextUnderlineTypeModel value) {
    this.value = value;
    return this;
  }
}
