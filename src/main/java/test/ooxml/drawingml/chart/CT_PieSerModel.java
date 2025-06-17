
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_UnsignedIntModel;
import test.ooxml.drawingml.chart.CT_DPtModel;
import test.ooxml.drawingml.chart.CT_DLblsModel;
import test.ooxml.drawingml.chart.CT_AxDataSourceModel;
import test.ooxml.drawingml.chart.CT_NumDataSourceModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_PieSerModel {


    private final CT_UnsignedIntModel explosion;
    private final CT_DPtModel dPt;
    private final CT_DLblsModel dLbls;
    private final CT_AxDataSourceModel cat;
    private final CT_NumDataSourceModel val;
    private final CT_ExtensionListModel extLst;

    public CT_PieSerModel(CT_UnsignedIntModel explosion, CT_DPtModel dPt, CT_DLblsModel dLbls, CT_AxDataSourceModel cat, CT_NumDataSourceModel val, CT_ExtensionListModel extLst) {
        this.explosion = explosion;
        this.dPt = dPt;
        this.dLbls = dLbls;
        this.cat = cat;
        this.val = val;
        this.extLst = extLst;
    }

    public CT_UnsignedIntModel getExplosion() {
        return this.explosion;
    }
    public CT_DPtModel getDPt() {
        return this.dPt;
    }
    public CT_DLblsModel getDLbls() {
        return this.dLbls;
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
