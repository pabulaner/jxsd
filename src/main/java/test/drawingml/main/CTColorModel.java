package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTColorModel {
  private final Integer type;

  private final Object value;

  public CTColorModel() {
    this(-1, null);
  }

  private CTColorModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTColorModel newScrgbClr(CTScRgbColorModel value) {
    return new CTColorModel(0, value);
  }

  public Boolean isScrgbClr() {
    return this.type == 0;
  }

  public CTScRgbColorModel getScrgbClr() {
    return (CTScRgbColorModel) this.value;
  }

  public static CTColorModel newSrgbClr(CTSRgbColorModel value) {
    return new CTColorModel(1, value);
  }

  public Boolean isSrgbClr() {
    return this.type == 1;
  }

  public CTSRgbColorModel getSrgbClr() {
    return (CTSRgbColorModel) this.value;
  }

  public static CTColorModel newHslClr(CTHslColorModel value) {
    return new CTColorModel(2, value);
  }

  public Boolean isHslClr() {
    return this.type == 2;
  }

  public CTHslColorModel getHslClr() {
    return (CTHslColorModel) this.value;
  }

  public static CTColorModel newSysClr(CTSystemColorModel value) {
    return new CTColorModel(3, value);
  }

  public Boolean isSysClr() {
    return this.type == 3;
  }

  public CTSystemColorModel getSysClr() {
    return (CTSystemColorModel) this.value;
  }

  public static CTColorModel newSchemeClr(CTSchemeColorModel value) {
    return new CTColorModel(4, value);
  }

  public Boolean isSchemeClr() {
    return this.type == 4;
  }

  public CTSchemeColorModel getSchemeClr() {
    return (CTSchemeColorModel) this.value;
  }

  public static CTColorModel newPrstClr(CTPresetColorModel value) {
    return new CTColorModel(5, value);
  }

  public Boolean isPrstClr() {
    return this.type == 5;
  }

  public CTPresetColorModel getPrstClr() {
    return (CTPresetColorModel) this.value;
  }
}
