package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideListModel;
import com.scell.model.drawingml.main.GeomGuideModel;
import java.util.List;

public class GeomGuideListBuilder {
  private List<GeomGuideModel> gd;

  public GeomGuideListBuilder() {
  }

  public GeomGuideListBuilder setGd(List<GeomGuideModel> gd) {
    this.gd = gd;
    return this;
  }

  public GeomGuideListModel build() {
    return new GeomGuideListModel(this.gd);
  }

  public GeomGuideListBuilder from(GeomGuideListModel value) {
    this.gd = value.getGd();
    return this;
  }
}
