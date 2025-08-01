package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CrossBetweenValueModel;

public class CrossBetweenValueBuilder {
  private CrossBetweenValueModel value;

  public CrossBetweenValueBuilder() {
    this.value = null;
  }

  public CrossBetweenValueBuilder from(CrossBetweenValueModel value) {
    this.value = value;
    return this;
  }

  public CrossBetweenValueModel build() {
    return this.value;
  }

  public CrossBetweenValueBuilder setValue(CrossBetweenValueModel value) {
    this.value = value;
    return this;
  }
}
