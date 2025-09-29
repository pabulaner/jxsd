package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.ColorMappingModel;
import jxsd.gen.model.drawingml.main.ColorMappingOverrideModel;
import jxsd.gen.model.drawingml.main.EmptyElementModel;

/**
 * This is a generated choice class.
 */
public class ColorMappingOverrideBuilder {
  private int type;

  private Object value;

  public ColorMappingOverrideBuilder() {
    this.type = -1;
    this.value = null;
  }

  public ColorMappingOverrideBuilder setMasterClrMapping(EmptyElementModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public ColorMappingOverrideBuilder setOverrideClrMapping(ColorMappingModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public ColorMappingOverrideBuilder from(ColorMappingOverrideModel value) {
    this.type = -1;
    this.value = null;
    if (value.isMasterClrMapping()) {
      this.type = 0;
      this.value = value.getMasterClrMapping();
    }
    if (value.isOverrideClrMapping()) {
      this.type = 1;
      this.value = value.getOverrideClrMapping();
    }
    return this;
  }

  public ColorMappingOverrideModel build() {
    if (this.type == -1) return new ColorMappingOverrideModel();
    if (this.type == 0) return ColorMappingOverrideModel.newMasterClrMapping((EmptyElementModel) this.value);
    if (this.type == 1) return ColorMappingOverrideModel.newOverrideClrMapping((ColorMappingModel) this.value);
    return null;
  }
}
