package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ColorMappingModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;

public class ChartSpaceModel {
  private final BooleanModel date1904;

  private final TextLanguageIDModel lang;

  private final BooleanModel roundedCorners;

  private final StyleModel style;

  private final ColorMappingModel clrMapOvr;

  private final PivotSourceModel pivotSource;

  private final ProtectionModel protection;

  private final ChartModel chart;

  private final ShapePropertiesModel spPr;

  private final TextBodyModel txPr;

  private final ExternalDataModel externalData;

  private final PrintSettingsModel printSettings;

  private final RelIdModel userShapes;

  private final ExtensionListModel extLst;

  public ChartSpaceModel(BooleanModel date1904, TextLanguageIDModel lang,
      BooleanModel roundedCorners, StyleModel style, ColorMappingModel clrMapOvr,
      PivotSourceModel pivotSource, ProtectionModel protection, ChartModel chart,
      ShapePropertiesModel spPr, TextBodyModel txPr, ExternalDataModel externalData,
      PrintSettingsModel printSettings, RelIdModel userShapes, ExtensionListModel extLst) {
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

  public BooleanModel getDate1904() {
    return this.date1904;
  }

  public TextLanguageIDModel getLang() {
    return this.lang;
  }

  public BooleanModel getRoundedCorners() {
    return this.roundedCorners;
  }

  public StyleModel getStyle() {
    return this.style;
  }

  public ColorMappingModel getClrMapOvr() {
    return this.clrMapOvr;
  }

  public PivotSourceModel getPivotSource() {
    return this.pivotSource;
  }

  public ProtectionModel getProtection() {
    return this.protection;
  }

  public ChartModel getChart() {
    return this.chart;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public TextBodyModel getTxPr() {
    return this.txPr;
  }

  public ExternalDataModel getExternalData() {
    return this.externalData;
  }

  public PrintSettingsModel getPrintSettings() {
    return this.printSettings;
  }

  public RelIdModel getUserShapes() {
    return this.userShapes;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
