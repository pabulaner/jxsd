package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_FillStyleListModel {
  private final int type;

  private final Object value;

  public CT_FillStyleListModel() {
    this(-1, null);
  }

  private CT_FillStyleListModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CT_FillStyleListModel newNoFill(CT_NoFillPropertiesModel value) {
    return new CT_FillStyleListModel(0, value);
  }

  public boolean isNoFill() {
    return this.type == 0;
  }

  public CT_NoFillPropertiesModel getNoFill() {
    return (CT_NoFillPropertiesModel) this.value;
  }

  public static CT_FillStyleListModel newSolidFill(CT_SolidColorFillPropertiesModel value) {
    return new CT_FillStyleListModel(1, value);
  }

  public boolean isSolidFill() {
    return this.type == 1;
  }

  public CT_SolidColorFillPropertiesModel getSolidFill() {
    return (CT_SolidColorFillPropertiesModel) this.value;
  }

  public static CT_FillStyleListModel newGradFill(CT_GradientFillPropertiesModel value) {
    return new CT_FillStyleListModel(2, value);
  }

  public boolean isGradFill() {
    return this.type == 2;
  }

  public CT_GradientFillPropertiesModel getGradFill() {
    return (CT_GradientFillPropertiesModel) this.value;
  }

  public static CT_FillStyleListModel newBlipFill(CT_BlipFillPropertiesModel value) {
    return new CT_FillStyleListModel(3, value);
  }

  public boolean isBlipFill() {
    return this.type == 3;
  }

  public CT_BlipFillPropertiesModel getBlipFill() {
    return (CT_BlipFillPropertiesModel) this.value;
  }

  public static CT_FillStyleListModel newPattFill(CT_PatternFillPropertiesModel value) {
    return new CT_FillStyleListModel(4, value);
  }

  public boolean isPattFill() {
    return this.type == 4;
  }

  public CT_PatternFillPropertiesModel getPattFill() {
    return (CT_PatternFillPropertiesModel) this.value;
  }

  public static CT_FillStyleListModel newGrpFill(CT_GroupFillPropertiesModel value) {
    return new CT_FillStyleListModel(5, value);
  }

  public boolean isGrpFill() {
    return this.type == 5;
  }

  public CT_GroupFillPropertiesModel getGrpFill() {
    return (CT_GroupFillPropertiesModel) this.value;
  }
}
