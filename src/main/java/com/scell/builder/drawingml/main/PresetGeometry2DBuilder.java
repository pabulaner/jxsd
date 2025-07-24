package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideListModel;
import com.scell.model.drawingml.main.PresetGeometry2DModel;
import com.scell.model.drawingml.main.ShapeTypeModel;

public class PresetGeometry2DBuilder {
  private ShapeTypeModel prst;

  private GeomGuideListModel avLst;

  public PresetGeometry2DBuilder() {
  }

  public PresetGeometry2DBuilder setPrst(ShapeTypeModel prst) {
    this.prst = prst;
    return this;
  }

  public PresetGeometry2DBuilder setAvLst(GeomGuideListModel avLst) {
    this.avLst = avLst;
    return this;
  }

  public PresetGeometry2DModel build() {
    return new PresetGeometry2DModel(this.prst, this.avLst);
  }

  public PresetGeometry2DBuilder from(PresetGeometry2DModel value) {
    this.prst = value.getPrst();
    this.avLst = value.getAvLst();
    return this;
  }
}
