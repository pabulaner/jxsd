package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.CrossBetweenModel;
import jxsd.gen.model.drawingml.chart.CrossBetweenValueModel;

/**
 * This is a generated sequence class.
 */
public class CrossBetweenBuilder {
  private CrossBetweenValueModel val;

  public CrossBetweenBuilder() {
  }

  public CrossBetweenBuilder setVal(CrossBetweenValueModel val) {
    this.val = val;
    return this;
  }

  public CrossBetweenBuilder from(CrossBetweenModel value) {
    this.val = value.getVal();
    return this;
  }

  public CrossBetweenModel build() {
    return new CrossBetweenModel(this.val);
  }
}
