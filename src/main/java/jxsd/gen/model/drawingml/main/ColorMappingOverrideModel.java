package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.main.ColorMappingOverrideBuilder;

/**
 * This is a generated choice class.
 */
public class ColorMappingOverrideModel {
  private final int type;

  private final Object value;

  public ColorMappingOverrideModel() {
    this(-1, null);
  }

  private ColorMappingOverrideModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public ColorMappingOverrideBuilder builder() {
    return new ColorMappingOverrideBuilder().from(this);
  }

  public static ColorMappingOverrideModel newMasterClrMapping(EmptyElementModel value) {
    return new ColorMappingOverrideModel(0, value);
  }

  public boolean isMasterClrMapping() {
    return this.type == 0;
  }

  public EmptyElementModel getMasterClrMapping() {
    return (EmptyElementModel) this.value;
  }

  public static ColorMappingOverrideModel newOverrideClrMapping(ColorMappingModel value) {
    return new ColorMappingOverrideModel(1, value);
  }

  public boolean isOverrideClrMapping() {
    return this.type == 1;
  }

  public ColorMappingModel getOverrideClrMapping() {
    return (ColorMappingModel) this.value;
  }
}
