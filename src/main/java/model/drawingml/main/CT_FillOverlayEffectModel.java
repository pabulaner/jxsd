package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_FillOverlayEffectModel {
  private final ST_BlendModeModel blend;

  private final noFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  public CT_FillOverlayEffectModel(ST_BlendModeModel blend,
      noFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill) {
    this.blend = blend;
    this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
  }

  public ST_BlendModeModel getBlend() {
    return this.blend;
  }

  public noFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
    return this.noFillOrSolidFillOrGradFill;
  }

  public static class noFillOrSolidFillOrGradFillModel {
    private final int type;

    private final Object value;

    public noFillOrSolidFillOrGradFillModel() {
      this(-1, null);
    }

    private noFillOrSolidFillOrGradFillModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static noFillOrSolidFillOrGradFillModel newNoFill(CT_NoFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public CT_NoFillPropertiesModel getNoFill() {
      return (CT_NoFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newSolidFill(
        CT_SolidColorFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public CT_SolidColorFillPropertiesModel getSolidFill() {
      return (CT_SolidColorFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newGradFill(
        CT_GradientFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public CT_GradientFillPropertiesModel getGradFill() {
      return (CT_GradientFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newBlipFill(CT_BlipFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public CT_BlipFillPropertiesModel getBlipFill() {
      return (CT_BlipFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newPattFill(
        CT_PatternFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public CT_PatternFillPropertiesModel getPattFill() {
      return (CT_PatternFillPropertiesModel) this.value;
    }

    public static noFillOrSolidFillOrGradFillModel newGrpFill(CT_GroupFillPropertiesModel value) {
      return new noFillOrSolidFillOrGradFillModel(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public CT_GroupFillPropertiesModel getGrpFill() {
      return (CT_GroupFillPropertiesModel) this.value;
    }
  }
}
