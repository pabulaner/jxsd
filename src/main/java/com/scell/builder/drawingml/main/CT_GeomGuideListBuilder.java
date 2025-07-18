package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_GeomGuideListModel;
import com.scell.model.drawingml.main.CT_GeomGuideModel;
import java.util.List;

public class CT_GeomGuideListBuilder {
  private List<CT_GeomGuideModel> gd;

  public CT_GeomGuideListBuilder() {
  }

  public CT_GeomGuideListBuilder setGd(List<CT_GeomGuideModel> gd) {
    this.gd = gd;
    return this;
  }

  public CT_GeomGuideListModel build() {
    return new CT_GeomGuideListModel(this.gd);
  }

  public CT_GeomGuideListBuilder from(CT_GeomGuideListModel value) {
    this.gd = value.getGd();
    return this;
  }
}
