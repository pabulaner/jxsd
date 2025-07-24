package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class AlphaInverseEffectModel {
  private final int type;

  private final Object value;

  public AlphaInverseEffectModel() {
    this(-1, null);
  }

  private AlphaInverseEffectModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static AlphaInverseEffectModel newScrgbClr(ScRgbColorModel value) {
    return new AlphaInverseEffectModel(0, value);
  }

  public boolean isScrgbClr() {
    return this.type == 0;
  }

  public ScRgbColorModel getScrgbClr() {
    return (ScRgbColorModel) this.value;
  }

  public static AlphaInverseEffectModel newSrgbClr(SRgbColorModel value) {
    return new AlphaInverseEffectModel(1, value);
  }

  public boolean isSrgbClr() {
    return this.type == 1;
  }

  public SRgbColorModel getSrgbClr() {
    return (SRgbColorModel) this.value;
  }

  public static AlphaInverseEffectModel newHslClr(HslColorModel value) {
    return new AlphaInverseEffectModel(2, value);
  }

  public boolean isHslClr() {
    return this.type == 2;
  }

  public HslColorModel getHslClr() {
    return (HslColorModel) this.value;
  }

  public static AlphaInverseEffectModel newSysClr(SystemColorModel value) {
    return new AlphaInverseEffectModel(3, value);
  }

  public boolean isSysClr() {
    return this.type == 3;
  }

  public SystemColorModel getSysClr() {
    return (SystemColorModel) this.value;
  }

  public static AlphaInverseEffectModel newSchemeClr(SchemeColorModel value) {
    return new AlphaInverseEffectModel(4, value);
  }

  public boolean isSchemeClr() {
    return this.type == 4;
  }

  public SchemeColorModel getSchemeClr() {
    return (SchemeColorModel) this.value;
  }

  public static AlphaInverseEffectModel newPrstClr(PresetColorModel value) {
    return new AlphaInverseEffectModel(5, value);
  }

  public boolean isPrstClr() {
    return this.type == 5;
  }

  public PresetColorModel getPrstClr() {
    return (PresetColorModel) this.value;
  }
}
