package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.ColorModel;
import jxsd.gen.model.drawingml.main.PatternFillPropertiesModel;
import jxsd.gen.model.drawingml.main.PresetPatternValValueModel;

/**
 * This is a generated sequence class.
 */
public class PatternFillPropertiesBuilder {
  private PresetPatternValValueModel prst;

  private ColorModel fgClr;

  private ColorModel bgClr;

  public PatternFillPropertiesBuilder() {
  }

  public PatternFillPropertiesBuilder setPrst(PresetPatternValValueModel prst) {
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

  public PatternFillPropertiesBuilder from(PatternFillPropertiesModel value) {
    this.prst = value.getPrst();
    this.fgClr = value.getFgClr();
    this.bgClr = value.getBgClr();
    return this;
  }

  public PatternFillPropertiesModel build() {
    return new PatternFillPropertiesModel(this.prst, this.fgClr, this.bgClr);
  }
}
