package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.LineEndWidthValueModel;

/**
 * This is a generated enum class.
 */
public class LineEndWidthValueBuilder {
  private LineEndWidthValueModel value;

  public LineEndWidthValueBuilder() {
  }

  public LineEndWidthValueBuilder setValue(LineEndWidthValueModel value) {
    this.value = value;
    return this;
  }

  public LineEndWidthValueBuilder from(LineEndWidthValueModel value) {
    this.value = value;
    return this;
  }

  public LineEndWidthValueModel build() {
    return this.value;
  }
}
