package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTStyleMatrixReferenceModel {
  private final STStyleMatrixColumnIndexModel idx;

  private final ScrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr;

  public CTStyleMatrixReferenceModel(STStyleMatrixColumnIndexModel idx,
      ScrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr) {
    this.idx = idx;
    this.scrgbClrOrSrgbClrOrHslClr = scrgbClrOrSrgbClrOrHslClr;
  }

  public STStyleMatrixColumnIndexModel getIdx() {
    return this.idx;
  }

  public ScrgbClrOrSrgbClrOrHslClrModel getScrgbClrOrSrgbClrOrHslClr() {
    return this.scrgbClrOrSrgbClrOrHslClr;
  }

  public static class ScrgbClrOrSrgbClrOrHslClrModel {
    private final Integer type;

    private final Object value;

    public ScrgbClrOrSrgbClrOrHslClrModel() {
      this(-1, null);
    }

    private ScrgbClrOrSrgbClrOrHslClrModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static ScrgbClrOrSrgbClrOrHslClrModel newScrgbClr(CTScRgbColorModel value) {
      return new ScrgbClrOrSrgbClrOrHslClrModel(0, value);
    }

    public Boolean isScrgbClr() {
      return this.type == 0;
    }

    public CTScRgbColorModel getScrgbClr() {
      return (CTScRgbColorModel) this.value;
    }

    public static ScrgbClrOrSrgbClrOrHslClrModel newSrgbClr(CTSRgbColorModel value) {
      return new ScrgbClrOrSrgbClrOrHslClrModel(1, value);
    }

    public Boolean isSrgbClr() {
      return this.type == 1;
    }

    public CTSRgbColorModel getSrgbClr() {
      return (CTSRgbColorModel) this.value;
    }

    public static ScrgbClrOrSrgbClrOrHslClrModel newHslClr(CTHslColorModel value) {
      return new ScrgbClrOrSrgbClrOrHslClrModel(2, value);
    }

    public Boolean isHslClr() {
      return this.type == 2;
    }

    public CTHslColorModel getHslClr() {
      return (CTHslColorModel) this.value;
    }

    public static ScrgbClrOrSrgbClrOrHslClrModel newSysClr(CTSystemColorModel value) {
      return new ScrgbClrOrSrgbClrOrHslClrModel(3, value);
    }

    public Boolean isSysClr() {
      return this.type == 3;
    }

    public CTSystemColorModel getSysClr() {
      return (CTSystemColorModel) this.value;
    }

    public static ScrgbClrOrSrgbClrOrHslClrModel newSchemeClr(CTSchemeColorModel value) {
      return new ScrgbClrOrSrgbClrOrHslClrModel(4, value);
    }

    public Boolean isSchemeClr() {
      return this.type == 4;
    }

    public CTSchemeColorModel getSchemeClr() {
      return (CTSchemeColorModel) this.value;
    }

    public static ScrgbClrOrSrgbClrOrHslClrModel newPrstClr(CTPresetColorModel value) {
      return new ScrgbClrOrSrgbClrOrHslClrModel(5, value);
    }

    public Boolean isPrstClr() {
      return this.type == 5;
    }

    public CTPresetColorModel getPrstClr() {
      return (CTPresetColorModel) this.value;
    }
  }
}
