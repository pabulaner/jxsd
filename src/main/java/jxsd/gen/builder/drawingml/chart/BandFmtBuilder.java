package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BandFmtModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
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

  public BandFmtBuilder from(BandFmtModel value) {
    this.idx = value.getIdx();
    this.spPr = value.getSpPr();
    return this;
  }

  public BandFmtModel build() {
    return new BandFmtModel(this.idx, this.spPr);
  }
}
