package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class CT_InnerShadowEffectModel {
  private final ST_PositiveCoordinateModel blurRad;

  private final ST_PositiveCoordinateModel dist;

  private final ST_PositiveFixedAngleModel dir;

  private final EG_ColorChoiceModel egColorChoice;

  public CT_InnerShadowEffectModel(ST_PositiveCoordinateModel blurRad,
      ST_PositiveCoordinateModel dist, ST_PositiveFixedAngleModel dir,
      EG_ColorChoiceModel egColorChoice) {
    this.blurRad = blurRad;
    this.dist = dist;
    this.dir = dir;
    this.egColorChoice = egColorChoice;
  }

  public ST_PositiveCoordinateModel getBlurRad() {
    return this.blurRad;
  }

  public ST_PositiveCoordinateModel getDist() {
    return this.dist;
  }

  public ST_PositiveFixedAngleModel getDir() {
    return this.dir;
  }

  public EG_ColorChoiceModel getEGColorChoice() {
    return this.egColorChoice;
  }

  public static class EG_ColorChoiceModel {
    private final int type;

    private final Object value;

    public EG_ColorChoiceModel() {
      this(-1, null);
    }

    private EG_ColorChoiceModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static EG_ColorChoiceModel newScrgbClr(CT_ScRgbColorModel value) {
      return new EG_ColorChoiceModel(0, value);
    }

    public boolean isScrgbClr() {
      return this.type == 0;
    }

    public CT_ScRgbColorModel getScrgbClr() {
      return (CT_ScRgbColorModel) this.value;
    }

    public static EG_ColorChoiceModel newSrgbClr(CT_SRgbColorModel value) {
      return new EG_ColorChoiceModel(1, value);
    }

    public boolean isSrgbClr() {
      return this.type == 1;
    }

    public CT_SRgbColorModel getSrgbClr() {
      return (CT_SRgbColorModel) this.value;
    }

    public static EG_ColorChoiceModel newHslClr(CT_HslColorModel value) {
      return new EG_ColorChoiceModel(2, value);
    }

    public boolean isHslClr() {
      return this.type == 2;
    }

    public CT_HslColorModel getHslClr() {
      return (CT_HslColorModel) this.value;
    }

    public static EG_ColorChoiceModel newSysClr(CT_SystemColorModel value) {
      return new EG_ColorChoiceModel(3, value);
    }

    public boolean isSysClr() {
      return this.type == 3;
    }

    public CT_SystemColorModel getSysClr() {
      return (CT_SystemColorModel) this.value;
    }

    public static EG_ColorChoiceModel newSchemeClr(CT_SchemeColorModel value) {
      return new EG_ColorChoiceModel(4, value);
    }

    public boolean isSchemeClr() {
      return this.type == 4;
    }

    public CT_SchemeColorModel getSchemeClr() {
      return (CT_SchemeColorModel) this.value;
    }

    public static EG_ColorChoiceModel newPrstClr(CT_PresetColorModel value) {
      return new EG_ColorChoiceModel(5, value);
    }

    public boolean isPrstClr() {
      return this.type == 5;
    }

    public CT_PresetColorModel getPrstClr() {
      return (CT_PresetColorModel) this.value;
    }
  }
}
