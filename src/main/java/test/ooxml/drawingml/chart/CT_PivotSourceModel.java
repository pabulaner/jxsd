
package test.ooxml.drawingml.chart;

import test.ooxml.officeDocument.sharedTypes.ST_XstringModel;
import test.ooxml.drawingml.chart.CT_UnsignedIntModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_PivotSourceModel {


    private final ST_XstringModel name;
    private final CT_UnsignedIntModel fmtId;
    private final CT_ExtensionListModel extLst;

    public CT_PivotSourceModel(ST_XstringModel name, CT_UnsignedIntModel fmtId, CT_ExtensionListModel extLst) {
        this.name = name;
        this.fmtId = fmtId;
        this.extLst = extLst;
    }

    public ST_XstringModel getName() {
        return this.name;
    }
    public CT_UnsignedIntModel getFmtId() {
        return this.fmtId;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
