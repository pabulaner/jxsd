package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTBackgroundFillStyleListModel {
  private final Integer type;

  private final Object value;

  public CTBackgroundFillStyleListModel() {
    this(-1, null);
  }

  private CTBackgroundFillStyleListModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTBackgroundFillStyleListModel newNoFill(CTNoFillPropertiesModel value) {
    return new CTBackgroundFillStyleListModel(0, value);
  }

  public Boolean isNoFill() {
    return this.type == 0;
  }

  public CTNoFillPropertiesModel getNoFill() {
    return (CTNoFillPropertiesModel) this.value;
  }

  public static CTBackgroundFillStyleListModel newSolidFill(CTSolidColorFillPropertiesModel value) {
    return new CTBackgroundFillStyleListModel(1, value);
  }

  public Boolean isSolidFill() {
    return this.type == 1;
  }

  public CTSolidColorFillPropertiesModel getSolidFill() {
    return (CTSolidColorFillPropertiesModel) this.value;
  }

  public static CTBackgroundFillStyleListModel newGradFill(CTGradientFillPropertiesModel value) {
    return new CTBackgroundFillStyleListModel(2, value);
  }

  public Boolean isGradFill() {
    return this.type == 2;
  }

  public CTGradientFillPropertiesModel getGradFill() {
    return (CTGradientFillPropertiesModel) this.value;
  }

  public static CTBackgroundFillStyleListModel newBlipFill(CTBlipFillPropertiesModel value) {
    return new CTBackgroundFillStyleListModel(3, value);
  }

  public Boolean isBlipFill() {
    return this.type == 3;
  }

  public CTBlipFillPropertiesModel getBlipFill() {
    return (CTBlipFillPropertiesModel) this.value;
  }

  public static CTBackgroundFillStyleListModel newPattFill(CTPatternFillPropertiesModel value) {
    return new CTBackgroundFillStyleListModel(4, value);
  }

  public Boolean isPattFill() {
    return this.type == 4;
  }

  public CTPatternFillPropertiesModel getPattFill() {
    return (CTPatternFillPropertiesModel) this.value;
  }

  public static CTBackgroundFillStyleListModel newGrpFill(CTGroupFillPropertiesModel value) {
    return new CTBackgroundFillStyleListModel(5, value);
  }

  public Boolean isGrpFill() {
    return this.type == 5;
  }

  public CTGroupFillPropertiesModel getGrpFill() {
    return (CTGroupFillPropertiesModel) this.value;
  }
}
