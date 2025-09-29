package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PresetLineDashPropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class PresetLineDashPropertiesModel {
  private final PresetLineDashValValueModel val;

  public PresetLineDashPropertiesModel(PresetLineDashValValueModel val) {
    this.val = val;
  }

  public PresetLineDashPropertiesBuilder builder() {
    return new PresetLineDashPropertiesBuilder().from(this);
  }

  public PresetLineDashValValueModel getVal() {
    return this.val;
  }
}
