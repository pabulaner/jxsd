package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ColorMRUModel;
import com.scell.model.drawingml.main.HslColorModel;
import com.scell.model.drawingml.main.PresetColorModel;
import com.scell.model.drawingml.main.SRgbColorModel;
import com.scell.model.drawingml.main.ScRgbColorModel;
import com.scell.model.drawingml.main.SchemeColorModel;
import com.scell.model.drawingml.main.SystemColorModel;
import java.lang.Object;
import java.util.List;

public class ColorMRUBuilder {
  private List<ColorMRUModel.ColorChoiceModel> egColorChoice;

  public ColorMRUBuilder() {
  }

  public ColorMRUBuilder setEGColorChoice(List<ColorMRUModel.ColorChoiceModel> egColorChoice) {
    this.egColorChoice = egColorChoice;
    return this;
  }

  public ColorMRUModel build() {
    return new ColorMRUModel(this.egColorChoice);
  }

  public ColorMRUBuilder from(ColorMRUModel value) {
    this.egColorChoice = value.getEGColorChoice();
    return this;
  }

  public static class ColorChoiceBuilder {
    private int type;

    private Object value;

    public ColorChoiceBuilder() {
      this.type = -1;
      this.value = null;
    }

    public ColorChoiceBuilder setScrgbClr(ScRgbColorModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public ColorChoiceBuilder setSrgbClr(SRgbColorModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public ColorChoiceBuilder setHslClr(HslColorModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public ColorChoiceBuilder setSysClr(SystemColorModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public ColorChoiceBuilder setSchemeClr(SchemeColorModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public ColorChoiceBuilder setPrstClr(PresetColorModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public ColorMRUModel.ColorChoiceModel build() {
      if (this.type == -1) return new ColorMRUModel.ColorChoiceModel();
      if (this.type == 0) return ColorMRUModel.ColorChoiceModel.newScrgbClr((ScRgbColorModel) this.value);
      if (this.type == 1) return ColorMRUModel.ColorChoiceModel.newSrgbClr((SRgbColorModel) this.value);
      if (this.type == 2) return ColorMRUModel.ColorChoiceModel.newHslClr((HslColorModel) this.value);
      if (this.type == 3) return ColorMRUModel.ColorChoiceModel.newSysClr((SystemColorModel) this.value);
      if (this.type == 4) return ColorMRUModel.ColorChoiceModel.newSchemeClr((SchemeColorModel) this.value);
      if (this.type == 5) return ColorMRUModel.ColorChoiceModel.newPrstClr((PresetColorModel) this.value);
      return null;
    }

    public ColorChoiceBuilder from(ColorMRUModel.ColorChoiceModel value) {
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
  }
}
