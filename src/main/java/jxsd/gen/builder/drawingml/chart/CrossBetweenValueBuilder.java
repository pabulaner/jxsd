package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.CrossBetweenValueModel;

/**
 * This is a generated enum class.
 */
public class CrossBetweenValueBuilder {
  private CrossBetweenValueModel value;

  public CrossBetweenValueBuilder() {
  }

  public CrossBetweenValueBuilder setValue(CrossBetweenValueModel value) {
    this.value = value;
    return this;
  }

  public CrossBetweenValueBuilder from(CrossBetweenValueModel value) {
    this.value = value;
    return this;
  }

  public CrossBetweenValueModel build() {
    return this.value;
  }
}
