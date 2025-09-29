package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.ColorModel;
import jxsd.gen.model.drawingml.main.HslColorModel;
import jxsd.gen.model.drawingml.main.PresetColorModel;
import jxsd.gen.model.drawingml.main.SRgbColorModel;
import jxsd.gen.model.drawingml.main.ScRgbColorModel;
import jxsd.gen.model.drawingml.main.SchemeColorModel;
import jxsd.gen.model.drawingml.main.SystemColorModel;

/**
 * This is a generated choice class.
 */
public class ColorBuilder {
  private int type;

  private Object value;

  public ColorBuilder() {
    this.type = -1;
    this.value = null;
  }

  public ColorBuilder setScrgbClr(ScRgbColorModel value) {
    this.type = 0;
    this.value = value;
    return this;
  }

  public ColorBuilder setSrgbClr(SRgbColorModel value) {
    this.type = 1;
    this.value = value;
    return this;
  }

  public ColorBuilder setHslClr(HslColorModel value) {
    this.type = 2;
    this.value = value;
    return this;
  }

  public ColorBuilder setSysClr(SystemColorModel value) {
    this.type = 3;
    this.value = value;
    return this;
  }

  public ColorBuilder setSchemeClr(SchemeColorModel value) {
    this.type = 4;
    this.value = value;
    return this;
  }

  public ColorBuilder setPrstClr(PresetColorModel value) {
    this.type = 5;
    this.value = value;
    return this;
  }

  public ColorBuilder from(ColorModel value) {
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

  public ColorModel build() {
    if (this.type == -1) return new ColorModel();
    if (this.type == 0) return ColorModel.newScrgbClr((ScRgbColorModel) this.value);
    if (this.type == 1) return ColorModel.newSrgbClr((SRgbColorModel) this.value);
    if (this.type == 2) return ColorModel.newHslClr((HslColorModel) this.value);
    if (this.type == 3) return ColorModel.newSysClr((SystemColorModel) this.value);
    if (this.type == 4) return ColorModel.newSchemeClr((SchemeColorModel) this.value);
    if (this.type == 5) return ColorModel.newPrstClr((PresetColorModel) this.value);
    return null;
  }
}
