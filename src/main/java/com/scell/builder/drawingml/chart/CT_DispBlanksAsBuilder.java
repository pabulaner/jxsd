package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DispBlanksAsModel;
import com.scell.model.drawingml.chart.ST_DispBlanksAsModel;

public class CT_DispBlanksAsBuilder {
  private ST_DispBlanksAsModel val;

  public CT_DispBlanksAsBuilder() {
  }

  public CT_DispBlanksAsBuilder setVal(ST_DispBlanksAsModel val) {
    this.val = val;
    return this;
  }

  public CT_DispBlanksAsModel build() {
    return new CT_DispBlanksAsModel(this.val);
  }

  public CT_DispBlanksAsBuilder from(CT_DispBlanksAsModel value) {
    this.val = value.getVal();
    return this;
  }
}
