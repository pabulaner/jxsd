package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.LvlBuilder;

/**
 * This is a generated sequence class.
 */
public class LvlModel {
  private final List<StrValModel> pt;

  public LvlModel(List<StrValModel> pt) {
    this.pt = pt;
  }

  public LvlBuilder builder() {
    return new LvlBuilder().from(this);
  }

  public List<StrValModel> getPt() {
    return this.pt;
  }
}
