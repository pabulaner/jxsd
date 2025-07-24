package com.scell.model.drawingml.main;

import java.util.List;

public class GeomGuideListModel {
  private final List<GeomGuideModel> gd;

  public GeomGuideListModel(List<GeomGuideModel> gd) {
    this.gd = gd;
  }

  public List<GeomGuideModel> getGd() {
    return this.gd;
  }
}
