
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_LayoutModel;
import test.ooxml.drawingml.chart.CT_TxModel;
import test.ooxml.drawingml.chart.CT_NumFmtModel;
import test.ooxml.drawingml.main.CT_ShapePropertiesModel;
import test.ooxml.drawingml.main.CT_TextBodyModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_TrendlineLblModel {


    private final CT_LayoutModel layout;
    private final CT_TxModel tx;
    private final CT_NumFmtModel numFmt;
    private final CT_ShapePropertiesModel spPr;
    private final CT_TextBodyModel txPr;
    private final CT_ExtensionListModel extLst;

    public CT_TrendlineLblModel(CT_LayoutModel layout, CT_TxModel tx, CT_NumFmtModel numFmt, CT_ShapePropertiesModel spPr, CT_TextBodyModel txPr, CT_ExtensionListModel extLst) {
        this.layout = layout;
        this.tx = tx;
        this.numFmt = numFmt;
        this.spPr = spPr;
        this.txPr = txPr;
        this.extLst = extLst;
    }

    public CT_LayoutModel getLayout() {
        return this.layout;
    }
    public CT_TxModel getTx() {
        return this.tx;
    }
    public CT_NumFmtModel getNumFmt() {
        return this.numFmt;
    }
    public CT_ShapePropertiesModel getSpPr() {
        return this.spPr;
    }
    public CT_TextBodyModel getTxPr() {
        return this.txPr;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
