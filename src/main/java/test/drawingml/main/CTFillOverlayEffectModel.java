package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTFillOverlayEffectModel {
  private final STBlendModeModel blend;

  private final NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;

  public CTFillOverlayEffectModel(STBlendModeModel blend,
      NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill) {
    this.blend = blend;
    this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
  }

  public STBlendModeModel getBlend() {
    return this.blend;
  }

  public NoFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
    return this.noFillOrSolidFillOrGradFill;
  }

  public static class NoFillOrSolidFillOrGradFillModel {
    private final Integer type;

    private final Object value;

    public NoFillOrSolidFillOrGradFillModel() {
      this(-1, null);
    }

    private NoFillOrSolidFillOrGradFillModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static NoFillOrSolidFillOrGradFillModel newNoFill(CTNoFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(0, value);
    }

    public Boolean isNoFill() {
      return this.type == 0;
    }

    public CTNoFillPropertiesModel getNoFill() {
      return (CTNoFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newSolidFill(
        CTSolidColorFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(1, value);
    }

    public Boolean isSolidFill() {
      return this.type == 1;
    }

    public CTSolidColorFillPropertiesModel getSolidFill() {
      return (CTSolidColorFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newGradFill(
        CTGradientFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(2, value);
    }

    public Boolean isGradFill() {
      return this.type == 2;
    }

    public CTGradientFillPropertiesModel getGradFill() {
      return (CTGradientFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newBlipFill(CTBlipFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(3, value);
    }

    public Boolean isBlipFill() {
      return this.type == 3;
    }

    public CTBlipFillPropertiesModel getBlipFill() {
      return (CTBlipFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newPattFill(CTPatternFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(4, value);
    }

    public Boolean isPattFill() {
      return this.type == 4;
    }

    public CTPatternFillPropertiesModel getPattFill() {
      return (CTPatternFillPropertiesModel) this.value;
    }

    public static NoFillOrSolidFillOrGradFillModel newGrpFill(CTGroupFillPropertiesModel value) {
      return new NoFillOrSolidFillOrGradFillModel(5, value);
    }

    public Boolean isGrpFill() {
      return this.type == 5;
    }

    public CTGroupFillPropertiesModel getGrpFill() {
      return (CTGroupFillPropertiesModel) this.value;
    }
  }
}
