package com.scell.model.drawingml.chart;

import java.util.List;

public class LvlModel {
  private final List<StrValModel> pt;

  public LvlModel(List<StrValModel> pt) {
    this.pt = pt;
  }

  public List<StrValModel> getPt() {
    return this.pt;
  }
}
