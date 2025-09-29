package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.PivotFmtsBuilder;

/**
 * This is a generated sequence class.
 */
public class PivotFmtsModel {
  private final List<PivotFmtModel> pivotFmt;

  public PivotFmtsModel(List<PivotFmtModel> pivotFmt) {
    this.pivotFmt = pivotFmt;
  }

  public PivotFmtsBuilder builder() {
    return new PivotFmtsBuilder().from(this);
  }

  public List<PivotFmtModel> getPivotFmt() {
    return this.pivotFmt;
  }
}
