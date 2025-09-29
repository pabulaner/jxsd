package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.RectAlignmentValueModel;

/**
 * This is a generated enum class.
 */
public class RectAlignmentValueBuilder {
  private RectAlignmentValueModel value;

  public RectAlignmentValueBuilder() {
  }

  public RectAlignmentValueBuilder setValue(RectAlignmentValueModel value) {
    this.value = value;
    return this;
  }

  public RectAlignmentValueBuilder from(RectAlignmentValueModel value) {
    this.value = value;
    return this;
  }

  public RectAlignmentValueModel build() {
    return this.value;
  }
}
