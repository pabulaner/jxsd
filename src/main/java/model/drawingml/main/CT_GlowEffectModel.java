package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_GlowEffectModel {
  private final ST_PositiveCoordinateModel rad;

  private final scrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr;

  public CT_GlowEffectModel(ST_PositiveCoordinateModel rad,
      scrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr) {
    this.rad = rad;
    this.scrgbClrOrSrgbClrOrHslClr = scrgbClrOrSrgbClrOrHslClr;
  }

  public ST_PositiveCoordinateModel getRad() {
    return this.rad;
  }

  public scrgbClrOrSrgbClrOrHslClrModel getScrgbClrOrSrgbClrOrHslClr() {
    return this.scrgbClrOrSrgbClrOrHslClr;
  }

  public static class scrgbClrOrSrgbClrOrHslClrModel {
    private final int type;

    private final Object value;

    public scrgbClrOrSrgbClrOrHslClrModel() {
      this(-1, null);
    }

    private scrgbClrOrSrgbClrOrHslClrModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static scrgbClrOrSrgbClrOrHslClrModel newScrgbClr(CT_ScRgbColorModel value) {
      return new scrgbClrOrSrgbClrOrHslClrModel(0, value);
    }

    public boolean isScrgbClr() {
      return this.type == 0;
    }

    public CT_ScRgbColorModel getScrgbClr() {
      return (CT_ScRgbColorModel) this.value;
    }

    public static scrgbClrOrSrgbClrOrHslClrModel newSrgbClr(CT_SRgbColorModel value) {
      return new scrgbClrOrSrgbClrOrHslClrModel(1, value);
    }

    public boolean isSrgbClr() {
      return this.type == 1;
    }

    public CT_SRgbColorModel getSrgbClr() {
      return (CT_SRgbColorModel) this.value;
    }

    public static scrgbClrOrSrgbClrOrHslClrModel newHslClr(CT_HslColorModel value) {
      return new scrgbClrOrSrgbClrOrHslClrModel(2, value);
    }

    public boolean isHslClr() {
      return this.type == 2;
    }

    public CT_HslColorModel getHslClr() {
      return (CT_HslColorModel) this.value;
    }

    public static scrgbClrOrSrgbClrOrHslClrModel newSysClr(CT_SystemColorModel value) {
      return new scrgbClrOrSrgbClrOrHslClrModel(3, value);
    }

    public boolean isSysClr() {
      return this.type == 3;
    }

    public CT_SystemColorModel getSysClr() {
      return (CT_SystemColorModel) this.value;
    }

    public static scrgbClrOrSrgbClrOrHslClrModel newSchemeClr(CT_SchemeColorModel value) {
      return new scrgbClrOrSrgbClrOrHslClrModel(4, value);
    }

    public boolean isSchemeClr() {
      return this.type == 4;
    }

    public CT_SchemeColorModel getSchemeClr() {
      return (CT_SchemeColorModel) this.value;
    }

    public static scrgbClrOrSrgbClrOrHslClrModel newPrstClr(CT_PresetColorModel value) {
      return new scrgbClrOrSrgbClrOrHslClrModel(5, value);
    }

    public boolean isPrstClr() {
      return this.type == 5;
    }

    public CT_PresetColorModel getPrstClr() {
      return (CT_PresetColorModel) this.value;
    }
  }
}
