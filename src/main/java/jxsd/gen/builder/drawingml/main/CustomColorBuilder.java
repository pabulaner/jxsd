package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.CustomColorModel;
import jxsd.gen.model.drawingml.main.HslColorModel;
import jxsd.gen.model.drawingml.main.PresetColorModel;
import jxsd.gen.model.drawingml.main.SRgbColorModel;
import jxsd.gen.model.drawingml.main.ScRgbColorModel;
import jxsd.gen.model.drawingml.main.SchemeColorModel;
import jxsd.gen.model.drawingml.main.SystemColorModel;

/**
 * This is a generated sequence class.
 */
public class CustomColorBuilder {
  private String name;

  private CustomColorModel.EG_ColorChoice egColorChoice;

  public CustomColorBuilder() {
  }

  public CustomColorBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public CustomColorBuilder setEGColorChoice(CustomColorModel.EG_ColorChoice egColorChoice) {
    this.egColorChoice = egColorChoice;
    return this;
  }

  public CustomColorBuilder from(CustomColorModel value) {
    this.name = value.getName();
    this.egColorChoice = value.getEGColorChoice();
    return this;
  }

  public CustomColorModel build() {
    return new CustomColorModel(this.name, this.egColorChoice);
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

    public EG_ColorChoice from(CustomColorModel.EG_ColorChoice value) {
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

    public CustomColorModel.EG_ColorChoice build() {
      if (this.type == -1) return new CustomColorModel.EG_ColorChoice();
      if (this.type == 0) return CustomColorModel.EG_ColorChoice.newScrgbClr((ScRgbColorModel) this.value);
      if (this.type == 1) return CustomColorModel.EG_ColorChoice.newSrgbClr((SRgbColorModel) this.value);
      if (this.type == 2) return CustomColorModel.EG_ColorChoice.newHslClr((HslColorModel) this.value);
      if (this.type == 3) return CustomColorModel.EG_ColorChoice.newSysClr((SystemColorModel) this.value);
      if (this.type == 4) return CustomColorModel.EG_ColorChoice.newSchemeClr((SchemeColorModel) this.value);
      if (this.type == 5) return CustomColorModel.EG_ColorChoice.newPrstClr((PresetColorModel) this.value);
      return null;
    }
  }
}
