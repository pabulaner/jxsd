
package test.ooxml.drawingml.chart;

import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_TextLanguageIDModel;
import test.ooxml.drawingml.chart.CT_BooleanModel;
import test.ooxml.drawingml.chart.CT_StyleModel;
import test.ooxml.drawingml.main.CT_ColorMappingModel;
import test.ooxml.drawingml.chart.CT_PivotSourceModel;
import test.ooxml.drawingml.chart.CT_ProtectionModel;
import test.ooxml.drawingml.chart.CT_ChartModel;
import test.ooxml.drawingml.main.CT_ShapePropertiesModel;
import test.ooxml.drawingml.main.CT_TextBodyModel;
import test.ooxml.drawingml.chart.CT_ExternalDataModel;
import test.ooxml.drawingml.chart.CT_PrintSettingsModel;
import test.ooxml.drawingml.chart.CT_RelIdModel;
import test.ooxml.drawingml.chart.CT_ExtensionListModel;


public class CT_ChartSpaceModel {


    private final CT_BooleanModel date1904;
    private final CT_TextLanguageIDModel lang;
    private final CT_BooleanModel roundedCorners;
    private final CT_StyleModel style;
    private final CT_ColorMappingModel clrMapOvr;
    private final CT_PivotSourceModel pivotSource;
    private final CT_ProtectionModel protection;
    private final CT_ChartModel chart;
    private final CT_ShapePropertiesModel spPr;
    private final CT_TextBodyModel txPr;
    private final CT_ExternalDataModel externalData;
    private final CT_PrintSettingsModel printSettings;
    private final CT_RelIdModel userShapes;
    private final CT_ExtensionListModel extLst;

    public CT_ChartSpaceModel(CT_BooleanModel date1904, CT_TextLanguageIDModel lang, CT_BooleanModel roundedCorners, CT_StyleModel style, CT_ColorMappingModel clrMapOvr, CT_PivotSourceModel pivotSource, CT_ProtectionModel protection, CT_ChartModel chart, CT_ShapePropertiesModel spPr, CT_TextBodyModel txPr, CT_ExternalDataModel externalData, CT_PrintSettingsModel printSettings, CT_RelIdModel userShapes, CT_ExtensionListModel extLst) {
        this.date1904 = date1904;
        this.lang = lang;
        this.roundedCorners = roundedCorners;
        this.style = style;
        this.clrMapOvr = clrMapOvr;
        this.pivotSource = pivotSource;
        this.protection = protection;
        this.chart = chart;
        this.spPr = spPr;
        this.txPr = txPr;
        this.externalData = externalData;
        this.printSettings = printSettings;
        this.userShapes = userShapes;
        this.extLst = extLst;
    }

    public CT_BooleanModel getDate1904() {
        return this.date1904;
    }
    public CT_TextLanguageIDModel getLang() {
        return this.lang;
    }
    public CT_BooleanModel getRoundedCorners() {
        return this.roundedCorners;
    }
    public CT_StyleModel getStyle() {
        return this.style;
    }
    public CT_ColorMappingModel getClrMapOvr() {
        return this.clrMapOvr;
    }
    public CT_PivotSourceModel getPivotSource() {
        return this.pivotSource;
    }
    public CT_ProtectionModel getProtection() {
        return this.protection;
    }
    public CT_ChartModel getChart() {
        return this.chart;
    }
    public CT_ShapePropertiesModel getSpPr() {
        return this.spPr;
    }
    public CT_TextBodyModel getTxPr() {
        return this.txPr;
    }
    public CT_ExternalDataModel getExternalData() {
        return this.externalData;
    }
    public CT_PrintSettingsModel getPrintSettings() {
        return this.printSettings;
    }
    public CT_RelIdModel getUserShapes() {
        return this.userShapes;
    }
    public CT_ExtensionListModel getExtLst() {
        return this.extLst;
    }
}
