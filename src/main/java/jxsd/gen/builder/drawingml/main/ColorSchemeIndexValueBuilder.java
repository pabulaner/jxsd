package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.ColorSchemeIndexValueModel;

/**
 * This is a generated enum class.
 */
public class ColorSchemeIndexValueBuilder {
  private ColorSchemeIndexValueModel value;

  public ColorSchemeIndexValueBuilder() {
  }

  public ColorSchemeIndexValueBuilder setValue(ColorSchemeIndexValueModel value) {
    this.value = value;
    return this;
  }

  public ColorSchemeIndexValueBuilder from(ColorSchemeIndexValueModel value) {
    this.value = value;
    return this;
  }

  public ColorSchemeIndexValueModel build() {
    return this.value;
  }
}
