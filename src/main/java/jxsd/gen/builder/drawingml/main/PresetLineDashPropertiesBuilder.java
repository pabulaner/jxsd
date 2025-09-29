package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PresetLineDashPropertiesModel;
import jxsd.gen.model.drawingml.main.PresetLineDashValValueModel;

/**
 * This is a generated sequence class.
 */
public class PresetLineDashPropertiesBuilder {
  private PresetLineDashValValueModel val;

  public PresetLineDashPropertiesBuilder() {
  }

  public PresetLineDashPropertiesBuilder setVal(PresetLineDashValValueModel val) {
    this.val = val;
    return this;
  }

  public PresetLineDashPropertiesBuilder from(PresetLineDashPropertiesModel value) {
    this.val = value.getVal();
    return this;
  }

  public PresetLineDashPropertiesModel build() {
    return new PresetLineDashPropertiesModel(this.val);
  }
}
