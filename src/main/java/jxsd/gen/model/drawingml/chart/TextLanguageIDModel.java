package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.TextLanguageIDBuilder;

/**
 * This is a generated sequence class.
 */
public class TextLanguageIDModel {
  private final String val;

  public TextLanguageIDModel(String val) {
    this.val = val;
  }

  public TextLanguageIDBuilder builder() {
    return new TextLanguageIDBuilder().from(this);
  }

  public String getVal() {
    return this.val;
  }
}
