
package test.ooxml.drawingml.chart;

import test.ooxml.officeDocument.sharedTypes.ST_XstringModel;
import test.ooxml.drawingml.chart.CT_UnsignedIntModel;
import test.ooxml.drawingml.chart.CT_NumValModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_NumDataModel {


    private final ST_XstringModel formatCode;
    private final CT_UnsignedIntModel ptCount;
    private final CT_NumValModel pt;
    private final CT_ExtensionListModel extLst;

    public CT_NumDataModel(ST_XstringModel formatCode, CT_UnsignedIntModel ptCount, CT_NumValModel pt, CT_ExtensionListModel extLst) {
        this.formatCode = formatCode;
        this.ptCount = ptCount;
        this.pt = pt;
        this.extLst = extLst;
    }

    public ST_XstringModel getFormatCode() {
        return this.formatCode;
    }
    public CT_UnsignedIntModel getPtCount() {
        return this.ptCount;
    }
    public CT_NumValModel getPt() {
        return this.pt;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
