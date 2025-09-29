package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.SystemColorValValueModel;

/**
 * This is a generated enum class.
 */
public class SystemColorValValueBuilder {
  private SystemColorValValueModel value;

  public SystemColorValValueBuilder() {
  }

  public SystemColorValValueBuilder setValue(SystemColorValValueModel value) {
    this.value = value;
    return this;
  }

  public SystemColorValValueBuilder from(SystemColorValValueModel value) {
    this.value = value;
    return this;
  }

  public SystemColorValValueModel build() {
    return this.value;
  }
}
