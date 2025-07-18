package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextIndentLevelTypeModel;

public class ST_TextIndentLevelTypeBuilder {
  private Long value;

  public ST_TextIndentLevelTypeBuilder() {
    this.value = null;
  }

  public ST_TextIndentLevelTypeBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_TextIndentLevelTypeBuilder from(ST_TextIndentLevelTypeModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_TextIndentLevelTypeModel build() {
    return new ST_TextIndentLevelTypeModel(this.value);
  }
}
