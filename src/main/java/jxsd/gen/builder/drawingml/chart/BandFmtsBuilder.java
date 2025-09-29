package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.BandFmtModel;
import jxsd.gen.model.drawingml.chart.BandFmtsModel;

/**
 * This is a generated sequence class.
 */
public class BandFmtsBuilder {
  private List<BandFmtModel> bandFmt;

  public BandFmtsBuilder() {
  }

  public BandFmtsBuilder setBandFmt(List<BandFmtModel> bandFmt) {
    this.bandFmt = bandFmt;
    return this;
  }

  public BandFmtsBuilder from(BandFmtsModel value) {
    this.bandFmt = value.getBandFmt();
    return this;
  }

  public BandFmtsModel build() {
    return new BandFmtsModel(this.bandFmt);
  }
}
