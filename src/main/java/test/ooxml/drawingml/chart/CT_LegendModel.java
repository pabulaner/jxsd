
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_LegendPosModel;
import test.ooxml.drawingml.chart.CT_LegendEntryModel;
import test.ooxml.drawingml.chart.CT_LayoutModel;
import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.main.CT_ShapePropertiesModel;
import test.ooxml.drawingml.main.CT_TextBodyModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_LegendModel {


    private final CT_LegendPosModel legendPos;
    private final CT_LegendEntryModel legendEntry;
    private final CT_LayoutModel layout;
    private final CT_BooleanModel overlay;
    private final CT_ShapePropertiesModel spPr;
    private final CT_TextBodyModel txPr;
    private final CT_ExtensionListModel extLst;

    public CT_LegendModel(CT_LegendPosModel legendPos, CT_LegendEntryModel legendEntry, CT_LayoutModel layout, CT_BooleanModel overlay, CT_ShapePropertiesModel spPr, CT_TextBodyModel txPr, CT_ExtensionListModel extLst) {
        this.legendPos = legendPos;
        this.legendEntry = legendEntry;
        this.layout = layout;
        this.overlay = overlay;
        this.spPr = spPr;
        this.txPr = txPr;
        this.extLst = extLst;
    }

    public CT_LegendPosModel getLegendPos() {
        return this.legendPos;
    }
    public CT_LegendEntryModel getLegendEntry() {
        return this.legendEntry;
    }
    public CT_LayoutModel getLayout() {
        return this.layout;
    }
    public CT_BooleanModel getOverlay() {
        return this.overlay;
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
