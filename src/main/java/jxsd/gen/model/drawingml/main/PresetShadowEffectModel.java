package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.main.PresetShadowEffectBuilder;

/**
 * This is a generated sequence class.
 */
public class PresetShadowEffectModel {
  private final long dist;

  private final PresetShadowValValueModel prst;

  private final int dir;

  private final EG_ColorChoice egColorChoice;

  public PresetShadowEffectModel(long dist, PresetShadowValValueModel prst, int dir,
      EG_ColorChoice egColorChoice) {
    this.dist = dist;
    this.prst = prst;
    this.dir = dir;
    this.egColorChoice = egColorChoice;
  }

  public PresetShadowEffectBuilder builder() {
    return new PresetShadowEffectBuilder().from(this);
  }

  public long getDist() {
    return this.dist;
  }

  public PresetShadowValValueModel getPrst() {
    return this.prst;
  }

  public int getDir() {
    return this.dir;
  }

  public EG_ColorChoice getEGColorChoice() {
    return this.egColorChoice;
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_ColorChoice {
    private final int type;

    private final Object value;

    public EG_ColorChoice() {
      this(-1, null);
    }

    private EG_ColorChoice(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public PresetShadowEffectBuilder.EG_ColorChoice builder() {
      return new PresetShadowEffectBuilder.EG_ColorChoice().from(this);
    }

    public static EG_ColorChoice newScrgbClr(ScRgbColorModel value) {
      return new EG_ColorChoice(0, value);
    }

    public boolean isScrgbClr() {
      return this.type == 0;
    }

    public ScRgbColorModel getScrgbClr() {
      return (ScRgbColorModel) this.value;
    }

    public static EG_ColorChoice newSrgbClr(SRgbColorModel value) {
      return new EG_ColorChoice(1, value);
    }

    public boolean isSrgbClr() {
      return this.type == 1;
    }

    public SRgbColorModel getSrgbClr() {
      return (SRgbColorModel) this.value;
    }

    public static EG_ColorChoice newHslClr(HslColorModel value) {
      return new EG_ColorChoice(2, value);
    }

    public boolean isHslClr() {
      return this.type == 2;
    }

    public HslColorModel getHslClr() {
      return (HslColorModel) this.value;
    }

    public static EG_ColorChoice newSysClr(SystemColorModel value) {
      return new EG_ColorChoice(3, value);
    }

    public boolean isSysClr() {
      return this.type == 3;
    }

    public SystemColorModel getSysClr() {
      return (SystemColorModel) this.value;
    }

    public static EG_ColorChoice newSchemeClr(SchemeColorModel value) {
      return new EG_ColorChoice(4, value);
    }

    public boolean isSchemeClr() {
      return this.type == 4;
    }

    public SchemeColorModel getSchemeClr() {
      return (SchemeColorModel) this.value;
    }

    public static EG_ColorChoice newPrstClr(PresetColorModel value) {
      return new EG_ColorChoice(5, value);
    }

    public boolean isPrstClr() {
      return this.type == 5;
    }

    public PresetColorModel getPrstClr() {
      return (PresetColorModel) this.value;
    }
  }
}
