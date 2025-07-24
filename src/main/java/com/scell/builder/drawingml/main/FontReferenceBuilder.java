package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FontCollectionIndexModel;
import com.scell.model.drawingml.main.FontReferenceModel;
import com.scell.model.drawingml.main.HslColorModel;
import com.scell.model.drawingml.main.PresetColorModel;
import com.scell.model.drawingml.main.SRgbColorModel;
import com.scell.model.drawingml.main.ScRgbColorModel;
import com.scell.model.drawingml.main.SchemeColorModel;
import com.scell.model.drawingml.main.SystemColorModel;
import java.lang.Object;

public class FontReferenceBuilder {
  private FontCollectionIndexModel idx;

  private FontReferenceModel.ColorChoiceModel egColorChoice;

  public FontReferenceBuilder() {
  }

  public FontReferenceBuilder setIdx(FontCollectionIndexModel idx) {
    this.idx = idx;
    return this;
  }

  public FontReferenceBuilder setEGColorChoice(FontReferenceModel.ColorChoiceModel egColorChoice) {
    this.egColorChoice = egColorChoice;
    return this;
  }

  public FontReferenceModel build() {
    return new FontReferenceModel(this.idx, this.egColorChoice);
  }

  public FontReferenceBuilder from(FontReferenceModel value) {
    this.idx = value.getIdx();
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

    public FontReferenceModel.ColorChoiceModel build() {
      if (this.type == -1) return new FontReferenceModel.ColorChoiceModel();
      if (this.type == 0) return FontReferenceModel.ColorChoiceModel.newScrgbClr((ScRgbColorModel) this.value);
      if (this.type == 1) return FontReferenceModel.ColorChoiceModel.newSrgbClr((SRgbColorModel) this.value);
      if (this.type == 2) return FontReferenceModel.ColorChoiceModel.newHslClr((HslColorModel) this.value);
      if (this.type == 3) return FontReferenceModel.ColorChoiceModel.newSysClr((SystemColorModel) this.value);
      if (this.type == 4) return FontReferenceModel.ColorChoiceModel.newSchemeClr((SchemeColorModel) this.value);
      if (this.type == 5) return FontReferenceModel.ColorChoiceModel.newPrstClr((PresetColorModel) this.value);
      return null;
    }

    public ColorChoiceBuilder from(FontReferenceModel.ColorChoiceModel value) {
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
