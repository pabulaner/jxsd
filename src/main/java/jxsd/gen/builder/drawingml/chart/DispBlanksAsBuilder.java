package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.DispBlanksAsModel;
import jxsd.gen.model.drawingml.chart.DispBlanksAsValueModel;

/**
 * This is a generated sequence class.
 */
public class DispBlanksAsBuilder {
  private DispBlanksAsValueModel val;

  public DispBlanksAsBuilder() {
  }

  public DispBlanksAsBuilder setVal(DispBlanksAsValueModel val) {
    this.val = val;
    return this;
  }

  public DispBlanksAsBuilder from(DispBlanksAsModel value) {
    this.val = value.getVal();
    return this;
  }

  public DispBlanksAsModel build() {
    return new DispBlanksAsModel(this.val);
  }
}
