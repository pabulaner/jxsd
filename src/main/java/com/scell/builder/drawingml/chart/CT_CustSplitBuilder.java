package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_CustSplitModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import java.util.List;

public class CT_CustSplitBuilder {
  private List<CT_UnsignedIntModel> secondPiePt;

  public CT_CustSplitBuilder() {
  }

  public CT_CustSplitBuilder setSecondPiePt(List<CT_UnsignedIntModel> secondPiePt) {
    this.secondPiePt = secondPiePt;
    return this;
  }

  public CT_CustSplitModel build() {
    return new CT_CustSplitModel(this.secondPiePt);
  }

  public CT_CustSplitBuilder from(CT_CustSplitModel value) {
    this.secondPiePt = value.getSecondPiePt();
    return this;
  }
}
