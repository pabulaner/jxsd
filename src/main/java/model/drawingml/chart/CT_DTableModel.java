package model.drawingml.chart;

import model.drawingml.main.CT_ShapePropertiesModel;
import model.drawingml.main.CT_TextBodyModel;

public class CT_DTableModel {
  private final CT_BooleanModel showHorzBorder;

  private final CT_BooleanModel showVertBorder;

  private final CT_BooleanModel showOutline;

  private final CT_BooleanModel showKeys;

  private final CT_ShapePropertiesModel spPr;

  private final CT_TextBodyModel txPr;

  private final CT_ExtensionListModel extLst;

  public CT_DTableModel(CT_BooleanModel showHorzBorder, CT_BooleanModel showVertBorder,
      CT_BooleanModel showOutline, CT_BooleanModel showKeys, CT_ShapePropertiesModel spPr,
      CT_TextBodyModel txPr, CT_ExtensionListModel extLst) {
    this.showHorzBorder = showHorzBorder;
    this.showVertBorder = showVertBorder;
    this.showOutline = showOutline;
    this.showKeys = showKeys;
    this.spPr = spPr;
    this.txPr = txPr;
    this.extLst = extLst;
  }

  public CT_BooleanModel getShowHorzBorder() {
    return this.showHorzBorder;
  }

  public CT_BooleanModel getShowVertBorder() {
    return this.showVertBorder;
  }

  public CT_BooleanModel getShowOutline() {
    return this.showOutline;
  }

  public CT_BooleanModel getShowKeys() {
    return this.showKeys;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CT_TextBodyModel getTxPr() {
    return this.txPr;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
