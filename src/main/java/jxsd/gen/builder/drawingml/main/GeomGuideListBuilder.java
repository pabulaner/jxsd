package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.GeomGuideListModel;
import jxsd.gen.model.drawingml.main.GeomGuideModel;

/**
 * This is a generated sequence class.
 */
public class GeomGuideListBuilder {
  private List<GeomGuideModel> gd;

  public GeomGuideListBuilder() {
  }

  public GeomGuideListBuilder setGd(List<GeomGuideModel> gd) {
    this.gd = gd;
    return this;
  }

  public GeomGuideListBuilder from(GeomGuideListModel value) {
    this.gd = value.getGd();
    return this;
  }

  public GeomGuideListModel build() {
    return new GeomGuideListModel(this.gd);
  }
}
