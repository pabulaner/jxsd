
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_GapAmountModel;
import test.ooxml.drawingml.chart.CT_UnsignedIntModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_Line3DChartModel {


    private final CT_GapAmountModel gapDepth;
    private final CT_UnsignedIntModel axId;
    private final CT_ExtensionListModel extLst;

    public CT_Line3DChartModel(CT_GapAmountModel gapDepth, CT_UnsignedIntModel axId, CT_ExtensionListModel extLst) {
        this.gapDepth = gapDepth;
        this.axId = axId;
        this.extLst = extLst;
    }

    public CT_GapAmountModel getGapDepth() {
        return this.gapDepth;
    }
    public CT_UnsignedIntModel getAxId() {
        return this.axId;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
