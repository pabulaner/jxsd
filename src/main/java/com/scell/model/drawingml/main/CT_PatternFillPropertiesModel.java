package com.scell.model.drawingml.main;

public class CT_PatternFillPropertiesModel {
  private final ST_PresetPatternValModel prst;

  private final CT_ColorModel fgClr;

  private final CT_ColorModel bgClr;

  public CT_PatternFillPropertiesModel(ST_PresetPatternValModel prst, CT_ColorModel fgClr,
      CT_ColorModel bgClr) {
    this.prst = prst;
    this.fgClr = fgClr;
    this.bgClr = bgClr;
  }

  public ST_PresetPatternValModel getPrst() {
    return this.prst;
  }

  public CT_ColorModel getFgClr() {
    return this.fgClr;
  }

  public CT_ColorModel getBgClr() {
    return this.bgClr;
  }
}
