package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class FillEffectModel {
  private final int type;

  private final Object value;

  public FillEffectModel() {
    this(-1, null);
  }

  private FillEffectModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static FillEffectModel newNoFill(NoFillPropertiesModel value) {
    return new FillEffectModel(0, value);
  }

  public boolean isNoFill() {
    return this.type == 0;
  }

  public NoFillPropertiesModel getNoFill() {
    return (NoFillPropertiesModel) this.value;
  }

  public static FillEffectModel newSolidFill(SolidColorFillPropertiesModel value) {
    return new FillEffectModel(1, value);
  }

  public boolean isSolidFill() {
    return this.type == 1;
  }

  public SolidColorFillPropertiesModel getSolidFill() {
    return (SolidColorFillPropertiesModel) this.value;
  }

  public static FillEffectModel newGradFill(GradientFillPropertiesModel value) {
    return new FillEffectModel(2, value);
  }

  public boolean isGradFill() {
    return this.type == 2;
  }

  public GradientFillPropertiesModel getGradFill() {
    return (GradientFillPropertiesModel) this.value;
  }

  public static FillEffectModel newBlipFill(BlipFillPropertiesModel value) {
    return new FillEffectModel(3, value);
  }

  public boolean isBlipFill() {
    return this.type == 3;
  }

  public BlipFillPropertiesModel getBlipFill() {
    return (BlipFillPropertiesModel) this.value;
  }

  public static FillEffectModel newPattFill(PatternFillPropertiesModel value) {
    return new FillEffectModel(4, value);
  }

  public boolean isPattFill() {
    return this.type == 4;
  }

  public PatternFillPropertiesModel getPattFill() {
    return (PatternFillPropertiesModel) this.value;
  }

  public static FillEffectModel newGrpFill(GroupFillPropertiesModel value) {
    return new FillEffectModel(5, value);
  }

  public boolean isGrpFill() {
    return this.type == 5;
  }

  public GroupFillPropertiesModel getGrpFill() {
    return (GroupFillPropertiesModel) this.value;
  }
}
