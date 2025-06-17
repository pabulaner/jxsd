
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_AxDataSourceModel;
import test.ooxml.drawingml.chart.CT_NumDataSourceModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_SurfaceSerModel {


    private final CT_AxDataSourceModel cat;
    private final CT_NumDataSourceModel val;
    private final CT_ExtensionListModel extLst;

    public CT_SurfaceSerModel(CT_AxDataSourceModel cat, CT_NumDataSourceModel val, CT_ExtensionListModel extLst) {
        this.cat = cat;
        this.val = val;
        this.extLst = extLst;
    }

    public CT_AxDataSourceModel getCat() {
        return this.cat;
    }
    public CT_NumDataSourceModel getVal() {
        return this.val;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
