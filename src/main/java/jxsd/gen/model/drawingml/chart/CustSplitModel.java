package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.CustSplitBuilder;

/**
 * This is a generated sequence class.
 */
public class CustSplitModel {
  private final List<UnsignedIntModel> secondPiePt;

  public CustSplitModel(List<UnsignedIntModel> secondPiePt) {
    this.secondPiePt = secondPiePt;
  }

  public CustSplitBuilder builder() {
    return new CustSplitBuilder().from(this);
  }

  public List<UnsignedIntModel> getSecondPiePt() {
    return this.secondPiePt;
  }
}
