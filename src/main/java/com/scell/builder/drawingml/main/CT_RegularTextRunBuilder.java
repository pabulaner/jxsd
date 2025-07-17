package com.scell.builder.drawingml.main;

import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_RegularTextRunModel;
import com.scell.model.drawingml.main.CT_TextCharacterPropertiesModel;

public class CT_RegularTextRunBuilder {
  private CT_TextCharacterPropertiesModel rPr;

  private StringModel t;

  public CT_RegularTextRunBuilder() {
  }

  public CT_RegularTextRunBuilder setRPr(CT_TextCharacterPropertiesModel rPr) {
    this.rPr = rPr;
    return this;
  }

  public CT_RegularTextRunBuilder setT(StringModel t) {
    this.t = t;
    return this;
  }

  public CT_RegularTextRunModel build() {
    return new CT_RegularTextRunModel(this.rPr, this.t);
  }

  public CT_RegularTextRunBuilder from(CT_RegularTextRunModel value) {
    this.rPr = value.getRPr();
    this.t = value.getT();
    return this;
  }
}
