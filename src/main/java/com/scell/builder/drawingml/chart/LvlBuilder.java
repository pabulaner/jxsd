package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LvlModel;
import com.scell.model.drawingml.chart.StrValModel;
import java.util.List;

public class LvlBuilder {
  private List<StrValModel> pt;

  public LvlBuilder() {
  }

  public LvlBuilder setPt(List<StrValModel> pt) {
    this.pt = pt;
    return this;
  }

  public LvlModel build() {
    return new LvlModel(this.pt);
  }

  public LvlBuilder from(LvlModel value) {
    this.pt = value.getPt();
    return this;
  }
}
