package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BandFmtModel;
import com.scell.model.drawingml.chart.CT_BandFmtsModel;
import java.util.List;

public class CT_BandFmtsBuilder {
  private List<CT_BandFmtModel> bandFmt;

  public CT_BandFmtsBuilder() {
  }

  public CT_BandFmtsBuilder setBandFmt(List<CT_BandFmtModel> bandFmt) {
    this.bandFmt = bandFmt;
    return this;
  }

  public CT_BandFmtsModel build() {
    return new CT_BandFmtsModel(this.bandFmt);
  }

  public CT_BandFmtsBuilder from(CT_BandFmtsModel value) {
    this.bandFmt = value.getBandFmt();
    return this;
  }
}
