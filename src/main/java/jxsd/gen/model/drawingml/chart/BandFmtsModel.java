package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.BandFmtsBuilder;

/**
 * This is a generated sequence class.
 */
public class BandFmtsModel {
  private final List<BandFmtModel> bandFmt;

  public BandFmtsModel(List<BandFmtModel> bandFmt) {
    this.bandFmt = bandFmt;
  }

  public BandFmtsBuilder builder() {
    return new BandFmtsBuilder().from(this);
  }

  public List<BandFmtModel> getBandFmt() {
    return this.bandFmt;
  }
}
