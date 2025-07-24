package com.scell.model.drawingml.chart;

import java.util.List;

public class BandFmtsModel {
  private final List<BandFmtModel> bandFmt;

  public BandFmtsModel(List<BandFmtModel> bandFmt) {
    this.bandFmt = bandFmt;
  }

  public List<BandFmtModel> getBandFmt() {
    return this.bandFmt;
  }
}
