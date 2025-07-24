package com.scell.model.drawingml.chart;

import java.util.List;

public class PivotFmtsModel {
  private final List<PivotFmtModel> pivotFmt;

  public PivotFmtsModel(List<PivotFmtModel> pivotFmt) {
    this.pivotFmt = pivotFmt;
  }

  public List<PivotFmtModel> getPivotFmt() {
    return this.pivotFmt;
  }
}
