package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_ColorMappingOverrideModel {
  private final int type;

  private final Object value;

  public CT_ColorMappingOverrideModel() {
    this(-1, null);
  }

  private CT_ColorMappingOverrideModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CT_ColorMappingOverrideModel newMasterClrMapping(CT_EmptyElementModel value) {
    return new CT_ColorMappingOverrideModel(0, value);
  }

  public boolean isMasterClrMapping() {
    return this.type == 0;
  }

  public CT_EmptyElementModel getMasterClrMapping() {
    return (CT_EmptyElementModel) this.value;
  }

  public static CT_ColorMappingOverrideModel newOverrideClrMapping(CT_ColorMappingModel value) {
    return new CT_ColorMappingOverrideModel(1, value);
  }

  public boolean isOverrideClrMapping() {
    return this.type == 1;
  }

  public CT_ColorMappingModel getOverrideClrMapping() {
    return (CT_ColorMappingModel) this.value;
  }
}
