package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.EffectContainerTypeValueModel;

/**
 * This is a generated enum class.
 */
public class EffectContainerTypeValueBuilder {
  private EffectContainerTypeValueModel value;

  public EffectContainerTypeValueBuilder() {
  }

  public EffectContainerTypeValueBuilder setValue(EffectContainerTypeValueModel value) {
    this.value = value;
    return this;
  }

  public EffectContainerTypeValueBuilder from(EffectContainerTypeValueModel value) {
    this.value = value;
    return this;
  }

  public EffectContainerTypeValueModel build() {
    return this.value;
  }
}
