package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PenAlignmentValueModel;

/**
 * This is a generated enum class.
 */
public class PenAlignmentValueBuilder {
  private PenAlignmentValueModel value;

  public PenAlignmentValueBuilder() {
  }

  public PenAlignmentValueBuilder setValue(PenAlignmentValueModel value) {
    this.value = value;
    return this;
  }

  public PenAlignmentValueBuilder from(PenAlignmentValueModel value) {
    this.value = value;
    return this;
  }

  public PenAlignmentValueModel build() {
    return this.value;
  }
}
