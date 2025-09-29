package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.main.ColorBuilder;

/**
 * This is a generated choice class.
 */
public class ColorModel {
  private final int type;

  private final Object value;

  public ColorModel() {
    this(-1, null);
  }

  private ColorModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public ColorBuilder builder() {
    return new ColorBuilder().from(this);
  }

  public static ColorModel newScrgbClr(ScRgbColorModel value) {
    return new ColorModel(0, value);
  }

  public boolean isScrgbClr() {
    return this.type == 0;
  }

  public ScRgbColorModel getScrgbClr() {
    return (ScRgbColorModel) this.value;
  }

  public static ColorModel newSrgbClr(SRgbColorModel value) {
    return new ColorModel(1, value);
  }

  public boolean isSrgbClr() {
    return this.type == 1;
  }

  public SRgbColorModel getSrgbClr() {
    return (SRgbColorModel) this.value;
  }

  public static ColorModel newHslClr(HslColorModel value) {
    return new ColorModel(2, value);
  }

  public boolean isHslClr() {
    return this.type == 2;
  }

  public HslColorModel getHslClr() {
    return (HslColorModel) this.value;
  }

  public static ColorModel newSysClr(SystemColorModel value) {
    return new ColorModel(3, value);
  }

  public boolean isSysClr() {
    return this.type == 3;
  }

  public SystemColorModel getSysClr() {
    return (SystemColorModel) this.value;
  }

  public static ColorModel newSchemeClr(SchemeColorModel value) {
    return new ColorModel(4, value);
  }

  public boolean isSchemeClr() {
    return this.type == 4;
  }

  public SchemeColorModel getSchemeClr() {
    return (SchemeColorModel) this.value;
  }

  public static ColorModel newPrstClr(PresetColorModel value) {
    return new ColorModel(5, value);
  }

  public boolean isPrstClr() {
    return this.type == 5;
  }

  public PresetColorModel getPrstClr() {
    return (PresetColorModel) this.value;
  }
}
