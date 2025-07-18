package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_BlipFillPropertiesModel;
import com.scell.model.drawingml.main.CT_FillPropertiesModel;
import com.scell.model.drawingml.main.CT_GradientFillPropertiesModel;
import com.scell.model.drawingml.main.CT_GroupFillPropertiesModel;
import com.scell.model.drawingml.main.CT_NoFillPropertiesModel;
import com.scell.model.drawingml.main.CT_PatternFillPropertiesModel;
import com.scell.model.drawingml.main.CT_SolidColorFillPropertiesModel;
import java.lang.Object;

public class CT_FillPropertiesBuilder {
  private int type;

  private Object value;

  public CT_FillPropertiesBuilder() {
    this.type = -1;
    this.value = null;
  }

  public CT_FillPropertiesBuilder setNoFill(CT_NoFillPropertiesModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public CT_FillPropertiesBuilder setSolidFill(CT_SolidColorFillPropertiesModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public CT_FillPropertiesBuilder setGradFill(CT_GradientFillPropertiesModel value) {
    this.type = 2;
    this.value = value;
    return this;
  }

  public CT_FillPropertiesBuilder setBlipFill(CT_BlipFillPropertiesModel value) {
    this.type = 3;
    this.value = value;
    return this;
  }

  public CT_FillPropertiesBuilder setPattFill(CT_PatternFillPropertiesModel value) {
    this.type = 4;
    this.value = value;
    return this;
  }

  public CT_FillPropertiesBuilder setGrpFill(CT_GroupFillPropertiesModel value) {
    this.type = 5;
    this.value = value;
    return this;
  }

  public CT_FillPropertiesModel build() {
    if (this.type == -1) return new CT_FillPropertiesModel();
    if (this.type == 0) return CT_FillPropertiesModel.newNoFill((CT_NoFillPropertiesModel) this.value);
    if (this.type == 1) return CT_FillPropertiesModel.newSolidFill((CT_SolidColorFillPropertiesModel) this.value);
    if (this.type == 2) return CT_FillPropertiesModel.newGradFill((CT_GradientFillPropertiesModel) this.value);
    if (this.type == 3) return CT_FillPropertiesModel.newBlipFill((CT_BlipFillPropertiesModel) this.value);
    if (this.type == 4) return CT_FillPropertiesModel.newPattFill((CT_PatternFillPropertiesModel) this.value);
    if (this.type == 5) return CT_FillPropertiesModel.newGrpFill((CT_GroupFillPropertiesModel) this.value);
    return null;
  }

  public CT_FillPropertiesBuilder from(CT_FillPropertiesModel value) {
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
