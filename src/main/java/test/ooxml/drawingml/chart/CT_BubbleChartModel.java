
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_BubbleSerModel;
import test.ooxml.drawingml.chart.CT_DLblsModel;
import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_BubbleScaleModel;
import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_SizeRepresentsModel;
import test.ooxml.drawingml.chart.CT_UnsignedIntModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_BubbleChartModel {


    private final CT_BooleanModel varyColors;
    private final CT_BubbleSerModel ser;
    private final CT_DLblsModel dLbls;
    private final CT_BooleanModel bubble3D;
    private final CT_BubbleScaleModel bubbleScale;
    private final CT_BooleanModel showNegBubbles;
    private final CT_SizeRepresentsModel sizeRepresents;
    private final CT_UnsignedIntModel axId;
    private final CT_ExtensionListModel extLst;

    public CT_BubbleChartModel(CT_BooleanModel varyColors, CT_BubbleSerModel ser, CT_DLblsModel dLbls, CT_BooleanModel bubble3D, CT_BubbleScaleModel bubbleScale, CT_BooleanModel showNegBubbles, CT_SizeRepresentsModel sizeRepresents, CT_UnsignedIntModel axId, CT_ExtensionListModel extLst) {
        this.varyColors = varyColors;
        this.ser = ser;
        this.dLbls = dLbls;
        this.bubble3D = bubble3D;
        this.bubbleScale = bubbleScale;
        this.showNegBubbles = showNegBubbles;
        this.sizeRepresents = sizeRepresents;
        this.axId = axId;
        this.extLst = extLst;
    }

    public CT_BooleanModel getVaryColors() {
        return this.varyColors;
    }
    public CT_BubbleSerModel getSer() {
        return this.ser;
    }
    public CT_DLblsModel getDLbls() {
        return this.dLbls;
    }
    public CT_BooleanModel getBubble3D() {
        return this.bubble3D;
    }
    public CT_BubbleScaleModel getBubbleScale() {
        return this.bubbleScale;
    }
    public CT_BooleanModel getShowNegBubbles() {
        return this.showNegBubbles;
    }
    public CT_SizeRepresentsModel getSizeRepresents() {
        return this.sizeRepresents;
    }
    public CT_UnsignedIntModel getAxId() {
        return this.axId;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
