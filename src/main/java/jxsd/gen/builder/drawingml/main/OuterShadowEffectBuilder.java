package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.HslColorModel;
import jxsd.gen.model.drawingml.main.OuterShadowEffectModel;
import jxsd.gen.model.drawingml.main.PresetColorModel;
import jxsd.gen.model.drawingml.main.RectAlignmentValueModel;
import jxsd.gen.model.drawingml.main.SRgbColorModel;
import jxsd.gen.model.drawingml.main.ScRgbColorModel;
import jxsd.gen.model.drawingml.main.SchemeColorModel;
import jxsd.gen.model.drawingml.main.SystemColorModel;

/**
 * This is a generated sequence class.
 */
public class OuterShadowEffectBuilder {
  private long blurRad;

  private long dist;

  private boolean rotWithShape;

  private int sy;

  private int ky;

  private int sx;

  private int kx;

  private int dir;

  private RectAlignmentValueModel algn;

  private OuterShadowEffectModel.EG_ColorChoice egColorChoice;

  public OuterShadowEffectBuilder() {
  }

  public OuterShadowEffectBuilder setBlurRad(long blurRad) {
    this.blurRad = blurRad;
    return this;
  }

  public OuterShadowEffectBuilder setDist(long dist) {
    this.dist = dist;
    return this;
  }

  public OuterShadowEffectBuilder setRotWithShape(boolean rotWithShape) {
    this.rotWithShape = rotWithShape;
    return this;
  }

  public OuterShadowEffectBuilder setSy(int sy) {
    this.sy = sy;
    return this;
  }

  public OuterShadowEffectBuilder setKy(int ky) {
    this.ky = ky;
    return this;
  }

  public OuterShadowEffectBuilder setSx(int sx) {
    this.sx = sx;
    return this;
  }

  public OuterShadowEffectBuilder setKx(int kx) {
    this.kx = kx;
    return this;
  }

  public OuterShadowEffectBuilder setDir(int dir) {
    this.dir = dir;
    return this;
  }

  public OuterShadowEffectBuilder setAlgn(RectAlignmentValueModel algn) {
    this.algn = algn;
    return this;
  }

  public OuterShadowEffectBuilder setEGColorChoice(
      OuterShadowEffectModel.EG_ColorChoice egColorChoice) {
    this.egColorChoice = egColorChoice;
    return this;
  }

  public OuterShadowEffectBuilder from(OuterShadowEffectModel value) {
    this.blurRad = value.getBlurRad();
    this.dist = value.getDist();
    this.rotWithShape = value.getRotWithShape();
    this.sy = value.getSy();
    this.ky = value.getKy();
    this.sx = value.getSx();
    this.kx = value.getKx();
    this.dir = value.getDir();
    this.algn = value.getAlgn();
    this.egColorChoice = value.getEGColorChoice();
    return this;
  }

  public OuterShadowEffectModel build() {
    return new OuterShadowEffectModel(this.blurRad, this.dist, this.rotWithShape, this.sy, this.ky, this.sx, this.kx, this.dir, this.algn, this.egColorChoice);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_ColorChoice {
    private int type;

    private Object value;

    public EG_ColorChoice() {
      this.type = -1;
      this.value = null;
    }

    public EG_ColorChoice setScrgbClr(ScRgbColorModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_ColorChoice setSrgbClr(SRgbColorModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_ColorChoice setHslClr(HslColorModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_ColorChoice setSysClr(SystemColorModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public EG_ColorChoice setSchemeClr(SchemeColorModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public EG_ColorChoice setPrstClr(PresetColorModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public EG_ColorChoice from(OuterShadowEffectModel.EG_ColorChoice value) {
      this.type = -1;
      this.value = null;
      if (value.isScrgbClr()) {
        this.type = 0;
        this.value = value.getScrgbClr();
      }
      if (value.isSrgbClr()) {
        this.type = 1;
        this.value = value.getSrgbClr();
      }
      if (value.isHslClr()) {
        this.type = 2;
        this.value = value.getHslClr();
      }
      if (value.isSysClr()) {
        this.type = 3;
        this.value = value.getSysClr();
      }
      if (value.isSchemeClr()) {
        this.type = 4;
        this.value = value.getSchemeClr();
      }
      if (value.isPrstClr()) {
        this.type = 5;
        this.value = value.getPrstClr();
      }
      return this;
    }

    public OuterShadowEffectModel.EG_ColorChoice build() {
      if (this.type == -1) return new OuterShadowEffectModel.EG_ColorChoice();
      if (this.type == 0) return OuterShadowEffectModel.EG_ColorChoice.newScrgbClr((ScRgbColorModel) this.value);
      if (this.type == 1) return OuterShadowEffectModel.EG_ColorChoice.newSrgbClr((SRgbColorModel) this.value);
      if (this.type == 2) return OuterShadowEffectModel.EG_ColorChoice.newHslClr((HslColorModel) this.value);
      if (this.type == 3) return OuterShadowEffectModel.EG_ColorChoice.newSysClr((SystemColorModel) this.value);
      if (this.type == 4) return OuterShadowEffectModel.EG_ColorChoice.newSchemeClr((SchemeColorModel) this.value);
      if (this.type == 5) return OuterShadowEffectModel.EG_ColorChoice.newPrstClr((PresetColorModel) this.value);
      return null;
    }
  }
}
