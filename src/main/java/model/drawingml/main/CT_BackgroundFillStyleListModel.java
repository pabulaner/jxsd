package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_BackgroundFillStyleListModel {
  private final int type;

  private final Object value;

  public CT_BackgroundFillStyleListModel() {
    this(-1, null);
  }

  private CT_BackgroundFillStyleListModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CT_BackgroundFillStyleListModel newNoFill(CT_NoFillPropertiesModel value) {
    return new CT_BackgroundFillStyleListModel(0, value);
  }

  public boolean isNoFill() {
    return this.type == 0;
  }

  public CT_NoFillPropertiesModel getNoFill() {
    return (CT_NoFillPropertiesModel) this.value;
  }

  public static CT_BackgroundFillStyleListModel newSolidFill(
      CT_SolidColorFillPropertiesModel value) {
    return new CT_BackgroundFillStyleListModel(1, value);
  }

  public boolean isSolidFill() {
    return this.type == 1;
  }

  public CT_SolidColorFillPropertiesModel getSolidFill() {
    return (CT_SolidColorFillPropertiesModel) this.value;
  }

  public static CT_BackgroundFillStyleListModel newGradFill(CT_GradientFillPropertiesModel value) {
    return new CT_BackgroundFillStyleListModel(2, value);
  }

  public boolean isGradFill() {
    return this.type == 2;
  }

  public CT_GradientFillPropertiesModel getGradFill() {
    return (CT_GradientFillPropertiesModel) this.value;
  }

  public static CT_BackgroundFillStyleListModel newBlipFill(CT_BlipFillPropertiesModel value) {
    return new CT_BackgroundFillStyleListModel(3, value);
  }

  public boolean isBlipFill() {
    return this.type == 3;
  }

  public CT_BlipFillPropertiesModel getBlipFill() {
    return (CT_BlipFillPropertiesModel) this.value;
  }

  public static CT_BackgroundFillStyleListModel newPattFill(CT_PatternFillPropertiesModel value) {
    return new CT_BackgroundFillStyleListModel(4, value);
  }

  public boolean isPattFill() {
    return this.type == 4;
  }

  public CT_PatternFillPropertiesModel getPattFill() {
    return (CT_PatternFillPropertiesModel) this.value;
  }

  public static CT_BackgroundFillStyleListModel newGrpFill(CT_GroupFillPropertiesModel value) {
    return new CT_BackgroundFillStyleListModel(5, value);
  }

  public boolean isGrpFill() {
    return this.type == 5;
  }

  public CT_GroupFillPropertiesModel getGrpFill() {
    return (CT_GroupFillPropertiesModel) this.value;
  }
}
