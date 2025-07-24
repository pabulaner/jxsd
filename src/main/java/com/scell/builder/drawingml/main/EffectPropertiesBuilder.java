package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.EffectContainerModel;
import com.scell.model.drawingml.main.EffectListModel;
import com.scell.model.drawingml.main.EffectPropertiesModel;
import java.lang.Object;

public class EffectPropertiesBuilder {
  private int type;

  private Object value;

  public EffectPropertiesBuilder() {
    this.type = -1;
    this.value = null;
  }

  public EffectPropertiesBuilder setEffectLst(EffectListModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public EffectPropertiesBuilder setEffectDag(EffectContainerModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public EffectPropertiesModel build() {
    if (this.type == -1) return new EffectPropertiesModel();
    if (this.type == 0) return EffectPropertiesModel.newEffectLst((EffectListModel) this.value);
    if (this.type == 1) return EffectPropertiesModel.newEffectDag((EffectContainerModel) this.value);
    return null;
  }

  public EffectPropertiesBuilder from(EffectPropertiesModel value) {
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
