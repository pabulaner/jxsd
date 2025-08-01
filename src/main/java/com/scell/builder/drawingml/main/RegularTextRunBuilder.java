package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.main.RegularTextRunModel;
import com.scell.model.drawingml.main.TextCharacterPropertiesModel;

public class RegularTextRunBuilder {
  private TextCharacterPropertiesModel rPr;

  private StringValueModel t;

  public RegularTextRunBuilder() {
  }

  public RegularTextRunBuilder setRPr(TextCharacterPropertiesModel rPr) {
    this.rPr = rPr;
    return this;
  }

  public RegularTextRunBuilder setT(StringValueModel t) {
    this.t = t;
    return this;
  }

  public RegularTextRunModel build() {
    return new RegularTextRunModel(this.rPr, this.t);
  }

  public RegularTextRunBuilder from(RegularTextRunModel value) {
    this.rPr = value.getRPr();
    this.t = value.getT();
    return this;
  }
}
