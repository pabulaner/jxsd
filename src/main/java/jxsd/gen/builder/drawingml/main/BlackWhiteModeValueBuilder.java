package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BlackWhiteModeValueModel;

/**
 * This is a generated enum class.
 */
public class BlackWhiteModeValueBuilder {
  private BlackWhiteModeValueModel value;

  public BlackWhiteModeValueBuilder() {
  }

  public BlackWhiteModeValueBuilder setValue(BlackWhiteModeValueModel value) {
    this.value = value;
    return this;
  }

  public BlackWhiteModeValueBuilder from(BlackWhiteModeValueModel value) {
    this.value = value;
    return this;
  }

  public BlackWhiteModeValueModel build() {
    return this.value;
  }
}
