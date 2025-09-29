package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.DispBlanksAsValueModel;

/**
 * This is a generated enum class.
 */
public class DispBlanksAsValueBuilder {
  private DispBlanksAsValueModel value;

  public DispBlanksAsValueBuilder() {
  }

  public DispBlanksAsValueBuilder setValue(DispBlanksAsValueModel value) {
    this.value = value;
    return this;
  }

  public DispBlanksAsValueBuilder from(DispBlanksAsValueModel value) {
    this.value = value;
    return this;
  }

  public DispBlanksAsValueModel build() {
    return this.value;
  }
}
