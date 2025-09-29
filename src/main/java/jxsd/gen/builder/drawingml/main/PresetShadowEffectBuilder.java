package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.HslColorModel;
import jxsd.gen.model.drawingml.main.PresetColorModel;
import jxsd.gen.model.drawingml.main.PresetShadowEffectModel;
import jxsd.gen.model.drawingml.main.PresetShadowValValueModel;
import jxsd.gen.model.drawingml.main.SRgbColorModel;
import jxsd.gen.model.drawingml.main.ScRgbColorModel;
import jxsd.gen.model.drawingml.main.SchemeColorModel;
import jxsd.gen.model.drawingml.main.SystemColorModel;

/**
 * This is a generated sequence class.
 */
public class PresetShadowEffectBuilder {
  private long dist;

  private PresetShadowValValueModel prst;

  private int dir;

  private PresetShadowEffectModel.EG_ColorChoice egColorChoice;

  public PresetShadowEffectBuilder() {
  }

  public PresetShadowEffectBuilder setDist(long dist) {
    this.dist = dist;
    return this;
  }

  public PresetShadowEffectBuilder setPrst(PresetShadowValValueModel prst) {
    this.prst = prst;
    return this;
  }

  public PresetShadowEffectBuilder setDir(int dir) {
    this.dir = dir;
    return this;
  }

  public PresetShadowEffectBuilder setEGColorChoice(
      PresetShadowEffectModel.EG_ColorChoice egColorChoice) {
    this.egColorChoice = egColorChoice;
    return this;
  }

  public PresetShadowEffectBuilder from(PresetShadowEffectModel value) {
    this.dist = value.getDist();
    this.prst = value.getPrst();
    this.dir = value.getDir();
    this.egColorChoice = value.getEGColorChoice();
    return this;
  }

  public PresetShadowEffectModel build() {
    return new PresetShadowEffectModel(this.dist, this.prst, this.dir, this.egColorChoice);
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

    public EG_ColorChoice from(PresetShadowEffectModel.EG_ColorChoice value) {
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

    public PresetShadowEffectModel.EG_ColorChoice build() {
      if (this.type == -1) return new PresetShadowEffectModel.EG_ColorChoice();
      if (this.type == 0) return PresetShadowEffectModel.EG_ColorChoice.newScrgbClr((ScRgbColorModel) this.value);
      if (this.type == 1) return PresetShadowEffectModel.EG_ColorChoice.newSrgbClr((SRgbColorModel) this.value);
      if (this.type == 2) return PresetShadowEffectModel.EG_ColorChoice.newHslClr((HslColorModel) this.value);
      if (this.type == 3) return PresetShadowEffectModel.EG_ColorChoice.newSysClr((SystemColorModel) this.value);
      if (this.type == 4) return PresetShadowEffectModel.EG_ColorChoice.newSchemeClr((SchemeColorModel) this.value);
      if (this.type == 5) return PresetShadowEffectModel.EG_ColorChoice.newPrstClr((PresetColorModel) this.value);
      return null;
    }
  }
}
