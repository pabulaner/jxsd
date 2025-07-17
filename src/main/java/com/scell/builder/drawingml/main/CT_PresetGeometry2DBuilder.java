package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_GeomGuideListModel;
import com.scell.model.drawingml.main.CT_PresetGeometry2DModel;
import com.scell.model.drawingml.main.ST_ShapeTypeModel;

public class CT_PresetGeometry2DBuilder {
  private ST_ShapeTypeModel prst;

  private CT_GeomGuideListModel avLst;

  public CT_PresetGeometry2DBuilder() {
  }

  public CT_PresetGeometry2DBuilder setPrst(ST_ShapeTypeModel prst) {
    this.prst = prst;
    return this;
  }

  public CT_PresetGeometry2DBuilder setAvLst(CT_GeomGuideListModel avLst) {
    this.avLst = avLst;
    return this;
  }

  public CT_PresetGeometry2DModel build() {
    return new CT_PresetGeometry2DModel(this.prst, this.avLst);
  }

  public CT_PresetGeometry2DBuilder from(CT_PresetGeometry2DModel value) {
    this.prst = value.getPrst();
    this.avLst = value.getAvLst();
    return this;
  }
}
