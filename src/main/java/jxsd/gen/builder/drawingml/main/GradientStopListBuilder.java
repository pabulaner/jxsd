package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.GradientStopListModel;
import jxsd.gen.model.drawingml.main.GradientStopModel;

/**
 * This is a generated sequence class.
 */
public class GradientStopListBuilder {
  private List<GradientStopModel> gs;

  public GradientStopListBuilder() {
  }

  public GradientStopListBuilder setGs(List<GradientStopModel> gs) {
    this.gs = gs;
    return this;
  }

  public GradientStopListBuilder from(GradientStopListModel value) {
    this.gs = value.getGs();
    return this;
  }

  public GradientStopListModel build() {
    return new GradientStopListModel(this.gs);
  }
}
