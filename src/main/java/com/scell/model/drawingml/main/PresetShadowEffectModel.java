package com.scell.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;

public class PresetShadowEffectModel {
  private final PositiveCoordinateValueModel dist;

  private final PresetShadowValValueModel prst;

  private final PositiveFixedAngleValueModel dir;

  private final ColorChoiceModel egColorChoice;

  public PresetShadowEffectModel(PositiveCoordinateValueModel dist, PresetShadowValValueModel prst,
      PositiveFixedAngleValueModel dir, ColorChoiceModel egColorChoice) {
    this.dist = dist;
    this.prst = prst;
    this.dir = dir;
    this.egColorChoice = egColorChoice;
  }

  public PositiveCoordinateValueModel getDist() {
    return this.dist;
  }

  public PresetShadowValValueModel getPrst() {
    return this.prst;
  }

  public PositiveFixedAngleValueModel getDir() {
    return this.dir;
  }

  public ColorChoiceModel getEGColorChoice() {
    return this.egColorChoice;
  }

  public static class ColorChoiceModel {
    private final int type;

    private final Object value;

    public ColorChoiceModel() {
      this(-1, null);
    }

    private ColorChoiceModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static ColorChoiceModel newScrgbClr(ScRgbColorModel value) {
      return new ColorChoiceModel(0, value);
    }

    public boolean isScrgbClr() {
      return this.type == 0;
    }

    public ScRgbColorModel getScrgbClr() {
      return (ScRgbColorModel) this.value;
    }

    public static ColorChoiceModel newSrgbClr(SRgbColorModel value) {
      return new ColorChoiceModel(1, value);
    }

    public boolean isSrgbClr() {
      return this.type == 1;
    }

    public SRgbColorModel getSrgbClr() {
      return (SRgbColorModel) this.value;
    }

    public static ColorChoiceModel newHslClr(HslColorModel value) {
      return new ColorChoiceModel(2, value);
    }

    public boolean isHslClr() {
      return this.type == 2;
    }

    public HslColorModel getHslClr() {
      return (HslColorModel) this.value;
    }

    public static ColorChoiceModel newSysClr(SystemColorModel value) {
      return new ColorChoiceModel(3, value);
    }

    public boolean isSysClr() {
      return this.type == 3;
    }

    public SystemColorModel getSysClr() {
      return (SystemColorModel) this.value;
    }

    public static ColorChoiceModel newSchemeClr(SchemeColorModel value) {
      return new ColorChoiceModel(4, value);
    }

    public boolean isSchemeClr() {
      return this.type == 4;
    }

    public SchemeColorModel getSchemeClr() {
      return (SchemeColorModel) this.value;
    }

    public static ColorChoiceModel newPrstClr(PresetColorModel value) {
      return new ColorChoiceModel(5, value);
    }

    public boolean isPrstClr() {
      return this.type == 5;
    }

    public PresetColorModel getPrstClr() {
      return (PresetColorModel) this.value;
    }
  }
}
