package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PatternFillPropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class PatternFillPropertiesModel {
  private final PresetPatternValValueModel prst;

  private final ColorModel fgClr;

  private final ColorModel bgClr;

  public PatternFillPropertiesModel(PresetPatternValValueModel prst, ColorModel fgClr,
      ColorModel bgClr) {
    this.prst = prst;
    this.fgClr = fgClr;
    this.bgClr = bgClr;
  }

  public PatternFillPropertiesBuilder builder() {
    return new PatternFillPropertiesBuilder().from(this);
  }

  public PresetPatternValValueModel getPrst() {
    return this.prst;
  }

  public ColorModel getFgClr() {
    return this.fgClr;
  }

  public ColorModel getBgClr() {
    return this.bgClr;
  }
}
