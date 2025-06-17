
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_UnsignedIntModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_Surface3DChartModel {


    private final CT_UnsignedIntModel axId;
    private final CT_ExtensionListModel extLst;

    public CT_Surface3DChartModel(CT_UnsignedIntModel axId, CT_ExtensionListModel extLst) {
        this.axId = axId;
        this.extLst = extLst;
    }

    public CT_UnsignedIntModel getAxId() {
        return this.axId;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
