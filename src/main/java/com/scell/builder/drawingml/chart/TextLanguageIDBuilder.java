package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.TextLanguageIDModel;

public class TextLanguageIDBuilder {
  private TextLanguageIDModel val;

  public TextLanguageIDBuilder() {
  }

  public TextLanguageIDBuilder setVal(TextLanguageIDModel val) {
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
