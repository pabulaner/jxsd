
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_ScatterStyleModel;
import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_ScatterSerModel;
import test.ooxml.drawingml.chart.CT_DLblsModel;
import test.ooxml.drawingml.chart.CT_UnsignedIntModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_ScatterChartModel {


    private final CT_ScatterStyleModel scatterStyle;
    private final CT_BooleanModel varyColors;
    private final CT_ScatterSerModel ser;
    private final CT_DLblsModel dLbls;
    private final CT_UnsignedIntModel axId;
    private final CT_ExtensionListModel extLst;

    public CT_ScatterChartModel(CT_ScatterStyleModel scatterStyle, CT_BooleanModel varyColors, CT_ScatterSerModel ser, CT_DLblsModel dLbls, CT_UnsignedIntModel axId, CT_ExtensionListModel extLst) {
        this.scatterStyle = scatterStyle;
        this.varyColors = varyColors;
        this.ser = ser;
        this.dLbls = dLbls;
        this.axId = axId;
        this.extLst = extLst;
    }

    public CT_ScatterStyleModel getScatterStyle() {
        return this.scatterStyle;
    }
    public CT_BooleanModel getVaryColors() {
        return this.varyColors;
    }
    public CT_ScatterSerModel getSer() {
        return this.ser;
    }
    public CT_DLblsModel getDLbls() {
        return this.dLbls;
    }
    public CT_UnsignedIntModel getAxId() {
        return this.axId;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
