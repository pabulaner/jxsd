package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.LineEndLengthValueModel;

/**
 * This is a generated enum class.
 */
public class LineEndLengthValueBuilder {
  private LineEndLengthValueModel value;

  public LineEndLengthValueBuilder() {
  }

  public LineEndLengthValueBuilder setValue(LineEndLengthValueModel value) {
    this.value = value;
    return this;
  }

  public LineEndLengthValueBuilder from(LineEndLengthValueModel value) {
    this.value = value;
    return this;
  }

  public LineEndLengthValueModel build() {
    return this.value;
  }
}
