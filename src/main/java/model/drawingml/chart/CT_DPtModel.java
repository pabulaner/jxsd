package model.drawingml.chart;

import model.drawingml.main.CT_ShapePropertiesModel;

public class CT_DPtModel {
  private final CT_UnsignedIntModel idx;

  private final CT_BooleanModel invertIfNegative;

  private final CT_MarkerModel marker;

  private final CT_BooleanModel bubble3D;

  private final CT_UnsignedIntModel explosion;

  private final CT_ShapePropertiesModel spPr;

  private final CT_PictureOptionsModel pictureOptions;

  private final CT_ExtensionListModel extLst;

  public CT_DPtModel(CT_UnsignedIntModel idx, CT_BooleanModel invertIfNegative,
      CT_MarkerModel marker, CT_BooleanModel bubble3D, CT_UnsignedIntModel explosion,
      CT_ShapePropertiesModel spPr, CT_PictureOptionsModel pictureOptions,
      CT_ExtensionListModel extLst) {
    this.idx = idx;
    this.invertIfNegative = invertIfNegative;
    this.marker = marker;
    this.bubble3D = bubble3D;
    this.explosion = explosion;
    this.spPr = spPr;
    this.pictureOptions = pictureOptions;
    this.extLst = extLst;
  }

  public CT_UnsignedIntModel getIdx() {
    return this.idx;
  }

  public CT_BooleanModel getInvertIfNegative() {
    return this.invertIfNegative;
  }

  public CT_MarkerModel getMarker() {
    return this.marker;
  }

  public CT_BooleanModel getBubble3D() {
    return this.bubble3D;
  }

  public CT_UnsignedIntModel getExplosion() {
    return this.explosion;
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
