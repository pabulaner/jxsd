package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_GradientStopListModel;
import com.scell.model.drawingml.main.CT_GradientStopModel;
import java.util.List;

public class CT_GradientStopListBuilder {
  private List<CT_GradientStopModel> gs;

  public CT_GradientStopListBuilder() {
  }

  public CT_GradientStopListBuilder setGs(List<CT_GradientStopModel> gs) {
    this.gs = gs;
    return this;
  }

  public CT_GradientStopListModel build() {
    return new CT_GradientStopListModel(this.gs);
  }

  public CT_GradientStopListBuilder from(CT_GradientStopListModel value) {
    this.gs = value.getGs();
    return this;
  }
}
