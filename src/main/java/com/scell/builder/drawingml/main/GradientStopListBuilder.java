package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GradientStopListModel;
import com.scell.model.drawingml.main.GradientStopModel;
import java.util.List;

public class GradientStopListBuilder {
  private List<GradientStopModel> gs;

  public GradientStopListBuilder() {
  }

  public GradientStopListBuilder setGs(List<GradientStopModel> gs) {
    this.gs = gs;
    return this;
  }

  public GradientStopListModel build() {
    return new GradientStopListModel(this.gs);
  }

  public GradientStopListBuilder from(GradientStopListModel value) {
    this.gs = value.getGs();
    return this;
  }
}
