package jxsd.gen.model.drawingml.main;

import java.util.List;
import jxsd.gen.builder.drawingml.main.GeomGuideListBuilder;

/**
 * This is a generated sequence class.
 */
public class GeomGuideListModel {
  private final List<GeomGuideModel> gd;

  public GeomGuideListModel(List<GeomGuideModel> gd) {
    this.gd = gd;
  }

  public GeomGuideListBuilder builder() {
    return new GeomGuideListBuilder().from(this);
  }

  public List<GeomGuideModel> getGd() {
    return this.gd;
  }
}
