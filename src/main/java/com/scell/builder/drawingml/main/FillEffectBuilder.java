package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BlipFillPropertiesModel;
import com.scell.model.drawingml.main.FillEffectModel;
import com.scell.model.drawingml.main.GradientFillPropertiesModel;
import com.scell.model.drawingml.main.GroupFillPropertiesModel;
import com.scell.model.drawingml.main.NoFillPropertiesModel;
import com.scell.model.drawingml.main.PatternFillPropertiesModel;
import com.scell.model.drawingml.main.SolidColorFillPropertiesModel;
import java.lang.Object;

public class FillEffectBuilder {
  private int type;

  private Object value;

  public FillEffectBuilder() {
    this.type = -1;
    this.value = null;
  }

  public FillEffectBuilder setNoFill(NoFillPropertiesModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public FillEffectBuilder setSolidFill(SolidColorFillPropertiesModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public FillEffectBuilder setGradFill(GradientFillPropertiesModel value) {
    this.type = 2;
    this.value = value;
    return this;
  }

  public FillEffectBuilder setBlipFill(BlipFillPropertiesModel value) {
    this.type = 3;
    this.value = value;
    return this;
  }

  public FillEffectBuilder setPattFill(PatternFillPropertiesModel value) {
    this.type = 4;
    this.value = value;
    return this;
  }

  public FillEffectBuilder setGrpFill(GroupFillPropertiesModel value) {
    this.type = 5;
    this.value = value;
    return this;
  }

  public FillEffectModel build() {
    if (this.type == -1) return new FillEffectModel();
    if (this.type == 0) return FillEffectModel.newNoFill((NoFillPropertiesModel) this.value);
    if (this.type == 1) return FillEffectModel.newSolidFill((SolidColorFillPropertiesModel) this.value);
    if (this.type == 2) return FillEffectModel.newGradFill((GradientFillPropertiesModel) this.value);
    if (this.type == 3) return FillEffectModel.newBlipFill((BlipFillPropertiesModel) this.value);
    if (this.type == 4) return FillEffectModel.newPattFill((PatternFillPropertiesModel) this.value);
    if (this.type == 5) return FillEffectModel.newGrpFill((GroupFillPropertiesModel) this.value);
    return null;
  }

  public FillEffectBuilder from(FillEffectModel value) {
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
