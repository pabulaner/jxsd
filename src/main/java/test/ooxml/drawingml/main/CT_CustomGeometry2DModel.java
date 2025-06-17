
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_GeomGuideListModel;
import test.ooxml.drawingml.main.CT_GeomGuideListModel;
import test.ooxml.drawingml.main.CT_AdjustHandleListModel;
import test.ooxml.drawingml.main.CT_ConnectionSiteListModel;
import test.ooxml.drawingml.main.CT_GeomRectModel;
import test.ooxml.drawingml.main.CT_Path2DListModel;


public class CT_CustomGeometry2DModel {


    private final CT_GeomGuideListModel avLst;
    private final CT_GeomGuideListModel gdLst;
    private final CT_AdjustHandleListModel ahLst;
    private final CT_ConnectionSiteListModel cxnLst;
    private final CT_GeomRectModel rect;
    private final CT_Path2DListModel pathLst;

    public CT_CustomGeometry2DModel(CT_GeomGuideListModel avLst, CT_GeomGuideListModel gdLst, CT_AdjustHandleListModel ahLst, CT_ConnectionSiteListModel cxnLst, CT_GeomRectModel rect, CT_Path2DListModel pathLst) {
        this.avLst = avLst;
        this.gdLst = gdLst;
        this.ahLst = ahLst;
        this.cxnLst = cxnLst;
        this.rect = rect;
        this.pathLst = pathLst;
    }

    public CT_GeomGuideListModel getAvLst() {
        return this.avLst;
    }
    public CT_GeomGuideListModel getGdLst() {
        return this.gdLst;
    }
    public CT_AdjustHandleListModel getAhLst() {
        return this.ahLst;
    }
    public CT_ConnectionSiteListModel getCxnLst() {
        return this.cxnLst;
    }
    public CT_GeomRectModel getRect() {
        return this.rect;
    }
    public CT_Path2DListModel getPathLst() {
        return this.pathLst;
    }
}
