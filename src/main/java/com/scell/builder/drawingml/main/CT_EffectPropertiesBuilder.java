package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_EffectContainerModel;
import com.scell.model.drawingml.main.CT_EffectListModel;
import com.scell.model.drawingml.main.CT_EffectPropertiesModel;
import java.lang.Object;

public class CT_EffectPropertiesBuilder {
  private int type;

  private Object value;

  public CT_EffectPropertiesBuilder() {
    this.type = -1;
    this.value = null;
  }

  public CT_EffectPropertiesBuilder setEffectLst(CT_EffectListModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public CT_EffectPropertiesBuilder setEffectDag(CT_EffectContainerModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public CT_EffectPropertiesModel build() {
    if (this.type == -1) return new CT_EffectPropertiesModel();
    if (this.type == 0) return CT_EffectPropertiesModel.newEffectLst((CT_EffectListModel) this.value);
    if (this.type == 1) return CT_EffectPropertiesModel.newEffectDag((CT_EffectContainerModel) this.value);
    return null;
  }

  public CT_EffectPropertiesBuilder from(CT_EffectPropertiesModel value) {
    this.type = -1;
    this.value = null;
    if (value.isEffectLst()) {
      this.type = 0;
      this.value = value.getEffectLst();
    }
    if (value.isEffectDag()) {
      this.type = 1;
      this.value = value.getEffectDag();
    }
    return this;
  }
}
