package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_FillOverlayEffectModel {
  private final ST_BlendModeModel blend;

  private final NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  public CT_FillOverlayEffectModel(ST_BlendModeModel blend,
      NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill) {
    this.blend = blend;
    this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
  }

  public ST_BlendModeModel getBlend() {
    return this.blend;
  }

  public NoFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
    return this.noFillOrSolidFillOrGradFill;
  }

  public static class NoFillOrSolidFillOrGradFillModel {
    private final int type;

    private final Object value;

    public NoFillOrSolidFillOrGradFillModel() {
      this(-1, null);
    }

    private NoFillOrSolidFillOrGradFillModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static NoFillOrSolidFillOrGradFillModel newNoFill(CT_NoFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public CT_NoFillPropertiesModel getNoFill() {
      return (CT_NoFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newSolidFill(
        CT_SolidColorFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public CT_SolidColorFillPropertiesModel getSolidFill() {
      return (CT_SolidColorFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newGradFill(
        CT_GradientFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public CT_GradientFillPropertiesModel getGradFill() {
      return (CT_GradientFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newBlipFill(CT_BlipFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public CT_BlipFillPropertiesModel getBlipFill() {
      return (CT_BlipFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newPattFill(
        CT_PatternFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public CT_PatternFillPropertiesModel getPattFill() {
      return (CT_PatternFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newGrpFill(CT_GroupFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public CT_GroupFillPropertiesModel getGrpFill() {
      return (CT_GroupFillPropertiesModel) this.value;
    }
  }
}
