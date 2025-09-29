package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TextLanguageIDModel;

/**
 * This is a generated sequence class.
 */
public class TextLanguageIDBuilder {
  private String val;

  public TextLanguageIDBuilder() {
  }

  public TextLanguageIDBuilder setVal(String val) {
    this.val = val;
    return this;
  }

  public TextLanguageIDBuilder from(TextLanguageIDModel value) {
    this.val = value.getVal();
    return this;
  }

  public TextLanguageIDModel build() {
    return new TextLanguageIDModel(this.val);
  }
}
