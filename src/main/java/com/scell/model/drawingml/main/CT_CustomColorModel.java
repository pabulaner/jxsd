package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import java.lang.Integer;
import java.lang.Object;

public class CT_CustomColorModel {
  private final StringModel name;

  private final ScrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr;

  public CT_CustomColorModel(StringModel name,
      ScrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr) {
    this.name = name;
    this.scrgbClrOrSrgbClrOrHslClr = scrgbClrOrSrgbClrOrHslClr;
  }

  public StringModel getName() {
    return this.name;
  }

  public ScrgbClrOrSrgbClrOrHslClrModel getScrgbClrOrSrgbClrOrHslClr() {
    return this.scrgbClrOrSrgbClrOrHslClr;
  }

  public static class ScrgbClrOrSrgbClrOrHslClrModel {
    private final int type;

    private final Object value;

    public ScrgbClrOrSrgbClrOrHslClrModel() {
      this(-1, null);
    }

    private ScrgbClrOrSrgbClrOrHslClrModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static ScrgbClrOrSrgbClrOrHslClrModel newScrgbClr(CT_ScRgbColorModel value) {
      return new ScrgbClrOrSrgbClrOrHslClrModel(0, value);
    }

    public boolean isScrgbClr() {
      return this.type == 0;
    }

    public CT_ScRgbColorModel getScrgbClr() {
      return (CT_ScRgbColorModel) this.value;
    }

    public static ScrgbClrOrSrgbClrOrHslClrModel newSrgbClr(CT_SRgbColorModel value) {
      return new ScrgbClrOrSrgbClrOrHslClrModel(1, value);
    }

    public boolean isSrgbClr() {
      return this.type == 1;
    }

    public CT_SRgbColorModel getSrgbClr() {
      return (CT_SRgbColorModel) this.value;
    }

    public static ScrgbClrOrSrgbClrOrHslClrModel newHslClr(CT_HslColorModel value) {
      return new ScrgbClrOrSrgbClrOrHslClrModel(2, value);
    }

    public boolean isHslClr() {
      return this.type == 2;
    }

    public CT_HslColorModel getHslClr() {
      return (CT_HslColorModel) this.value;
    }

    public static ScrgbClrOrSrgbClrOrHslClrModel newSysClr(CT_SystemColorModel value) {
      return new ScrgbClrOrSrgbClrOrHslClrModel(3, value);
    }

    public boolean isSysClr() {
      return this.type == 3;
    }

    public CT_SystemColorModel getSysClr() {
      return (CT_SystemColorModel) this.value;
    }

    public static ScrgbClrOrSrgbClrOrHslClrModel newSchemeClr(CT_SchemeColorModel value) {
      return new ScrgbClrOrSrgbClrOrHslClrModel(4, value);
    }

    public boolean isSchemeClr() {
      return this.type == 4;
    }

    public CT_SchemeColorModel getSchemeClr() {
      return (CT_SchemeColorModel) this.value;
    }

    public static ScrgbClrOrSrgbClrOrHslClrModel newPrstClr(CT_PresetColorModel value) {
      return new ScrgbClrOrSrgbClrOrHslClrModel(5, value);
    }

    public boolean isPrstClr() {
      return this.type == 5;
    }

    public CT_PresetColorModel getPrstClr() {
      return (CT_PresetColorModel) this.value;
    }
  }
}
