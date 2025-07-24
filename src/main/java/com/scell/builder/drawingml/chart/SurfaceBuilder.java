package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.PictureOptionsModel;
import com.scell.model.drawingml.chart.SurfaceModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;

public class SurfaceBuilder {
  private UnsignedIntModel thickness;

  private ShapePropertiesModel spPr;

  private PictureOptionsModel pictureOptions;

  private ExtensionListModel extLst;

  public SurfaceBuilder() {
  }

  public SurfaceBuilder setThickness(UnsignedIntModel thickness) {
    this.thickness = thickness;
    return this;
  }

  public SurfaceBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public SurfaceBuilder setPictureOptions(PictureOptionsModel pictureOptions) {
    this.pictureOptions = pictureOptions;
    return this;
  }

  public SurfaceBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public SurfaceModel build() {
    return new SurfaceModel(this.thickness, this.spPr, this.pictureOptions, this.extLst);
  }

  public SurfaceBuilder from(SurfaceModel value) {
    this.thickness = value.getThickness();
    this.spPr = value.getSpPr();
    this.pictureOptions = value.getPictureOptions();
    this.extLst = value.getExtLst();
    return this;
  }
}
