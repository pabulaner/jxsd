package test.drawingml.main;

public class CTCustomGeometry2DModel {
  private final CTGeomGuideListModel avLst;

  private final CTGeomGuideListModel gdLst;

  private final CTAdjustHandleListModel ahLst;

  private final CTConnectionSiteListModel cxnLst;

  private final CTGeomRectModel rect;

  private final CTPath2DListModel pathLst;

  public CTCustomGeometry2DModel(CTGeomGuideListModel avLst, CTGeomGuideListModel gdLst,
      CTAdjustHandleListModel ahLst, CTConnectionSiteListModel cxnLst, CTGeomRectModel rect,
      CTPath2DListModel pathLst) {
    this.avLst = avLst;
    this.gdLst = gdLst;
    this.ahLst = ahLst;
    this.cxnLst = cxnLst;
    this.rect = rect;
    this.pathLst = pathLst;
  }

  public CTGeomGuideListModel getAvLst() {
    return this.avLst;
  }

  public CTGeomGuideListModel getGdLst() {
    return this.gdLst;
  }

  public CTAdjustHandleListModel getAhLst() {
    return this.ahLst;
  }

  public CTConnectionSiteListModel getCxnLst() {
    return this.cxnLst;
  }

  public CTGeomRectModel getRect() {
    return this.rect;
  }

  public CTPath2DListModel getPathLst() {
    return this.pathLst;
  }
}
