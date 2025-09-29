package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.LineEndTypeValueModel;

/**
 * This is a generated enum class.
 */
public class LineEndTypeValueBuilder {
  private LineEndTypeValueModel value;

  public LineEndTypeValueBuilder() {
  }

  public LineEndTypeValueBuilder setValue(LineEndTypeValueModel value) {
    this.value = value;
    return this;
  }

  public LineEndTypeValueBuilder from(LineEndTypeValueModel value) {
    this.value = value;
    return this;
  }

  public LineEndTypeValueModel build() {
    return this.value;
  }
}
