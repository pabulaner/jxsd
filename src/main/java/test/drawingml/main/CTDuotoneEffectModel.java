package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTDuotoneEffectModel {
  private final Integer type;

  private final Object value;

  public CTDuotoneEffectModel() {
    this(-1, null);
  }

  private CTDuotoneEffectModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTDuotoneEffectModel newScrgbClr(CTScRgbColorModel value) {
    return new CTDuotoneEffectModel(0, value);
  }

  public Boolean isScrgbClr() {
    return this.type == 0;
  }

  public CTScRgbColorModel getScrgbClr() {
    return (CTScRgbColorModel) this.value;
  }

  public static CTDuotoneEffectModel newSrgbClr(CTSRgbColorModel value) {
    return new CTDuotoneEffectModel(1, value);
  }

  public Boolean isSrgbClr() {
    return this.type == 1;
  }

  public CTSRgbColorModel getSrgbClr() {
    return (CTSRgbColorModel) this.value;
  }

  public static CTDuotoneEffectModel newHslClr(CTHslColorModel value) {
    return new CTDuotoneEffectModel(2, value);
  }

  public Boolean isHslClr() {
    return this.type == 2;
  }

  public CTHslColorModel getHslClr() {
    return (CTHslColorModel) this.value;
  }

  public static CTDuotoneEffectModel newSysClr(CTSystemColorModel value) {
    return new CTDuotoneEffectModel(3, value);
  }

  public Boolean isSysClr() {
    return this.type == 3;
  }

  public CTSystemColorModel getSysClr() {
    return (CTSystemColorModel) this.value;
  }

  public static CTDuotoneEffectModel newSchemeClr(CTSchemeColorModel value) {
    return new CTDuotoneEffectModel(4, value);
  }

  public Boolean isSchemeClr() {
    return this.type == 4;
  }

  public CTSchemeColorModel getSchemeClr() {
    return (CTSchemeColorModel) this.value;
  }

  public static CTDuotoneEffectModel newPrstClr(CTPresetColorModel value) {
    return new CTDuotoneEffectModel(5, value);
  }

  public Boolean isPrstClr() {
    return this.type == 5;
  }

  public CTPresetColorModel getPrstClr() {
    return (CTPresetColorModel) this.value;
  }
}
