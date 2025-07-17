package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextAnchoringTypeModel;

public class ST_TextAnchoringTypeBuilder {
  private ST_TextAnchoringTypeModel value;

  public ST_TextAnchoringTypeBuilder() {
    this.value = null;
  }

  public ST_TextAnchoringTypeBuilder from(ST_TextAnchoringTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_TextAnchoringTypeModel build() {
    return this.value;
  }

  public ST_TextAnchoringTypeBuilder setValue(ST_TextAnchoringTypeModel value) {
    this.value = value;
    return this;
  }
}
