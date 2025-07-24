package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class TextUnderlineFillGroupWrapperModel {
  private final int type;

  private final Object value;

  public TextUnderlineFillGroupWrapperModel() {
    this(-1, null);
  }

  private TextUnderlineFillGroupWrapperModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static TextUnderlineFillGroupWrapperModel newNoFill(NoFillPropertiesModel value) {
    return new TextUnderlineFillGroupWrapperModel(0, value);
  }

  public boolean isNoFill() {
    return this.type == 0;
  }

  public NoFillPropertiesModel getNoFill() {
    return (NoFillPropertiesModel) this.value;
  }

  public static TextUnderlineFillGroupWrapperModel newSolidFill(
      SolidColorFillPropertiesModel value) {
    return new TextUnderlineFillGroupWrapperModel(1, value);
  }

  public boolean isSolidFill() {
    return this.type == 1;
  }

  public SolidColorFillPropertiesModel getSolidFill() {
    return (SolidColorFillPropertiesModel) this.value;
  }

  public static TextUnderlineFillGroupWrapperModel newGradFill(GradientFillPropertiesModel value) {
    return new TextUnderlineFillGroupWrapperModel(2, value);
  }

  public boolean isGradFill() {
    return this.type == 2;
  }

  public GradientFillPropertiesModel getGradFill() {
    return (GradientFillPropertiesModel) this.value;
  }

  public static TextUnderlineFillGroupWrapperModel newBlipFill(BlipFillPropertiesModel value) {
    return new TextUnderlineFillGroupWrapperModel(3, value);
  }

  public boolean isBlipFill() {
    return this.type == 3;
  }

  public BlipFillPropertiesModel getBlipFill() {
    return (BlipFillPropertiesModel) this.value;
  }

  public static TextUnderlineFillGroupWrapperModel newPattFill(PatternFillPropertiesModel value) {
    return new TextUnderlineFillGroupWrapperModel(4, value);
  }

  public boolean isPattFill() {
    return this.type == 4;
  }

  public PatternFillPropertiesModel getPattFill() {
    return (PatternFillPropertiesModel) this.value;
  }

  public static TextUnderlineFillGroupWrapperModel newGrpFill(GroupFillPropertiesModel value) {
    return new TextUnderlineFillGroupWrapperModel(5, value);
  }

  public boolean isGrpFill() {
    return this.type == 5;
  }

  public GroupFillPropertiesModel getGrpFill() {
    return (GroupFillPropertiesModel) this.value;
  }
}
