
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_LineSerModel;
import test.ooxml.drawingml.chart.CT_DLblsModel;
import test.ooxml.drawingml.chart.CT_ChartLinesModel;
import test.ooxml.drawingml.chart.CT_ChartLinesModel;
import test.ooxml.drawingml.chart.CT_UpDownBarsModel;
import test.ooxml.drawingml.chart.CT_UnsignedIntModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_StockChartModel {


    private final CT_LineSerModel ser;
    private final CT_DLblsModel dLbls;
    private final CT_ChartLinesModel dropLines;
    private final CT_ChartLinesModel hiLowLines;
    private final CT_UpDownBarsModel upDownBars;
    private final CT_UnsignedIntModel axId;
    private final CT_ExtensionListModel extLst;

    public CT_StockChartModel(CT_LineSerModel ser, CT_DLblsModel dLbls, CT_ChartLinesModel dropLines, CT_ChartLinesModel hiLowLines, CT_UpDownBarsModel upDownBars, CT_UnsignedIntModel axId, CT_ExtensionListModel extLst) {
        this.ser = ser;
        this.dLbls = dLbls;
        this.dropLines = dropLines;
        this.hiLowLines = hiLowLines;
        this.upDownBars = upDownBars;
        this.axId = axId;
        this.extLst = extLst;
    }

    public CT_LineSerModel getSer() {
        return this.ser;
    }
    public CT_DLblsModel getDLbls() {
        return this.dLbls;
    }
    public CT_ChartLinesModel getDropLines() {
        return this.dropLines;
    }
    public CT_ChartLinesModel getHiLowLines() {
        return this.hiLowLines;
    }
    public CT_UpDownBarsModel getUpDownBars() {
        return this.upDownBars;
    }
    public CT_UnsignedIntModel getAxId() {
        return this.axId;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
