
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_CrossBetweenModel;
import test.ooxml.drawingml.chart.CT_AxisUnitModel;
import test.ooxml.drawingml.chart.CT_AxisUnitModel;
import test.ooxml.drawingml.chart.CT_DispUnitsModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_ValAxModel {


    private final CT_CrossBetweenModel crossBetween;
    private final CT_AxisUnitModel majorUnit;
    private final CT_AxisUnitModel minorUnit;
    private final CT_DispUnitsModel dispUnits;
    private final CT_ExtensionListModel extLst;

    public CT_ValAxModel(CT_CrossBetweenModel crossBetween, CT_AxisUnitModel majorUnit, CT_AxisUnitModel minorUnit, CT_DispUnitsModel dispUnits, CT_ExtensionListModel extLst) {
        this.crossBetween = crossBetween;
        this.majorUnit = majorUnit;
        this.minorUnit = minorUnit;
        this.dispUnits = dispUnits;
        this.extLst = extLst;
    }

    public CT_CrossBetweenModel getCrossBetween() {
        return this.crossBetween;
    }
    public CT_AxisUnitModel getMajorUnit() {
        return this.majorUnit;
    }
    public CT_AxisUnitModel getMinorUnit() {
        return this.minorUnit;
    }
    public CT_DispUnitsModel getDispUnits() {
        return this.dispUnits;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
