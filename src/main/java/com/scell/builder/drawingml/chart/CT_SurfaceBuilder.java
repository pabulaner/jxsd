package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_PictureOptionsModel;
import com.scell.model.drawingml.chart.CT_SurfaceModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;

public class CT_SurfaceBuilder {
  private CT_UnsignedIntModel thickness;

  private CT_ShapePropertiesModel spPr;

  private CT_PictureOptionsModel pictureOptions;

  private CT_ExtensionListModel extLst;

  public CT_SurfaceBuilder() {
  }

  public CT_SurfaceBuilder setThickness(CT_UnsignedIntModel thickness) {
    this.thickness = thickness;
    return this;
  }

  public CT_SurfaceBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_SurfaceBuilder setPictureOptions(CT_PictureOptionsModel pictureOptions) {
    this.pictureOptions = pictureOptions;
    return this;
  }

  public CT_SurfaceBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_SurfaceModel build() {
    return new CT_SurfaceModel(this.thickness, this.spPr, this.pictureOptions, this.extLst);
  }

  public CT_SurfaceBuilder from(CT_SurfaceModel value) {
    this.thickness = value.getThickness();
    this.spPr = value.getSpPr();
    this.pictureOptions = value.getPictureOptions();
    this.extLst = value.getExtLst();
    return this;
  }
}
