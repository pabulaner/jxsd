
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_DPtModel;
import test.ooxml.drawingml.chart.CT_DLblsModel;
import test.ooxml.drawingml.chart.CT_TrendlineModel;
import test.ooxml.drawingml.chart.CT_ErrBarsModel;
import test.ooxml.drawingml.chart.CT_AxDataSourceModel;
import test.ooxml.drawingml.chart.CT_NumDataSourceModel;
import test.ooxml.drawingml.chart.CT_NumDataSourceModel;
import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_BubbleSerModel {


    private final CT_BooleanModel invertIfNegative;
    private final CT_DPtModel dPt;
    private final CT_DLblsModel dLbls;
    private final CT_TrendlineModel trendline;
    private final CT_ErrBarsModel errBars;
    private final CT_AxDataSourceModel xVal;
    private final CT_NumDataSourceModel yVal;
    private final CT_NumDataSourceModel bubbleSize;
    private final CT_BooleanModel bubble3D;
    private final CT_ExtensionListModel extLst;

    public CT_BubbleSerModel(CT_BooleanModel invertIfNegative, CT_DPtModel dPt, CT_DLblsModel dLbls, CT_TrendlineModel trendline, CT_ErrBarsModel errBars, CT_AxDataSourceModel xVal, CT_NumDataSourceModel yVal, CT_NumDataSourceModel bubbleSize, CT_BooleanModel bubble3D, CT_ExtensionListModel extLst) {
        this.invertIfNegative = invertIfNegative;
        this.dPt = dPt;
        this.dLbls = dLbls;
        this.trendline = trendline;
        this.errBars = errBars;
        this.xVal = xVal;
        this.yVal = yVal;
        this.bubbleSize = bubbleSize;
        this.bubble3D = bubble3D;
        this.extLst = extLst;
    }

    public CT_BooleanModel getInvertIfNegative() {
        return this.invertIfNegative;
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
    public CT_NumDataSourceModel getBubbleSize() {
        return this.bubbleSize;
    }
    public CT_BooleanModel getBubble3D() {
        return this.bubble3D;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
