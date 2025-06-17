
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_MarkerModel;
import test.ooxml.drawingml.chart.CT_DPtModel;
import test.ooxml.drawingml.chart.CT_DLblsModel;
import test.ooxml.drawingml.chart.CT_TrendlineModel;
import test.ooxml.drawingml.chart.CT_ErrBarsModel;
import test.ooxml.drawingml.chart.CT_AxDataSourceModel;
import test.ooxml.drawingml.chart.CT_NumDataSourceModel;
import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_ScatterSerModel {


    private final CT_MarkerModel marker;
    private final CT_DPtModel dPt;
    private final CT_DLblsModel dLbls;
    private final CT_TrendlineModel trendline;
    private final CT_ErrBarsModel errBars;
    private final CT_AxDataSourceModel xVal;
    private final CT_NumDataSourceModel yVal;
    private final CT_BooleanModel smooth;
    private final CT_ExtensionListModel extLst;

    public CT_ScatterSerModel(CT_MarkerModel marker, CT_DPtModel dPt, CT_DLblsModel dLbls, CT_TrendlineModel trendline, CT_ErrBarsModel errBars, CT_AxDataSourceModel xVal, CT_NumDataSourceModel yVal, CT_BooleanModel smooth, CT_ExtensionListModel extLst) {
        this.marker = marker;
        this.dPt = dPt;
        this.dLbls = dLbls;
        this.trendline = trendline;
        this.errBars = errBars;
        this.xVal = xVal;
        this.yVal = yVal;
        this.smooth = smooth;
        this.extLst = extLst;
    }

    public CT_MarkerModel getMarker() {
        return this.marker;
    }
    public CT_DPtModel getDPt() {
        return this.dPt;
    }
    public CT_DLblsModel getDLbls() {
        return this.dLbls;
    }
    public CT_TrendlineModel getTrendline() {
        return this.trendline;
    }
    public CT_ErrBarsModel getErrBars() {
        return this.errBars;
    }
    public CT_AxDataSourceModel getXVal() {
        return this.xVal;
    }
    public CT_NumDataSourceModel getYVal() {
        return this.yVal;
    }
    public CT_BooleanModel getSmooth() {
        return this.smooth;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
