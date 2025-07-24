package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class SolidColorFillPropertiesModel {
  private final int type;

  private final Object value;

  public SolidColorFillPropertiesModel() {
    this(-1, null);
  }

  private SolidColorFillPropertiesModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static SolidColorFillPropertiesModel newScrgbClr(ScRgbColorModel value) {
    return new SolidColorFillPropertiesModel(0, value);
  }

  public boolean isScrgbClr() {
    return this.type == 0;
  }

  public ScRgbColorModel getScrgbClr() {
    return (ScRgbColorModel) this.value;
  }

  public static SolidColorFillPropertiesModel newSrgbClr(SRgbColorModel value) {
    return new SolidColorFillPropertiesModel(1, value);
  }

  public boolean isSrgbClr() {
    return this.type == 1;
  }

  public SRgbColorModel getSrgbClr() {
    return (SRgbColorModel) this.value;
  }

  public static SolidColorFillPropertiesModel newHslClr(HslColorModel value) {
    return new SolidColorFillPropertiesModel(2, value);
  }

  public boolean isHslClr() {
    return this.type == 2;
  }

  public HslColorModel getHslClr() {
    return (HslColorModel) this.value;
  }

  public static SolidColorFillPropertiesModel newSysClr(SystemColorModel value) {
    return new SolidColorFillPropertiesModel(3, value);
  }

  public boolean isSysClr() {
    return this.type == 3;
  }

  public SystemColorModel getSysClr() {
    return (SystemColorModel) this.value;
  }

  public static SolidColorFillPropertiesModel newSchemeClr(SchemeColorModel value) {
    return new SolidColorFillPropertiesModel(4, value);
  }

  public boolean isSchemeClr() {
    return this.type == 4;
  }

  public SchemeColorModel getSchemeClr() {
    return (SchemeColorModel) this.value;
  }

  public static SolidColorFillPropertiesModel newPrstClr(PresetColorModel value) {
    return new SolidColorFillPropertiesModel(5, value);
  }

  public boolean isPrstClr() {
    return this.type == 5;
  }

  public PresetColorModel getPrstClr() {
    return (PresetColorModel) this.value;
  }
}
