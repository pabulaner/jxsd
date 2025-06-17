
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_ChartLinesModel;
import test.ooxml.drawingml.chart.CT_UpDownBarsModel;
import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_UnsignedIntModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_LineChartModel {


    private final CT_ChartLinesModel hiLowLines;
    private final CT_UpDownBarsModel upDownBars;
    private final CT_BooleanModel marker;
    private final CT_BooleanModel smooth;
    private final CT_UnsignedIntModel axId;
    private final CT_ExtensionListModel extLst;

    public CT_LineChartModel(CT_ChartLinesModel hiLowLines, CT_UpDownBarsModel upDownBars, CT_BooleanModel marker, CT_BooleanModel smooth, CT_UnsignedIntModel axId, CT_ExtensionListModel extLst) {
        this.hiLowLines = hiLowLines;
        this.upDownBars = upDownBars;
        this.marker = marker;
        this.smooth = smooth;
        this.axId = axId;
        this.extLst = extLst;
    }

    public CT_ChartLinesModel getHiLowLines() {
        return this.hiLowLines;
    }
    public CT_UpDownBarsModel getUpDownBars() {
        return this.upDownBars;
    }
    public CT_BooleanModel getMarker() {
        return this.marker;
    }
    public CT_BooleanModel getSmooth() {
        return this.smooth;
    }
    public CT_UnsignedIntModel getAxId() {
        return this.axId;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
