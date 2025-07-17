package model.drawingml.main;

import java.util.List;

public class CT_GradientStopListModel {
  private final List<CT_GradientStopModel> gs;

  public CT_GradientStopListModel(List<CT_GradientStopModel> gs) {
    this.gs = gs;
  }

  public List<CT_GradientStopModel> getGs() {
    return this.gs;
  }
}
