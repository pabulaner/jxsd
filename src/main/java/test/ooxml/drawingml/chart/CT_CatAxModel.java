
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_LblAlgnModel;
import test.ooxml.drawingml.chart.CT_LblOffsetModel;
import test.ooxml.drawingml.chart.CT_SkipModel;
import test.ooxml.drawingml.chart.CT_SkipModel;
import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_CatAxModel {


    private final CT_BooleanModel auto;
    private final CT_LblAlgnModel lblAlgn;
    private final CT_LblOffsetModel lblOffset;
    private final CT_SkipModel tickLblSkip;
    private final CT_SkipModel tickMarkSkip;
    private final CT_BooleanModel noMultiLvlLbl;
    private final CT_ExtensionListModel extLst;

    public CT_CatAxModel(CT_BooleanModel auto, CT_LblAlgnModel lblAlgn, CT_LblOffsetModel lblOffset, CT_SkipModel tickLblSkip, CT_SkipModel tickMarkSkip, CT_BooleanModel noMultiLvlLbl, CT_ExtensionListModel extLst) {
        this.auto = auto;
        this.lblAlgn = lblAlgn;
        this.lblOffset = lblOffset;
        this.tickLblSkip = tickLblSkip;
        this.tickMarkSkip = tickMarkSkip;
        this.noMultiLvlLbl = noMultiLvlLbl;
        this.extLst = extLst;
    }

    public CT_BooleanModel getAuto() {
        return this.auto;
    }
    public CT_LblAlgnModel getLblAlgn() {
        return this.lblAlgn;
    }
    public CT_LblOffsetModel getLblOffset() {
        return this.lblOffset;
    }
    public CT_SkipModel getTickLblSkip() {
        return this.tickLblSkip;
    }
    public CT_SkipModel getTickMarkSkip() {
        return this.tickMarkSkip;
    }
    public CT_BooleanModel getNoMultiLvlLbl() {
        return this.noMultiLvlLbl;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
