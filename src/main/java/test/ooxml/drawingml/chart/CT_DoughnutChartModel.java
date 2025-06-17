
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_FirstSliceAngModel;
import test.ooxml.drawingml.chart.CT_HoleSizeModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_DoughnutChartModel {


    private final CT_FirstSliceAngModel firstSliceAng;
    private final CT_HoleSizeModel holeSize;
    private final CT_ExtensionListModel extLst;

    public CT_DoughnutChartModel(CT_FirstSliceAngModel firstSliceAng, CT_HoleSizeModel holeSize, CT_ExtensionListModel extLst) {
        this.firstSliceAng = firstSliceAng;
        this.holeSize = holeSize;
        this.extLst = extLst;
    }

    public CT_FirstSliceAngModel getFirstSliceAng() {
        return this.firstSliceAng;
    }
    public CT_HoleSizeModel getHoleSize() {
        return this.holeSize;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
