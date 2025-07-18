package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_FontCollectionIndexModel;

public class ST_FontCollectionIndexBuilder {
  private ST_FontCollectionIndexModel value;

  public ST_FontCollectionIndexBuilder() {
    this.value = null;
  }

  public ST_FontCollectionIndexBuilder from(ST_FontCollectionIndexModel value) {
    this.value = value;
    return this;
  }

  public ST_FontCollectionIndexModel build() {
    return this.value;
  }

  public ST_FontCollectionIndexBuilder setValue(ST_FontCollectionIndexModel value) {
    this.value = value;
    return this;
  }
}
