package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorMappingModel;
import com.scell.model.drawingml.main.CT_ColorMappingOverrideModel;
import com.scell.model.drawingml.main.CT_EmptyElementModel;
import java.lang.Object;

public class CT_ColorMappingOverrideBuilder {
  private int type;

  private Object value;

  public CT_ColorMappingOverrideBuilder() {
    this.type = -1;
    this.value = null;
  }

  public CT_ColorMappingOverrideBuilder setMasterClrMapping(CT_EmptyElementModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public CT_ColorMappingOverrideBuilder setOverrideClrMapping(CT_ColorMappingModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public CT_ColorMappingOverrideModel build() {
    if (this.type == -1) return new CT_ColorMappingOverrideModel();
    if (this.type == 0) return CT_ColorMappingOverrideModel.newMasterClrMapping((CT_EmptyElementModel) this.value);
    if (this.type == 1) return CT_ColorMappingOverrideModel.newOverrideClrMapping((CT_ColorMappingModel) this.value);
    return null;
  }

  public CT_ColorMappingOverrideBuilder from(CT_ColorMappingOverrideModel value) {
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
}
