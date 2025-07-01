package test.drawingml.chart;

import test.drawingml.main.CTShapePropertiesModel;
import test.drawingml.main.CTTextBodyModel;

public class CTDTableModel {
  private final CTBooleanModel showHorzBorder;

  private final CTBooleanModel showVertBorder;

  private final CTBooleanModel showOutline;

  private final CTBooleanModel showKeys;

  private final CTShapePropertiesModel spPr;

  private final CTTextBodyModel txPr;

  private final CTExtensionListModel extLst;

  public CTDTableModel(CTBooleanModel showHorzBorder, CTBooleanModel showVertBorder,
      CTBooleanModel showOutline, CTBooleanModel showKeys, CTShapePropertiesModel spPr,
      CTTextBodyModel txPr, CTExtensionListModel extLst) {
    this.showHorzBorder = showHorzBorder;
    this.showVertBorder = showVertBorder;
    this.showOutline = showOutline;
    this.showKeys = showKeys;
    this.spPr = spPr;
    this.txPr = txPr;
    this.extLst = extLst;
  }

  public CTBooleanModel getShowHorzBorder() {
    return this.showHorzBorder;
  }

  public CTBooleanModel getShowVertBorder() {
    return this.showVertBorder;
  }

  public CTBooleanModel getShowOutline() {
    return this.showOutline;
  }

  public CTBooleanModel getShowKeys() {
    return this.showKeys;
  }

  public CTShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CTTextBodyModel getTxPr() {
    return this.txPr;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
