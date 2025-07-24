package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ChartModel;
import com.scell.model.drawingml.chart.ChartSpaceModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.ExternalDataModel;
import com.scell.model.drawingml.chart.PivotSourceModel;
import com.scell.model.drawingml.chart.PrintSettingsModel;
import com.scell.model.drawingml.chart.ProtectionModel;
import com.scell.model.drawingml.chart.RelIdModel;
import com.scell.model.drawingml.chart.StyleModel;
import com.scell.model.drawingml.chart.TextLanguageIDModel;
import com.scell.model.drawingml.main.ColorMappingModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;

public class ChartSpaceBuilder {
  private BooleanModel date1904;

  private TextLanguageIDModel lang;

  private BooleanModel roundedCorners;

  private StyleModel style;

  private ColorMappingModel clrMapOvr;

  private PivotSourceModel pivotSource;

  private ProtectionModel protection;

  private ChartModel chart;

  private ShapePropertiesModel spPr;

  private TextBodyModel txPr;

  private ExternalDataModel externalData;

  private PrintSettingsModel printSettings;

  private RelIdModel userShapes;

  private ExtensionListModel extLst;

  public ChartSpaceBuilder() {
  }

  public ChartSpaceBuilder setDate1904(BooleanModel date1904) {
    this.date1904 = date1904;
    return this;
  }

  public ChartSpaceBuilder setLang(TextLanguageIDModel lang) {
    this.lang = lang;
    return this;
  }

  public ChartSpaceBuilder setRoundedCorners(BooleanModel roundedCorners) {
    this.roundedCorners = roundedCorners;
    return this;
  }

  public ChartSpaceBuilder setStyle(StyleModel style) {
    this.style = style;
    return this;
  }

  public ChartSpaceBuilder setClrMapOvr(ColorMappingModel clrMapOvr) {
    this.clrMapOvr = clrMapOvr;
    return this;
  }

  public ChartSpaceBuilder setPivotSource(PivotSourceModel pivotSource) {
    this.pivotSource = pivotSource;
    return this;
  }

  public ChartSpaceBuilder setProtection(ProtectionModel protection) {
    this.protection = protection;
    return this;
  }

  public ChartSpaceBuilder setChart(ChartModel chart) {
    this.chart = chart;
    return this;
  }

  public ChartSpaceBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public ChartSpaceBuilder setTxPr(TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public ChartSpaceBuilder setExternalData(ExternalDataModel externalData) {
    this.externalData = externalData;
    return this;
  }

  public ChartSpaceBuilder setPrintSettings(PrintSettingsModel printSettings) {
    this.printSettings = printSettings;
    return this;
  }

  public ChartSpaceBuilder setUserShapes(RelIdModel userShapes) {
    this.userShapes = userShapes;
    return this;
  }

  public ChartSpaceBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ChartSpaceModel build() {
    return new ChartSpaceModel(this.date1904, this.lang, this.roundedCorners, this.style, this.clrMapOvr, this.pivotSource, this.protection, this.chart, this.spPr, this.txPr, this.externalData, this.printSettings, this.userShapes, this.extLst);
  }

  public ChartSpaceBuilder from(ChartSpaceModel value) {
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
