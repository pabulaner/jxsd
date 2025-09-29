package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.AdjustHandleListModel;
import jxsd.gen.model.drawingml.main.ConnectionSiteListModel;
import jxsd.gen.model.drawingml.main.CustomGeometry2DModel;
import jxsd.gen.model.drawingml.main.GeomGuideListModel;
import jxsd.gen.model.drawingml.main.GeomRectModel;
import jxsd.gen.model.drawingml.main.Path2DListModel;

/**
 * This is a generated sequence class.
 */
public class CustomGeometry2DBuilder {
  private GeomGuideListModel avLst;

  private GeomGuideListModel gdLst;

  private AdjustHandleListModel ahLst;

  private ConnectionSiteListModel cxnLst;

  private GeomRectModel rect;

  private Path2DListModel pathLst;

  public CustomGeometry2DBuilder() {
  }

  public CustomGeometry2DBuilder setAvLst(GeomGuideListModel avLst) {
    this.avLst = avLst;
    return this;
  }

  public CustomGeometry2DBuilder setGdLst(GeomGuideListModel gdLst) {
    this.gdLst = gdLst;
    return this;
  }

  public CustomGeometry2DBuilder setAhLst(AdjustHandleListModel ahLst) {
    this.ahLst = ahLst;
    return this;
  }

  public CustomGeometry2DBuilder setCxnLst(ConnectionSiteListModel cxnLst) {
    this.cxnLst = cxnLst;
    return this;
  }

  public CustomGeometry2DBuilder setRect(GeomRectModel rect) {
    this.rect = rect;
    return this;
  }

  public CustomGeometry2DBuilder setPathLst(Path2DListModel pathLst) {
    this.pathLst = pathLst;
    return this;
  }

  public CustomGeometry2DBuilder from(CustomGeometry2DModel value) {
    this.avLst = value.getAvLst();
    this.gdLst = value.getGdLst();
    this.ahLst = value.getAhLst();
    this.cxnLst = value.getCxnLst();
    this.rect = value.getRect();
    this.pathLst = value.getPathLst();
    return this;
  }

  public CustomGeometry2DModel build() {
    return new CustomGeometry2DModel(this.avLst, this.gdLst, this.ahLst, this.cxnLst, this.rect, this.pathLst);
  }
}
