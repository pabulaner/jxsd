package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTColorMappingOverrideModel {
  private final Integer type;

  private final Object value;

  public CTColorMappingOverrideModel() {
    this(-1, null);
  }

  private CTColorMappingOverrideModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTColorMappingOverrideModel newMasterClrMapping(CTEmptyElementModel value) {
    return new CTColorMappingOverrideModel(0, value);
  }

  public Boolean isMasterClrMapping() {
    return this.type == 0;
  }

  public CTEmptyElementModel getMasterClrMapping() {
    return (CTEmptyElementModel) this.value;
  }

  public static CTColorMappingOverrideModel newOverrideClrMapping(CTColorMappingModel value) {
    return new CTColorMappingOverrideModel(1, value);
  }

  public Boolean isOverrideClrMapping() {
    return this.type == 1;
  }

  public CTColorMappingModel getOverrideClrMapping() {
    return (CTColorMappingModel) this.value;
  }
}
