package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.RegularTextRunBuilder;

/**
 * This is a generated sequence class.
 */
public class RegularTextRunModel {
  private final TextCharacterPropertiesModel rPr;

  private final String t;

  public RegularTextRunModel(TextCharacterPropertiesModel rPr, String t) {
    this.rPr = rPr;
    this.t = t;
  }

  public RegularTextRunBuilder builder() {
    return new RegularTextRunBuilder().from(this);
  }

  public TextCharacterPropertiesModel getRPr() {
    return this.rPr;
  }

  public String getT() {
    return this.t;
  }
}
