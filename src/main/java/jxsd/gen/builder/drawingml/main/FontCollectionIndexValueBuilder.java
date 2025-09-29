package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.FontCollectionIndexValueModel;

/**
 * This is a generated enum class.
 */
public class FontCollectionIndexValueBuilder {
  private FontCollectionIndexValueModel value;

  public FontCollectionIndexValueBuilder() {
  }

  public FontCollectionIndexValueBuilder setValue(FontCollectionIndexValueModel value) {
    this.value = value;
    return this;
  }

  public FontCollectionIndexValueBuilder from(FontCollectionIndexValueModel value) {
    this.value = value;
    return this;
  }

  public FontCollectionIndexValueModel build() {
    return this.value;
  }
}
