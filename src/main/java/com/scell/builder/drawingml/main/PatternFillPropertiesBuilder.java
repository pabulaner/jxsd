package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ColorModel;
import com.scell.model.drawingml.main.PatternFillPropertiesModel;
import com.scell.model.drawingml.main.PresetPatternValModel;

public class PatternFillPropertiesBuilder {
  private PresetPatternValModel prst;

  private ColorModel fgClr;

  private ColorModel bgClr;

  public PatternFillPropertiesBuilder() {
  }

  public PatternFillPropertiesBuilder setPrst(PresetPatternValModel prst) {
    this.prst = prst;
    return this;
  }

  public PatternFillPropertiesBuilder setFgClr(ColorModel fgClr) {
    this.fgClr = fgClr;
    return this;
  }

  public PatternFillPropertiesBuilder setBgClr(ColorModel bgClr) {
    this.bgClr = bgClr;
    return this;
  }

  public PatternFillPropertiesModel build() {
    return new PatternFillPropertiesModel(this.prst, this.fgClr, this.bgClr);
  }

  public PatternFillPropertiesBuilder from(PatternFillPropertiesModel value) {
    this.prst = value.getPrst();
    this.fgClr = value.getFgClr();
    this.bgClr = value.getBgClr();
    return this;
  }
}
