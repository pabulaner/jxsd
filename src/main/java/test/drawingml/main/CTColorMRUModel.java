package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTColorMRUModel {
  private final Integer type;

  private final Object value;

  public CTColorMRUModel() {
    this(-1, null);
  }

  private CTColorMRUModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTColorMRUModel newScrgbClr(CTScRgbColorModel value) {
    return new CTColorMRUModel(0, value);
  }

  public Boolean isScrgbClr() {
    return this.type == 0;
  }

  public CTScRgbColorModel getScrgbClr() {
    return (CTScRgbColorModel) this.value;
  }

  public static CTColorMRUModel newSrgbClr(CTSRgbColorModel value) {
    return new CTColorMRUModel(1, value);
  }

  public Boolean isSrgbClr() {
    return this.type == 1;
  }

  public CTSRgbColorModel getSrgbClr() {
    return (CTSRgbColorModel) this.value;
  }

  public static CTColorMRUModel newHslClr(CTHslColorModel value) {
    return new CTColorMRUModel(2, value);
  }

  public Boolean isHslClr() {
    return this.type == 2;
  }

  public CTHslColorModel getHslClr() {
    return (CTHslColorModel) this.value;
  }

  public static CTColorMRUModel newSysClr(CTSystemColorModel value) {
    return new CTColorMRUModel(3, value);
  }

  public Boolean isSysClr() {
    return this.type == 3;
  }

  public CTSystemColorModel getSysClr() {
    return (CTSystemColorModel) this.value;
  }

  public static CTColorMRUModel newSchemeClr(CTSchemeColorModel value) {
    return new CTColorMRUModel(4, value);
  }

  public Boolean isSchemeClr() {
    return this.type == 4;
  }

  public CTSchemeColorModel getSchemeClr() {
    return (CTSchemeColorModel) this.value;
  }

  public static CTColorMRUModel newPrstClr(CTPresetColorModel value) {
    return new CTColorMRUModel(5, value);
  }

  public Boolean isPrstClr() {
    return this.type == 5;
  }

  public CTPresetColorModel getPrstClr() {
    return (CTPresetColorModel) this.value;
  }
}
