package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.LineCapValueModel;

/**
 * This is a generated enum class.
 */
public class LineCapValueBuilder {
  private LineCapValueModel value;

  public LineCapValueBuilder() {
  }

  public LineCapValueBuilder setValue(LineCapValueModel value) {
    this.value = value;
    return this;
  }

  public LineCapValueBuilder from(LineCapValueModel value) {
    this.value = value;
    return this;
  }

  public LineCapValueModel build() {
    return this.value;
  }
}
