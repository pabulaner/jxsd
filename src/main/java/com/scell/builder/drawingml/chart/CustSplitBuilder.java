package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CustSplitModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import java.util.List;

public class CustSplitBuilder {
  private List<UnsignedIntModel> secondPiePt;

  public CustSplitBuilder() {
  }

  public CustSplitBuilder setSecondPiePt(List<UnsignedIntModel> secondPiePt) {
    this.secondPiePt = secondPiePt;
    return this;
  }

  public CustSplitModel build() {
    return new CustSplitModel(this.secondPiePt);
  }

  public CustSplitBuilder from(CustSplitModel value) {
    this.secondPiePt = value.getSecondPiePt();
    return this;
  }
}
