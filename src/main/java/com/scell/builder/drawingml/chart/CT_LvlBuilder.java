package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LvlModel;
import com.scell.model.drawingml.chart.CT_StrValModel;
import java.util.List;

public class CT_LvlBuilder {
  private List<CT_StrValModel> pt;

  public CT_LvlBuilder() {
  }

  public CT_LvlBuilder setPt(List<CT_StrValModel> pt) {
    this.pt = pt;
    return this;
  }

  public CT_LvlModel build() {
    return new CT_LvlModel(this.pt);
  }

  public CT_LvlBuilder from(CT_LvlModel value) {
    this.pt = value.getPt();
    return this;
  }
}
