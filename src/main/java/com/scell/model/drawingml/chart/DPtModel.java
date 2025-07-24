package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;

public class DPtModel {
  private final UnsignedIntModel idx;

  private final BooleanModel invertIfNegative;

  private final MarkerModel marker;

  private final BooleanModel bubble3D;

  private final UnsignedIntModel explosion;

  private final ShapePropertiesModel spPr;

  private final PictureOptionsModel pictureOptions;

  private final ExtensionListModel extLst;

  public DPtModel(UnsignedIntModel idx, BooleanModel invertIfNegative, MarkerModel marker,
      BooleanModel bubble3D, UnsignedIntModel explosion, ShapePropertiesModel spPr,
      PictureOptionsModel pictureOptions, ExtensionListModel extLst) {
    this.idx = idx;
    this.invertIfNegative = invertIfNegative;
    this.marker = marker;
    this.bubble3D = bubble3D;
    this.explosion = explosion;
    this.spPr = spPr;
    this.pictureOptions = pictureOptions;
    this.extLst = extLst;
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public BooleanModel getInvertIfNegative() {
    return this.invertIfNegative;
  }

  public MarkerModel getMarker() {
    return this.marker;
  }

  public BooleanModel getBubble3D() {
    return this.bubble3D;
  }

  public UnsignedIntModel getExplosion() {
    return this.explosion;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public PictureOptionsModel getPictureOptions() {
    return this.pictureOptions;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
