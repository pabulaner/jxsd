package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_TextLanguageIDModel;
import com.scell.model.drawingml.chart.ST_TextLanguageIDModel;

public class CT_TextLanguageIDBuilder {
  private ST_TextLanguageIDModel val;

  public CT_TextLanguageIDBuilder() {
  }

  public CT_TextLanguageIDBuilder setVal(ST_TextLanguageIDModel val) {
    this.val = val;
    return this;
  }

  public CT_TextLanguageIDModel build() {
    return new CT_TextLanguageIDModel(this.val);
  }

  public CT_TextLanguageIDBuilder from(CT_TextLanguageIDModel value) {
    this.val = value.getVal();
    return this;
  }
}
