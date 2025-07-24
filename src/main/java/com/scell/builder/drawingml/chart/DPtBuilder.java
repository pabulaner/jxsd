package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.DPtModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.MarkerModel;
import com.scell.model.drawingml.chart.PictureOptionsModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;

public class DPtBuilder {
  private UnsignedIntModel idx;

  private BooleanModel invertIfNegative;

  private MarkerModel marker;

  private BooleanModel bubble3D;

  private UnsignedIntModel explosion;

  private ShapePropertiesModel spPr;

  private PictureOptionsModel pictureOptions;

  private ExtensionListModel extLst;

  public DPtBuilder() {
  }

  public DPtBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public DPtBuilder setInvertIfNegative(BooleanModel invertIfNegative) {
    this.invertIfNegative = invertIfNegative;
    return this;
  }

  public DPtBuilder setMarker(MarkerModel marker) {
    this.marker = marker;
    return this;
  }

  public DPtBuilder setBubble3D(BooleanModel bubble3D) {
    this.bubble3D = bubble3D;
    return this;
  }

  public DPtBuilder setExplosion(UnsignedIntModel explosion) {
    this.explosion = explosion;
    return this;
  }

  public DPtBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public DPtBuilder setPictureOptions(PictureOptionsModel pictureOptions) {
    this.pictureOptions = pictureOptions;
    return this;
  }

  public DPtBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public DPtModel build() {
    return new DPtModel(this.idx, this.invertIfNegative, this.marker, this.bubble3D, this.explosion, this.spPr, this.pictureOptions, this.extLst);
  }

  public DPtBuilder from(DPtModel value) {
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
