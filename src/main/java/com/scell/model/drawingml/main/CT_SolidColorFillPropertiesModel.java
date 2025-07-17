package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_SolidColorFillPropertiesModel {
  private final int type;

  private final Object value;

  public CT_SolidColorFillPropertiesModel() {
    this(-1, null);
  }

  private CT_SolidColorFillPropertiesModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CT_SolidColorFillPropertiesModel newScrgbClr(CT_ScRgbColorModel value) {
    return new CT_SolidColorFillPropertiesModel(0, value);
  }

  public boolean isScrgbClr() {
    return this.type == 0;
  }

  public CT_ScRgbColorModel getScrgbClr() {
    return (CT_ScRgbColorModel) this.value;
  }

  public static CT_SolidColorFillPropertiesModel newSrgbClr(CT_SRgbColorModel value) {
    return new CT_SolidColorFillPropertiesModel(1, value);
  }

  public boolean isSrgbClr() {
    return this.type == 1;
  }

  public CT_SRgbColorModel getSrgbClr() {
    return (CT_SRgbColorModel) this.value;
  }

  public static CT_SolidColorFillPropertiesModel newHslClr(CT_HslColorModel value) {
    return new CT_SolidColorFillPropertiesModel(2, value);
  }

  public boolean isHslClr() {
    return this.type == 2;
  }

  public CT_HslColorModel getHslClr() {
    return (CT_HslColorModel) this.value;
  }

  public static CT_SolidColorFillPropertiesModel newSysClr(CT_SystemColorModel value) {
    return new CT_SolidColorFillPropertiesModel(3, value);
  }

  public boolean isSysClr() {
    return this.type == 3;
  }

  public CT_SystemColorModel getSysClr() {
    return (CT_SystemColorModel) this.value;
  }

  public static CT_SolidColorFillPropertiesModel newSchemeClr(CT_SchemeColorModel value) {
    return new CT_SolidColorFillPropertiesModel(4, value);
  }

  public boolean isSchemeClr() {
    return this.type == 4;
  }

  public CT_SchemeColorModel getSchemeClr() {
    return (CT_SchemeColorModel) this.value;
  }

  public static CT_SolidColorFillPropertiesModel newPrstClr(CT_PresetColorModel value) {
    return new CT_SolidColorFillPropertiesModel(5, value);
  }

  public boolean isPrstClr() {
    return this.type == 5;
  }

  public CT_PresetColorModel getPrstClr() {
    return (CT_PresetColorModel) this.value;
  }
}
