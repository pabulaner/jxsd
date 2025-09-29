package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BevelPresetTypeValueModel;

/**
 * This is a generated enum class.
 */
public class BevelPresetTypeValueBuilder {
  private BevelPresetTypeValueModel value;

  public BevelPresetTypeValueBuilder() {
  }

  public BevelPresetTypeValueBuilder setValue(BevelPresetTypeValueModel value) {
    this.value = value;
    return this;
  }

  public BevelPresetTypeValueBuilder from(BevelPresetTypeValueModel value) {
    this.value = value;
    return this;
  }

  public BevelPresetTypeValueModel build() {
    return this.value;
  }
}
