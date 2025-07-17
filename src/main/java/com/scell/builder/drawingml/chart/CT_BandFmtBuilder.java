package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BandFmtModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;

public class CT_BandFmtBuilder {
  private CT_UnsignedIntModel idx;

  private CT_ShapePropertiesModel spPr;

  public CT_BandFmtBuilder() {
  }

  public CT_BandFmtBuilder setIdx(CT_UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_BandFmtBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_BandFmtModel build() {
    return new CT_BandFmtModel(this.idx, this.spPr);
  }

  public CT_BandFmtBuilder from(CT_BandFmtModel value) {
    this.idx = value.getIdx();
    this.spPr = value.getSpPr();
    return this;
  }
}
