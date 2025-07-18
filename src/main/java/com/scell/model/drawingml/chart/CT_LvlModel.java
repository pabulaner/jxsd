package com.scell.model.drawingml.chart;

import java.util.List;

public class CT_LvlModel {
  private final List<CT_StrValModel> pt;

  public CT_LvlModel(List<CT_StrValModel> pt) {
    this.pt = pt;
  }

  public List<CT_StrValModel> getPt() {
    return this.pt;
  }
}
