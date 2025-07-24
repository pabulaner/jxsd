package com.scell.model.drawingml.main;

import java.util.List;

public class GradientStopListModel {
  private final List<GradientStopModel> gs;

  public GradientStopListModel(List<GradientStopModel> gs) {
    this.gs = gs;
  }

  public List<GradientStopModel> getGs() {
    return this.gs;
  }
}
