
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_RadarStyleModel;
import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_RadarSerModel;
import test.ooxml.drawingml.chart.CT_DLblsModel;
import test.ooxml.drawingml.chart.CT_UnsignedIntModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_RadarChartModel {


    private final CT_RadarStyleModel radarStyle;
    private final CT_BooleanModel varyColors;
    private final CT_RadarSerModel ser;
    private final CT_DLblsModel dLbls;
    private final CT_UnsignedIntModel axId;
    private final CT_ExtensionListModel extLst;

    public CT_RadarChartModel(CT_RadarStyleModel radarStyle, CT_BooleanModel varyColors, CT_RadarSerModel ser, CT_DLblsModel dLbls, CT_UnsignedIntModel axId, CT_ExtensionListModel extLst) {
        this.radarStyle = radarStyle;
        this.varyColors = varyColors;
        this.ser = ser;
        this.dLbls = dLbls;
        this.axId = axId;
        this.extLst = extLst;
    }

    public CT_RadarStyleModel getRadarStyle() {
        return this.radarStyle;
    }
    public CT_BooleanModel getVaryColors() {
        return this.varyColors;
    }
    public CT_RadarSerModel getSer() {
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
