package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.DispBlanksAsModel;

public class DispBlanksAsBuilder {
  private DispBlanksAsModel val;

  public DispBlanksAsBuilder() {
  }

  public DispBlanksAsBuilder setVal(DispBlanksAsModel val) {
    this.val = val;
    return this;
  }

  public DispBlanksAsModel build() {
    return new DispBlanksAsModel(this.val);
  }

  public DispBlanksAsBuilder from(DispBlanksAsModel value) {
    this.val = value.getVal();
    return this;
  }
}
