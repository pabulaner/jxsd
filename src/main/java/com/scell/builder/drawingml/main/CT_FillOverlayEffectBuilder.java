package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_BlipFillPropertiesModel;
import com.scell.model.drawingml.main.CT_FillOverlayEffectModel;
import com.scell.model.drawingml.main.CT_GradientFillPropertiesModel;
import com.scell.model.drawingml.main.CT_GroupFillPropertiesModel;
import com.scell.model.drawingml.main.CT_NoFillPropertiesModel;
import com.scell.model.drawingml.main.CT_PatternFillPropertiesModel;
import com.scell.model.drawingml.main.CT_SolidColorFillPropertiesModel;
import com.scell.model.drawingml.main.ST_BlendModeModel;
import java.lang.Object;

public class CT_FillOverlayEffectBuilder {
  private ST_BlendModeModel blend;

  private CT_FillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  public CT_FillOverlayEffectBuilder() {
  }

  public CT_FillOverlayEffectBuilder setBlend(ST_BlendModeModel blend) {
    this.blend = blend;
    return this;
  }

  public CT_FillOverlayEffectBuilder setNoFillOrSolidFillOrGradFill(
      CT_FillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill) {
    this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
    return this;
  }

  public CT_FillOverlayEffectModel build() {
    return new CT_FillOverlayEffectModel(this.blend, this.noFillOrSolidFillOrGradFill);
  }

  public CT_FillOverlayEffectBuilder from(CT_FillOverlayEffectModel value) {
    this.blend = value.getBlend();
    this.noFillOrSolidFillOrGradFill = value.getNoFillOrSolidFillOrGradFill();
    return this;
  }

  public static class NoFillOrSolidFillOrGradFillBuilder {
    private int type;

    private Object value;

    public NoFillOrSolidFillOrGradFillBuilder() {
      this.type = -1;
      this.value = null;
    }

    public NoFillOrSolidFillOrGradFillBuilder setNoFill(CT_NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public NoFillOrSolidFillOrGradFillBuilder setSolidFill(CT_SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public NoFillOrSolidFillOrGradFillBuilder setGradFill(CT_GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public NoFillOrSolidFillOrGradFillBuilder setBlipFill(CT_BlipFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public NoFillOrSolidFillOrGradFillBuilder setPattFill(CT_PatternFillPropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public NoFillOrSolidFillOrGradFillBuilder setGrpFill(CT_GroupFillPropertiesModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public CT_FillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel build() {
      if (this.type == -1) return new CT_FillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel();
      if (this.type == 0) return CT_FillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel.newNoFill((CT_NoFillPropertiesModel) this.value);
      if (this.type == 1) return CT_FillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel.newSolidFill((CT_SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return CT_FillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel.newGradFill((CT_GradientFillPropertiesModel) this.value);
      if (this.type == 3) return CT_FillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel.newBlipFill((CT_BlipFillPropertiesModel) this.value);
      if (this.type == 4) return CT_FillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel.newPattFill((CT_PatternFillPropertiesModel) this.value);
      if (this.type == 5) return CT_FillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel.newGrpFill((CT_GroupFillPropertiesModel) this.value);
      return null;
    }

    public NoFillOrSolidFillOrGradFillBuilder from(
        CT_FillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel value) {
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
}
