package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BlendModeValueModel;

/**
 * This is a generated enum class.
 */
public class BlendModeValueBuilder {
  private BlendModeValueModel value;

  public BlendModeValueBuilder() {
  }

  public BlendModeValueBuilder setValue(BlendModeValueModel value) {
    this.value = value;
    return this;
  }

  public BlendModeValueBuilder from(BlendModeValueModel value) {
    this.value = value;
    return this;
  }

  public BlendModeValueModel build() {
    return this.value;
  }
}
