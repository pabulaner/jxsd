package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FontCollectionIndexValueModel;

public class FontCollectionIndexValueBuilder {
  private FontCollectionIndexValueModel value;

  public FontCollectionIndexValueBuilder() {
    this.value = null;
  }

  public FontCollectionIndexValueBuilder from(FontCollectionIndexValueModel value) {
    this.value = value;
    return this;
  }

  public FontCollectionIndexValueModel build() {
    return this.value;
  }

  public FontCollectionIndexValueBuilder setValue(FontCollectionIndexValueModel value) {
    this.value = value;
    return this;
  }
}
