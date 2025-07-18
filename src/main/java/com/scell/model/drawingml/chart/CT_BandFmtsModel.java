package com.scell.model.drawingml.chart;

import java.util.List;

public class CT_BandFmtsModel {
  private final List<CT_BandFmtModel> bandFmt;

  public CT_BandFmtsModel(List<CT_BandFmtModel> bandFmt) {
    this.bandFmt = bandFmt;
  }

  public List<CT_BandFmtModel> getBandFmt() {
    return this.bandFmt;
  }
}
