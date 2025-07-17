package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorModel;
import com.scell.model.drawingml.main.CT_PatternFillPropertiesModel;
import com.scell.model.drawingml.main.ST_PresetPatternValModel;

public class CT_PatternFillPropertiesBuilder {
  private ST_PresetPatternValModel prst;

  private CT_ColorModel fgClr;

  private CT_ColorModel bgClr;

  public CT_PatternFillPropertiesBuilder() {
  }

  public CT_PatternFillPropertiesBuilder setPrst(ST_PresetPatternValModel prst) {
    this.prst = prst;
    return this;
  }

  public CT_PatternFillPropertiesBuilder setFgClr(CT_ColorModel fgClr) {
    this.fgClr = fgClr;
    return this;
  }

  public CT_PatternFillPropertiesBuilder setBgClr(CT_ColorModel bgClr) {
    this.bgClr = bgClr;
    return this;
  }

  public CT_PatternFillPropertiesModel build() {
    return new CT_PatternFillPropertiesModel(this.prst, this.fgClr, this.bgClr);
  }

  public CT_PatternFillPropertiesBuilder from(CT_PatternFillPropertiesModel value) {
    this.prst = value.getPrst();
    this.fgClr = value.getFgClr();
    this.bgClr = value.getBgClr();
    return this;
  }
}
