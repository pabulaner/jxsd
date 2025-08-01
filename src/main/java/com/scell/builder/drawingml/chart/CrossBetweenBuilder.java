package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CrossBetweenModel;
import com.scell.model.drawingml.chart.CrossBetweenValueModel;

public class CrossBetweenBuilder {
  private CrossBetweenValueModel val;

  public CrossBetweenBuilder() {
  }

  public CrossBetweenBuilder setVal(CrossBetweenValueModel val) {
    this.val = val;
    return this;
  }

  public CrossBetweenModel build() {
    return new CrossBetweenModel(this.val);
  }

  public CrossBetweenBuilder from(CrossBetweenModel value) {
    this.val = value.getVal();
    return this;
  }
}
