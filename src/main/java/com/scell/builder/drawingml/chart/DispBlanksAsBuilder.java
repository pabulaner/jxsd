package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.DispBlanksAsModel;
import com.scell.model.drawingml.chart.DispBlanksAsValueModel;

public class DispBlanksAsBuilder {
  private DispBlanksAsValueModel val;

  public DispBlanksAsBuilder() {
  }

  public DispBlanksAsBuilder setVal(DispBlanksAsValueModel val) {
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
