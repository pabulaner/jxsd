package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_GeomGuideListModel;
import com.scell.model.drawingml.main.CT_PresetTextShapeModel;
import com.scell.model.drawingml.main.ST_TextShapeTypeModel;

public class CT_PresetTextShapeBuilder {
  private ST_TextShapeTypeModel prst;

  private CT_GeomGuideListModel avLst;

  public CT_PresetTextShapeBuilder() {
  }

  public CT_PresetTextShapeBuilder setPrst(ST_TextShapeTypeModel prst) {
    this.prst = prst;
    return this;
  }

  public CT_PresetTextShapeBuilder setAvLst(CT_GeomGuideListModel avLst) {
    this.avLst = avLst;
    return this;
  }

  public CT_PresetTextShapeModel build() {
    return new CT_PresetTextShapeModel(this.prst, this.avLst);
  }

  public CT_PresetTextShapeBuilder from(CT_PresetTextShapeModel value) {
    this.prst = value.getPrst();
    this.avLst = value.getAvLst();
    return this;
  }
}
