package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.OfPieTypeBuilder;

/**
 * This is a generated sequence class.
 */
public class OfPieTypeModel {
  private final OfPieTypeValueModel val;

  public OfPieTypeModel(OfPieTypeValueModel val) {
    this.val = val;
  }

  public OfPieTypeBuilder builder() {
    return new OfPieTypeBuilder().from(this);
  }

  public OfPieTypeValueModel getVal() {
    return this.val;
  }
}
