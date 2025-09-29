package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.BandFmtBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class BandFmtModel {
  private final UnsignedIntModel idx;

  private final ShapePropertiesModel spPr;

  public BandFmtModel(UnsignedIntModel idx, ShapePropertiesModel spPr) {
    this.idx = idx;
    this.spPr = spPr;
  }

  public BandFmtBuilder builder() {
    return new BandFmtBuilder().from(this);
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }
}
