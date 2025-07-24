package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PivotFmtModel;
import com.scell.model.drawingml.chart.PivotFmtsModel;
import java.util.List;

public class PivotFmtsBuilder {
  private List<PivotFmtModel> pivotFmt;

  public PivotFmtsBuilder() {
  }

  public PivotFmtsBuilder setPivotFmt(List<PivotFmtModel> pivotFmt) {
    this.pivotFmt = pivotFmt;
    return this;
  }

  public PivotFmtsModel build() {
    return new PivotFmtsModel(this.pivotFmt);
  }

  public PivotFmtsBuilder from(PivotFmtsModel value) {
    this.pivotFmt = value.getPivotFmt();
    return this;
  }
}
