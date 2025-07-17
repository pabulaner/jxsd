package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DPtModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_MarkerModel;
import com.scell.model.drawingml.chart.CT_PictureOptionsModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;

public class CT_DPtBuilder {
  private CT_UnsignedIntModel idx;

  private CT_BooleanModel invertIfNegative;

  private CT_MarkerModel marker;

  private CT_BooleanModel bubble3D;

  private CT_UnsignedIntModel explosion;

  private CT_ShapePropertiesModel spPr;

  private CT_PictureOptionsModel pictureOptions;

  private CT_ExtensionListModel extLst;

  public CT_DPtBuilder() {
  }

  public CT_DPtBuilder setIdx(CT_UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_DPtBuilder setInvertIfNegative(CT_BooleanModel invertIfNegative) {
    this.invertIfNegative = invertIfNegative;
    return this;
  }

  public CT_DPtBuilder setMarker(CT_MarkerModel marker) {
    this.marker = marker;
    return this;
  }

  public CT_DPtBuilder setBubble3D(CT_BooleanModel bubble3D) {
    this.bubble3D = bubble3D;
    return this;
  }

  public CT_DPtBuilder setExplosion(CT_UnsignedIntModel explosion) {
    this.explosion = explosion;
    return this;
  }

  public CT_DPtBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_DPtBuilder setPictureOptions(CT_PictureOptionsModel pictureOptions) {
    this.pictureOptions = pictureOptions;
    return this;
  }

  public CT_DPtBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_DPtModel build() {
    return new CT_DPtModel(this.idx, this.invertIfNegative, this.marker, this.bubble3D, this.explosion, this.spPr, this.pictureOptions, this.extLst);
  }

  public CT_DPtBuilder from(CT_DPtModel value) {
    this.idx = value.getIdx();
    this.invertIfNegative = value.getInvertIfNegative();
    this.marker = value.getMarker();
    this.bubble3D = value.getBubble3D();
    this.explosion = value.getExplosion();
    this.spPr = value.getSpPr();
    this.pictureOptions = value.getPictureOptions();
    this.extLst = value.getExtLst();
    return this;
  }
}
