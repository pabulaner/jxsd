package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PresetCameraTypeValueModel;

/**
 * This is a generated enum class.
 */
public class PresetCameraTypeValueBuilder {
  private PresetCameraTypeValueModel value;

  public PresetCameraTypeValueBuilder() {
  }

  public PresetCameraTypeValueBuilder setValue(PresetCameraTypeValueModel value) {
    this.value = value;
    return this;
  }

  public PresetCameraTypeValueBuilder from(PresetCameraTypeValueModel value) {
    this.value = value;
    return this;
  }

  public PresetCameraTypeValueModel build() {
    return this.value;
  }
}
