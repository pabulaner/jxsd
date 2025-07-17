package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.CT_ShapePropertiesModel;

public class CT_SurfaceModel {
  private final CT_UnsignedIntModel thickness;

  private final CT_ShapePropertiesModel spPr;

  private final CT_PictureOptionsModel pictureOptions;

  private final CT_ExtensionListModel extLst;

  public CT_SurfaceModel(CT_UnsignedIntModel thickness, CT_ShapePropertiesModel spPr,
      CT_PictureOptionsModel pictureOptions, CT_ExtensionListModel extLst) {
    this.thickness = thickness;
    this.spPr = spPr;
    this.pictureOptions = pictureOptions;
    this.extLst = extLst;
  }

  public CT_UnsignedIntModel getThickness() {
    return this.thickness;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CT_PictureOptionsModel getPictureOptions() {
    return this.pictureOptions;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
