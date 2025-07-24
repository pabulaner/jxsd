package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideListModel;
import com.scell.model.drawingml.main.PresetTextShapeModel;
import com.scell.model.drawingml.main.TextShapeTypeModel;

public class PresetTextShapeBuilder {
  private TextShapeTypeModel prst;

  private GeomGuideListModel avLst;

  public PresetTextShapeBuilder() {
  }

  public PresetTextShapeBuilder setPrst(TextShapeTypeModel prst) {
    this.prst = prst;
    return this;
  }

  public PresetTextShapeBuilder setAvLst(GeomGuideListModel avLst) {
    this.avLst = avLst;
    return this;
  }

  public PresetTextShapeModel build() {
    return new PresetTextShapeModel(this.prst, this.avLst);
  }

  public PresetTextShapeBuilder from(PresetTextShapeModel value) {
    this.prst = value.getPrst();
    this.avLst = value.getAvLst();
    return this;
  }
}
