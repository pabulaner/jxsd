package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextIndentModel;

public class ST_TextIndentBuilder {
  private Long value;

  public ST_TextIndentBuilder() {
    this.value = null;
  }

  public ST_TextIndentBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_TextIndentBuilder from(ST_TextIndentModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_TextIndentModel build() {
    return new ST_TextIndentModel(this.value);
  }
}
