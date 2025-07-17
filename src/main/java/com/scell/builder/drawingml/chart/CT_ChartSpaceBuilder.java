package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ChartModel;
import com.scell.model.drawingml.chart.CT_ChartSpaceModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_ExternalDataModel;
import com.scell.model.drawingml.chart.CT_PivotSourceModel;
import com.scell.model.drawingml.chart.CT_PrintSettingsModel;
import com.scell.model.drawingml.chart.CT_ProtectionModel;
import com.scell.model.drawingml.chart.CT_RelIdModel;
import com.scell.model.drawingml.chart.CT_StyleModel;
import com.scell.model.drawingml.chart.CT_TextLanguageIDModel;
import com.scell.model.drawingml.main.CT_ColorMappingModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;

public class CT_ChartSpaceBuilder {
  private CT_BooleanModel date1904;

  private CT_TextLanguageIDModel lang;

  private CT_BooleanModel roundedCorners;

  private CT_StyleModel style;

  private CT_ColorMappingModel clrMapOvr;

  private CT_PivotSourceModel pivotSource;

  private CT_ProtectionModel protection;

  private CT_ChartModel chart;

  private CT_ShapePropertiesModel spPr;

  private CT_TextBodyModel txPr;

  private CT_ExternalDataModel externalData;

  private CT_PrintSettingsModel printSettings;

  private CT_RelIdModel userShapes;

  private CT_ExtensionListModel extLst;

  public CT_ChartSpaceBuilder() {
  }

  public CT_ChartSpaceBuilder setDate1904(CT_BooleanModel date1904) {
    this.date1904 = date1904;
    return this;
  }

  public CT_ChartSpaceBuilder setLang(CT_TextLanguageIDModel lang) {
    this.lang = lang;
    return this;
  }

  public CT_ChartSpaceBuilder setRoundedCorners(CT_BooleanModel roundedCorners) {
    this.roundedCorners = roundedCorners;
    return this;
  }

  public CT_ChartSpaceBuilder setStyle(CT_StyleModel style) {
    this.style = style;
    return this;
  }

  public CT_ChartSpaceBuilder setClrMapOvr(CT_ColorMappingModel clrMapOvr) {
    this.clrMapOvr = clrMapOvr;
    return this;
  }

  public CT_ChartSpaceBuilder setPivotSource(CT_PivotSourceModel pivotSource) {
    this.pivotSource = pivotSource;
    return this;
  }

  public CT_ChartSpaceBuilder setProtection(CT_ProtectionModel protection) {
    this.protection = protection;
    return this;
  }

  public CT_ChartSpaceBuilder setChart(CT_ChartModel chart) {
    this.chart = chart;
    return this;
  }

  public CT_ChartSpaceBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_ChartSpaceBuilder setTxPr(CT_TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public CT_ChartSpaceBuilder setExternalData(CT_ExternalDataModel externalData) {
    this.externalData = externalData;
    return this;
  }

  public CT_ChartSpaceBuilder setPrintSettings(CT_PrintSettingsModel printSettings) {
    this.printSettings = printSettings;
    return this;
  }

  public CT_ChartSpaceBuilder setUserShapes(CT_RelIdModel userShapes) {
    this.userShapes = userShapes;
    return this;
  }

  public CT_ChartSpaceBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_ChartSpaceModel build() {
    return new CT_ChartSpaceModel(this.date1904, this.lang, this.roundedCorners, this.style, this.clrMapOvr, this.pivotSource, this.protection, this.chart, this.spPr, this.txPr, this.externalData, this.printSettings, this.userShapes, this.extLst);
  }

  public CT_ChartSpaceBuilder from(CT_ChartSpaceModel value) {
    this.date1904 = value.getDate1904();
    this.lang = value.getLang();
    this.roundedCorners = value.getRoundedCorners();
    this.style = value.getStyle();
    this.clrMapOvr = value.getClrMapOvr();
    this.pivotSource = value.getPivotSource();
    this.protection = value.getProtection();
    this.chart = value.getChart();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    this.externalData = value.getExternalData();
    this.printSettings = value.getPrintSettings();
    this.userShapes = value.getUserShapes();
    this.extLst = value.getExtLst();
    return this;
  }
}
