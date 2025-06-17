
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_GapAmountModel;
import test.ooxml.drawingml.chart.CT_OverlapModel;
import test.ooxml.drawingml.chart.CT_ChartLinesModel;
import test.ooxml.drawingml.chart.CT_UnsignedIntModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_BarChartModel {


    private final CT_GapAmountModel gapWidth;
    private final CT_OverlapModel overlap;
    private final CT_ChartLinesModel serLines;
    private final CT_UnsignedIntModel axId;
    private final CT_ExtensionListModel extLst;

    public CT_BarChartModel(CT_GapAmountModel gapWidth, CT_OverlapModel overlap, CT_ChartLinesModel serLines, CT_UnsignedIntModel axId, CT_ExtensionListModel extLst) {
        this.gapWidth = gapWidth;
        this.overlap = overlap;
        this.serLines = serLines;
        this.axId = axId;
        this.extLst = extLst;
    }

    public CT_GapAmountModel getGapWidth() {
        return this.gapWidth;
    }
    public CT_OverlapModel getOverlap() {
        return this.overlap;
    }
    public CT_ChartLinesModel getSerLines() {
        return this.serLines;
    }
    public CT_UnsignedIntModel getAxId() {
        return this.axId;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
