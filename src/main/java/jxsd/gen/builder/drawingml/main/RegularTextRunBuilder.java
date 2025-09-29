package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.RegularTextRunModel;
import jxsd.gen.model.drawingml.main.TextCharacterPropertiesModel;

/**
 * This is a generated sequence class.
 */
public class RegularTextRunBuilder {
  private TextCharacterPropertiesModel rPr;

  private String t;

  public RegularTextRunBuilder() {
  }

  public RegularTextRunBuilder setRPr(TextCharacterPropertiesModel rPr) {
    this.rPr = rPr;
    return this;
  }

  public RegularTextRunBuilder setT(String t) {
    this.t = t;
    return this;
  }

  public RegularTextRunBuilder from(RegularTextRunModel value) {
    this.rPr = value.getRPr();
    this.t = value.getT();
    return this;
  }

  public RegularTextRunModel build() {
    return new RegularTextRunModel(this.rPr, this.t);
  }
}
