package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FontCollectionIndexModel;

public class FontCollectionIndexBuilder {
  private FontCollectionIndexModel value;

  public FontCollectionIndexBuilder() {
    this.value = null;
  }

  public FontCollectionIndexBuilder from(FontCollectionIndexModel value) {
    this.value = value;
    return this;
  }

  public FontCollectionIndexModel build() {
    return this.value;
  }

  public FontCollectionIndexBuilder setValue(FontCollectionIndexModel value) {
    this.value = value;
    return this;
  }
}
