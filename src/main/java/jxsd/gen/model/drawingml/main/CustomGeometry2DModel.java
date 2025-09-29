package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.CustomGeometry2DBuilder;

/**
 * This is a generated sequence class.
 */
public class CustomGeometry2DModel {
  private final GeomGuideListModel avLst;

  private final GeomGuideListModel gdLst;

  private final AdjustHandleListModel ahLst;

  private final ConnectionSiteListModel cxnLst;

  private final GeomRectModel rect;

  private final Path2DListModel pathLst;

  public CustomGeometry2DModel(GeomGuideListModel avLst, GeomGuideListModel gdLst,
      AdjustHandleListModel ahLst, ConnectionSiteListModel cxnLst, GeomRectModel rect,
      Path2DListModel pathLst) {
    this.avLst = avLst;
    this.gdLst = gdLst;
    this.ahLst = ahLst;
    this.cxnLst = cxnLst;
    this.rect = rect;
    this.pathLst = pathLst;
  }

  public CustomGeometry2DBuilder builder() {
    return new CustomGeometry2DBuilder().from(this);
  }

  public GeomGuideListModel getAvLst() {
    return this.avLst;
  }

  public GeomGuideListModel getGdLst() {
    return this.gdLst;
  }

  public AdjustHandleListModel getAhLst() {
    return this.ahLst;
  }

  public ConnectionSiteListModel getCxnLst() {
    return this.cxnLst;
  }

  public GeomRectModel getRect() {
    return this.rect;
  }

  public Path2DListModel getPathLst() {
    return this.pathLst;
  }
}
