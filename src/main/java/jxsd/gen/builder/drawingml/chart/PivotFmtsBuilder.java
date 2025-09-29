package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.PivotFmtModel;
import jxsd.gen.model.drawingml.chart.PivotFmtsModel;

/**
 * This is a generated sequence class.
 */
public class PivotFmtsBuilder {
  private List<PivotFmtModel> pivotFmt;

  public PivotFmtsBuilder() {
  }

  public PivotFmtsBuilder setPivotFmt(List<PivotFmtModel> pivotFmt) {
    this.pivotFmt = pivotFmt;
    return this;
  }

  public PivotFmtsBuilder from(PivotFmtsModel value) {
    this.pivotFmt = value.getPivotFmt();
    return this;
  }

  public PivotFmtsModel build() {
    return new PivotFmtsModel(this.pivotFmt);
  }
}
