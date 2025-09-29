package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.LightRigTypeValueModel;

/**
 * This is a generated enum class.
 */
public class LightRigTypeValueBuilder {
  private LightRigTypeValueModel value;

  public LightRigTypeValueBuilder() {
  }

  public LightRigTypeValueBuilder setValue(LightRigTypeValueModel value) {
    this.value = value;
    return this;
  }

  public LightRigTypeValueBuilder from(LightRigTypeValueModel value) {
    this.value = value;
    return this;
  }

  public LightRigTypeValueModel build() {
    return this.value;
  }
}
