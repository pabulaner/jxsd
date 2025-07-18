package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PivotFmtModel;
import com.scell.model.drawingml.chart.CT_PivotFmtsModel;
import java.util.List;

public class CT_PivotFmtsBuilder {
  private List<CT_PivotFmtModel> pivotFmt;

  public CT_PivotFmtsBuilder() {
  }

  public CT_PivotFmtsBuilder setPivotFmt(List<CT_PivotFmtModel> pivotFmt) {
    this.pivotFmt = pivotFmt;
    return this;
  }

  public CT_PivotFmtsModel build() {
    return new CT_PivotFmtsModel(this.pivotFmt);
  }

  public CT_PivotFmtsBuilder from(CT_PivotFmtsModel value) {
    this.pivotFmt = value.getPivotFmt();
    return this;
  }
}
