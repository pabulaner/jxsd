package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BandFmtModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;

public class BandFmtBuilder {
  private UnsignedIntModel idx;

  private ShapePropertiesModel spPr;

  public BandFmtBuilder() {
  }

  public BandFmtBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public BandFmtBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public BandFmtModel build() {
    return new BandFmtModel(this.idx, this.spPr);
  }

  public BandFmtBuilder from(BandFmtModel value) {
    this.idx = value.getIdx();
    this.spPr = value.getSpPr();
    return this;
  }
}
