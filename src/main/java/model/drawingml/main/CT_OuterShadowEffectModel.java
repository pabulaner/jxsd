package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import model.XMLSchema.booleanModel;

public class CT_OuterShadowEffectModel {
  private final ST_PositiveCoordinateModel blurRad;

  private final ST_PositiveCoordinateModel dist;

  private final booleanModel rotWithShape;

  private final ST_PercentageModel sy;

  private final ST_FixedAngleModel ky;

  private final ST_PercentageModel sx;

  private final ST_FixedAngleModel kx;

  private final ST_PositiveFixedAngleModel dir;

  private final ST_RectAlignmentModel algn;

  private final scrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr;

  public CT_OuterShadowEffectModel(ST_PositiveCoordinateModel blurRad,
      ST_PositiveCoordinateModel dist, booleanModel rotWithShape, ST_PercentageModel sy,
      ST_FixedAngleModel ky, ST_PercentageModel sx, ST_FixedAngleModel kx,
      ST_PositiveFixedAngleModel dir, ST_RectAlignmentModel algn,
      scrgbClrOrSrgbClrOrHslClrModel scrgbClrOrSrgbClrOrHslClr) {
    this.blurRad = blurRad;
    this.dist = dist;
    this.rotWithShape = rotWithShape;
    this.sy = sy;
    this.ky = ky;
    this.sx = sx;
    this.kx = kx;
    this.dir = dir;
    this.algn = algn;
    this.scrgbClrOrSrgbClrOrHslClr = scrgbClrOrSrgbClrOrHslClr;
  }

  public ST_PositiveCoordinateModel getBlurRad() {
    return this.blurRad;
  }

  public ST_PositiveCoordinateModel getDist() {
    return this.dist;
  }

  public booleanModel getRotWithShape() {
    return this.rotWithShape;
  }

  public ST_PercentageModel getSy() {
    return this.sy;
  }

  public ST_FixedAngleModel getKy() {
    return this.ky;
  }

  public ST_PercentageModel getSx() {
    return this.sx;
  }

  public ST_FixedAngleModel getKx() {
    return this.kx;
  }

  public ST_PositiveFixedAngleModel getDir() {
    return this.dir;
  }

  public ST_RectAlignmentModel getAlgn() {
    return this.algn;
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
