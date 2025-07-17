package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_BackgroundFillStyleListModel;
import com.scell.model.drawingml.main.CT_BlipFillPropertiesModel;
import com.scell.model.drawingml.main.CT_GradientFillPropertiesModel;
import com.scell.model.drawingml.main.CT_GroupFillPropertiesModel;
import com.scell.model.drawingml.main.CT_NoFillPropertiesModel;
import com.scell.model.drawingml.main.CT_PatternFillPropertiesModel;
import com.scell.model.drawingml.main.CT_SolidColorFillPropertiesModel;
import java.lang.Object;

public class CT_BackgroundFillStyleListBuilder {
  private int type;

  private Object value;

  public CT_BackgroundFillStyleListBuilder() {
    this.type = -1;
    this.value = null;
  }

  public CT_BackgroundFillStyleListBuilder setNoFill(CT_NoFillPropertiesModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public CT_BackgroundFillStyleListBuilder setSolidFill(CT_SolidColorFillPropertiesModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public CT_BackgroundFillStyleListBuilder setGradFill(CT_GradientFillPropertiesModel value) {
    this.type = 2;
    this.value = value;
    return this;
  }

  public CT_BackgroundFillStyleListBuilder setBlipFill(CT_BlipFillPropertiesModel value) {
    this.type = 3;
    this.value = value;
    return this;
  }

  public CT_BackgroundFillStyleListBuilder setPattFill(CT_PatternFillPropertiesModel value) {
    this.type = 4;
    this.value = value;
    return this;
  }

  public CT_BackgroundFillStyleListBuilder setGrpFill(CT_GroupFillPropertiesModel value) {
    this.type = 5;
    this.value = value;
    return this;
  }

  public CT_BackgroundFillStyleListModel build() {
    if (this.type == -1) return new CT_BackgroundFillStyleListModel();
    if (this.type == 0) return CT_BackgroundFillStyleListModel.newNoFill((CT_NoFillPropertiesModel) this.value);
    if (this.type == 1) return CT_BackgroundFillStyleListModel.newSolidFill((CT_SolidColorFillPropertiesModel) this.value);
    if (this.type == 2) return CT_BackgroundFillStyleListModel.newGradFill((CT_GradientFillPropertiesModel) this.value);
    if (this.type == 3) return CT_BackgroundFillStyleListModel.newBlipFill((CT_BlipFillPropertiesModel) this.value);
    if (this.type == 4) return CT_BackgroundFillStyleListModel.newPattFill((CT_PatternFillPropertiesModel) this.value);
    if (this.type == 5) return CT_BackgroundFillStyleListModel.newGrpFill((CT_GroupFillPropertiesModel) this.value);
    return null;
  }

  public CT_BackgroundFillStyleListBuilder from(CT_BackgroundFillStyleListModel value) {
    this.type = -1;
    this.value = null;
    if (value.isNoFill()) {
      this.type = 0;
      this.value = value.getNoFill();
    }
    if (value.isSolidFill()) {
      this.type = 1;
      this.value = value.getSolidFill();
    }
    if (value.isGradFill()) {
      this.type = 2;
      this.value = value.getGradFill();
    }
    if (value.isBlipFill()) {
      this.type = 3;
      this.value = value.getBlipFill();
    }
    if (value.isPattFill()) {
      this.type = 4;
      this.value = value.getPattFill();
    }
    if (value.isGrpFill()) {
      this.type = 5;
      this.value = value.getGrpFill();
    }
    return this;
  }
}
