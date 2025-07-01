package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTTextUnderlineFillGroupWrapperModel {
  private final Integer type;

  private final Object value;

  public CTTextUnderlineFillGroupWrapperModel() {
    this(-1, null);
  }

  private CTTextUnderlineFillGroupWrapperModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTTextUnderlineFillGroupWrapperModel newNoFill(CTNoFillPropertiesModel value) {
    return new CTTextUnderlineFillGroupWrapperModel(0, value);
  }

  public Boolean isNoFill() {
    return this.type == 0;
  }

  public CTNoFillPropertiesModel getNoFill() {
    return (CTNoFillPropertiesModel) this.value;
  }

  public static CTTextUnderlineFillGroupWrapperModel newSolidFill(
      CTSolidColorFillPropertiesModel value) {
    return new CTTextUnderlineFillGroupWrapperModel(1, value);
  }

  public Boolean isSolidFill() {
    return this.type == 1;
  }

  public CTSolidColorFillPropertiesModel getSolidFill() {
    return (CTSolidColorFillPropertiesModel) this.value;
  }

  public static CTTextUnderlineFillGroupWrapperModel newGradFill(
      CTGradientFillPropertiesModel value) {
    return new CTTextUnderlineFillGroupWrapperModel(2, value);
  }

  public Boolean isGradFill() {
    return this.type == 2;
  }

  public CTGradientFillPropertiesModel getGradFill() {
    return (CTGradientFillPropertiesModel) this.value;
  }

  public static CTTextUnderlineFillGroupWrapperModel newBlipFill(CTBlipFillPropertiesModel value) {
    return new CTTextUnderlineFillGroupWrapperModel(3, value);
  }

  public Boolean isBlipFill() {
    return this.type == 3;
  }

  public CTBlipFillPropertiesModel getBlipFill() {
    return (CTBlipFillPropertiesModel) this.value;
  }

  public static CTTextUnderlineFillGroupWrapperModel newPattFill(
      CTPatternFillPropertiesModel value) {
    return new CTTextUnderlineFillGroupWrapperModel(4, value);
  }

  public Boolean isPattFill() {
    return this.type == 4;
  }

  public CTPatternFillPropertiesModel getPattFill() {
    return (CTPatternFillPropertiesModel) this.value;
  }

  public static CTTextUnderlineFillGroupWrapperModel newGrpFill(CTGroupFillPropertiesModel value) {
    return new CTTextUnderlineFillGroupWrapperModel(5, value);
  }

  public Boolean isGrpFill() {
    return this.type == 5;
  }

  public CTGroupFillPropertiesModel getGrpFill() {
    return (CTGroupFillPropertiesModel) this.value;
  }
}
