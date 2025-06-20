
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_ManualLayoutModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_LayoutModel {


    private final CT_ManualLayoutModel manualLayout;
    private final CT_ExtensionListModel extLst;

    public CT_LayoutModel(CT_ManualLayoutModel manualLayout, CT_ExtensionListModel extLst) {
        this.manualLayout = manualLayout;
        this.extLst = extLst;
    }

    public CT_ManualLayoutModel getManualLayout() {
        return this.manualLayout;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
