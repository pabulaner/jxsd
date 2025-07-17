package model.drawingml.chart;

import java.util.List;

public class CT_PivotFmtsModel {
  private final List<CT_PivotFmtModel> pivotFmt;

  public CT_PivotFmtsModel(List<CT_PivotFmtModel> pivotFmt) {
    this.pivotFmt = pivotFmt;
  }

  public List<CT_PivotFmtModel> getPivotFmt() {
    return this.pivotFmt;
  }
}
