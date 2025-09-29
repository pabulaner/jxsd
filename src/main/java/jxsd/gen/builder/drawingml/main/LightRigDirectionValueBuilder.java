package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.LightRigDirectionValueModel;

/**
 * This is a generated enum class.
 */
public class LightRigDirectionValueBuilder {
  private LightRigDirectionValueModel value;

  public LightRigDirectionValueBuilder() {
  }

  public LightRigDirectionValueBuilder setValue(LightRigDirectionValueModel value) {
    this.value = value;
    return this;
  }

  public LightRigDirectionValueBuilder from(LightRigDirectionValueModel value) {
    this.value = value;
    return this;
  }

  public LightRigDirectionValueModel build() {
    return this.value;
  }
}
