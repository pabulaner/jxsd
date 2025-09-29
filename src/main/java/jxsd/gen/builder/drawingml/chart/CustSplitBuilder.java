package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.CustSplitModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;

/**
 * This is a generated sequence class.
 */
public class CustSplitBuilder {
  private List<UnsignedIntModel> secondPiePt;

  public CustSplitBuilder() {
  }

  public CustSplitBuilder setSecondPiePt(List<UnsignedIntModel> secondPiePt) {
    this.secondPiePt = secondPiePt;
    return this;
  }

  public CustSplitBuilder from(CustSplitModel value) {
    this.secondPiePt = value.getSecondPiePt();
    return this;
  }

  public CustSplitModel build() {
    return new CustSplitModel(this.secondPiePt);
  }
}
