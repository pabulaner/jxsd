
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_LblOffsetModel;
import test.ooxml.drawingml.chart.CT_TimeUnitModel;
import test.ooxml.drawingml.chart.CT_AxisUnitModel;
import test.ooxml.drawingml.chart.CT_TimeUnitModel;
import test.ooxml.drawingml.chart.CT_AxisUnitModel;
import test.ooxml.drawingml.chart.CT_TimeUnitModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_DateAxModel {


    private final CT_BooleanModel auto;
    private final CT_LblOffsetModel lblOffset;
    private final CT_TimeUnitModel baseTimeUnit;
    private final CT_AxisUnitModel majorUnit;
    private final CT_TimeUnitModel majorTimeUnit;
    private final CT_AxisUnitModel minorUnit;
    private final CT_TimeUnitModel minorTimeUnit;
    private final CT_ExtensionListModel extLst;

    public CT_DateAxModel(CT_BooleanModel auto, CT_LblOffsetModel lblOffset, CT_TimeUnitModel baseTimeUnit, CT_AxisUnitModel majorUnit, CT_TimeUnitModel majorTimeUnit, CT_AxisUnitModel minorUnit, CT_TimeUnitModel minorTimeUnit, CT_ExtensionListModel extLst) {
        this.auto = auto;
        this.lblOffset = lblOffset;
        this.baseTimeUnit = baseTimeUnit;
        this.majorUnit = majorUnit;
        this.majorTimeUnit = majorTimeUnit;
        this.minorUnit = minorUnit;
        this.minorTimeUnit = minorTimeUnit;
        this.extLst = extLst;
    }

    public CT_BooleanModel getAuto() {
        return this.auto;
    }
    public CT_LblOffsetModel getLblOffset() {
        return this.lblOffset;
    }
    public CT_TimeUnitModel getBaseTimeUnit() {
        return this.baseTimeUnit;
    }
    public CT_AxisUnitModel getMajorUnit() {
        return this.majorUnit;
    }
    public CT_TimeUnitModel getMajorTimeUnit() {
        return this.majorTimeUnit;
    }
    public CT_AxisUnitModel getMinorUnit() {
        return this.minorUnit;
    }
    public CT_TimeUnitModel getMinorTimeUnit() {
        return this.minorTimeUnit;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
