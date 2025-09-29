package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.MarkerStyleValueModel;

/**
 * This is a generated enum class.
 */
public class MarkerStyleValueBuilder {
  private MarkerStyleValueModel value;

  public MarkerStyleValueBuilder() {
  }

  public MarkerStyleValueBuilder setValue(MarkerStyleValueModel value) {
    this.value = value;
    return this;
  }

  public MarkerStyleValueBuilder from(MarkerStyleValueModel value) {
    this.value = value;
    return this;
  }

  public MarkerStyleValueModel build() {
    return this.value;
  }
}
