package com.scell.model.drawingml.main;

public class PatternFillPropertiesModel {
  private final PresetPatternValModel prst;

  private final ColorModel fgClr;

  private final ColorModel bgClr;

  public PatternFillPropertiesModel(PresetPatternValModel prst, ColorModel fgClr,
      ColorModel bgClr) {
    this.prst = prst;
    this.fgClr = fgClr;
    this.bgClr = bgClr;
  }

  public PresetPatternValModel getPrst() {
    return this.prst;
  }

  public ColorModel getFgClr() {
    return this.fgClr;
  }

  public ColorModel getBgClr() {
    return this.bgClr;
  }
}
