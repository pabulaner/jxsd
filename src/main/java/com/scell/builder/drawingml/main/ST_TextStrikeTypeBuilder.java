package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextStrikeTypeModel;

public class ST_TextStrikeTypeBuilder {
  private ST_TextStrikeTypeModel value;

  public ST_TextStrikeTypeBuilder() {
    this.value = null;
  }

  public ST_TextStrikeTypeBuilder from(ST_TextStrikeTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_TextStrikeTypeModel build() {
    return this.value;
  }

  public ST_TextStrikeTypeBuilder setValue(ST_TextStrikeTypeModel value) {
    this.value = value;
    return this;
  }
}
