package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BandFmtModel;
import com.scell.model.drawingml.chart.BandFmtsModel;
import java.util.List;

public class BandFmtsBuilder {
  private List<BandFmtModel> bandFmt;

  public BandFmtsBuilder() {
  }

  public BandFmtsBuilder setBandFmt(List<BandFmtModel> bandFmt) {
    this.bandFmt = bandFmt;
    return this;
  }

  public BandFmtsModel build() {
    return new BandFmtsModel(this.bandFmt);
  }

  public BandFmtsBuilder from(BandFmtsModel value) {
    this.bandFmt = value.getBandFmt();
    return this;
  }
}
