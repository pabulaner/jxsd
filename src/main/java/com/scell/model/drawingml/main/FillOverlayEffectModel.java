package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class FillOverlayEffectModel {
  private final BlendModeModel blend;

  private final FillPropertiesModel egFillProperties;

  public FillOverlayEffectModel(BlendModeModel blend, FillPropertiesModel egFillProperties) {
    this.blend = blend;
    this.egFillProperties = egFillProperties;
  }

  public BlendModeModel getBlend() {
    return this.blend;
  }

  public FillPropertiesModel getEGFillProperties() {
    return this.egFillProperties;
  }

  public static class FillPropertiesModel {
    private final int type;

    private final Object value;

    public FillPropertiesModel() {
      this(-1, null);
    }

    private FillPropertiesModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static FillPropertiesModel newNoFill(NoFillPropertiesModel value) {
      return new FillPropertiesModel(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public NoFillPropertiesModel getNoFill() {
      return (NoFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newSolidFill(SolidColorFillPropertiesModel value) {
      return new FillPropertiesModel(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public SolidColorFillPropertiesModel getSolidFill() {
      return (SolidColorFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newGradFill(GradientFillPropertiesModel value) {
      return new FillPropertiesModel(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public GradientFillPropertiesModel getGradFill() {
      return (GradientFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newBlipFill(BlipFillPropertiesModel value) {
      return new FillPropertiesModel(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public BlipFillPropertiesModel getBlipFill() {
      return (BlipFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newPattFill(PatternFillPropertiesModel value) {
      return new FillPropertiesModel(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public PatternFillPropertiesModel getPattFill() {
      return (PatternFillPropertiesModel) this.value;
    }

    public static FillPropertiesModel newGrpFill(GroupFillPropertiesModel value) {
      return new FillPropertiesModel(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public GroupFillPropertiesModel getGrpFill() {
      return (GroupFillPropertiesModel) this.value;
    }
  }
}
