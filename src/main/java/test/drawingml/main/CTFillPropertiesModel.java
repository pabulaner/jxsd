package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTFillPropertiesModel {
  private final Integer type;

  private final Object value;

  public CTFillPropertiesModel() {
    this(-1, null);
  }

  private CTFillPropertiesModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTFillPropertiesModel newNoFill(CTNoFillPropertiesModel value) {
    return new CTFillPropertiesModel(0, value);
  }

  public Boolean isNoFill() {
    return this.type == 0;
  }

  public CTNoFillPropertiesModel getNoFill() {
    return (CTNoFillPropertiesModel) this.value;
  }

  public static CTFillPropertiesModel newSolidFill(CTSolidColorFillPropertiesModel value) {
    return new CTFillPropertiesModel(1, value);
  }

  public Boolean isSolidFill() {
    return this.type == 1;
  }

  public CTSolidColorFillPropertiesModel getSolidFill() {
    return (CTSolidColorFillPropertiesModel) this.value;
  }

  public static CTFillPropertiesModel newGradFill(CTGradientFillPropertiesModel value) {
    return new CTFillPropertiesModel(2, value);
  }

  public Boolean isGradFill() {
    return this.type == 2;
  }

  public CTGradientFillPropertiesModel getGradFill() {
    return (CTGradientFillPropertiesModel) this.value;
  }

  public static CTFillPropertiesModel newBlipFill(CTBlipFillPropertiesModel value) {
    return new CTFillPropertiesModel(3, value);
  }

  public Boolean isBlipFill() {
    return this.type == 3;
  }

  public CTBlipFillPropertiesModel getBlipFill() {
    return (CTBlipFillPropertiesModel) this.value;
  }

  public static CTFillPropertiesModel newPattFill(CTPatternFillPropertiesModel value) {
    return new CTFillPropertiesModel(4, value);
  }

  public Boolean isPattFill() {
    return this.type == 4;
  }

  public CTPatternFillPropertiesModel getPattFill() {
    return (CTPatternFillPropertiesModel) this.value;
  }

  public static CTFillPropertiesModel newGrpFill(CTGroupFillPropertiesModel value) {
    return new CTFillPropertiesModel(5, value);
  }

  public Boolean isGrpFill() {
    return this.type == 5;
  }

  public CTGroupFillPropertiesModel getGrpFill() {
    return (CTGroupFillPropertiesModel) this.value;
  }
}
