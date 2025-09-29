package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.DispBlanksAsBuilder;

/**
 * This is a generated sequence class.
 */
public class DispBlanksAsModel {
  private final DispBlanksAsValueModel val;

  public DispBlanksAsModel(DispBlanksAsValueModel val) {
    this.val = val;
  }

  public DispBlanksAsBuilder builder() {
    return new DispBlanksAsBuilder().from(this);
  }

  public DispBlanksAsValueModel getVal() {
    return this.val;
  }
}
