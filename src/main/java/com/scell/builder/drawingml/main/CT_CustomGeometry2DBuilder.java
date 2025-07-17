package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AdjustHandleListModel;
import com.scell.model.drawingml.main.CT_ConnectionSiteListModel;
import com.scell.model.drawingml.main.CT_CustomGeometry2DModel;
import com.scell.model.drawingml.main.CT_GeomGuideListModel;
import com.scell.model.drawingml.main.CT_GeomRectModel;
import com.scell.model.drawingml.main.CT_Path2DListModel;

public class CT_CustomGeometry2DBuilder {
  private CT_GeomGuideListModel avLst;

  private CT_GeomGuideListModel gdLst;

  private CT_AdjustHandleListModel ahLst;

  private CT_ConnectionSiteListModel cxnLst;

  private CT_GeomRectModel rect;

  private CT_Path2DListModel pathLst;

  public CT_CustomGeometry2DBuilder() {
  }

  public CT_CustomGeometry2DBuilder setAvLst(CT_GeomGuideListModel avLst) {
    this.avLst = avLst;
    return this;
  }

  public CT_CustomGeometry2DBuilder setGdLst(CT_GeomGuideListModel gdLst) {
    this.gdLst = gdLst;
    return this;
  }

  public CT_CustomGeometry2DBuilder setAhLst(CT_AdjustHandleListModel ahLst) {
    this.ahLst = ahLst;
    return this;
  }

  public CT_CustomGeometry2DBuilder setCxnLst(CT_ConnectionSiteListModel cxnLst) {
    this.cxnLst = cxnLst;
    return this;
  }

  public CT_CustomGeometry2DBuilder setRect(CT_GeomRectModel rect) {
    this.rect = rect;
    return this;
  }

  public CT_CustomGeometry2DBuilder setPathLst(CT_Path2DListModel pathLst) {
    this.pathLst = pathLst;
    return this;
  }

  public CT_CustomGeometry2DModel build() {
    return new CT_CustomGeometry2DModel(this.avLst, this.gdLst, this.ahLst, this.cxnLst, this.rect, this.pathLst);
  }

  public CT_CustomGeometry2DBuilder from(CT_CustomGeometry2DModel value) {
    this.avLst = value.getAvLst();
    this.gdLst = value.getGdLst();
    this.ahLst = value.getAhLst();
    this.cxnLst = value.getCxnLst();
    this.rect = value.getRect();
    this.pathLst = value.getPathLst();
    return this;
  }
}
