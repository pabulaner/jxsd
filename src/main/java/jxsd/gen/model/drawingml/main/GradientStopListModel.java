package jxsd.gen.model.drawingml.main;

import java.util.List;
import jxsd.gen.builder.drawingml.main.GradientStopListBuilder;

/**
 * This is a generated sequence class.
 */
public class GradientStopListModel {
  private final List<GradientStopModel> gs;

  public GradientStopListModel(List<GradientStopModel> gs) {
    this.gs = gs;
  }

  public GradientStopListBuilder builder() {
    return new GradientStopListBuilder().from(this);
  }

  public List<GradientStopModel> getGs() {
    return this.gs;
  }
}
