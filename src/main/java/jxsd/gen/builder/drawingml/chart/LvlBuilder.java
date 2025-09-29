package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.LvlModel;
import jxsd.gen.model.drawingml.chart.StrValModel;

/**
 * This is a generated sequence class.
 */
public class LvlBuilder {
  private List<StrValModel> pt;

  public LvlBuilder() {
  }

  public LvlBuilder setPt(List<StrValModel> pt) {
    this.pt = pt;
    return this;
  }

  public LvlBuilder from(LvlModel value) {
    this.pt = value.getPt();
    return this;
  }

  public LvlModel build() {
    return new LvlModel(this.pt);
  }
}
