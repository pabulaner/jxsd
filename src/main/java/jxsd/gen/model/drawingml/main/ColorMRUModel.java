package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import jxsd.gen.builder.drawingml.main.ColorMRUBuilder;

/**
 * This is a generated sequence class.
 */
public class ColorMRUModel {
  private final List<EG_ColorChoice> egColorChoice;

  public ColorMRUModel(List<EG_ColorChoice> egColorChoice) {
    this.egColorChoice = egColorChoice;
  }

  public ColorMRUBuilder builder() {
    return new ColorMRUBuilder().from(this);
  }

  public List<EG_ColorChoice> getEGColorChoice() {
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

    public ColorMRUBuilder.EG_ColorChoice builder() {
      return new ColorMRUBuilder.EG_ColorChoice().from(this);
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
