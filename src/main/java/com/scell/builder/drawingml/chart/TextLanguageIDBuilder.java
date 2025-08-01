package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.TextLanguageIDModel;
import com.scell.model.drawingml.chart.TextLanguageIDValueModel;

public class TextLanguageIDBuilder {
  private TextLanguageIDValueModel val;

  public TextLanguageIDBuilder() {
  }

  public TextLanguageIDBuilder setVal(TextLanguageIDValueModel val) {
    this.val = val;
    return this;
  }

  public TextLanguageIDModel build() {
    return new TextLanguageIDModel(this.val);
  }

  public TextLanguageIDBuilder from(TextLanguageIDModel value) {
    this.val = value.getVal();
    return this;
  }
}
