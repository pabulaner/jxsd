package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;

public class DTableModel {
  private final BooleanModel showHorzBorder;

  private final BooleanModel showVertBorder;

  private final BooleanModel showOutline;

  private final BooleanModel showKeys;

  private final ShapePropertiesModel spPr;

  private final TextBodyModel txPr;

  private final ExtensionListModel extLst;

  public DTableModel(BooleanModel showHorzBorder, BooleanModel showVertBorder,
      BooleanModel showOutline, BooleanModel showKeys, ShapePropertiesModel spPr,
      TextBodyModel txPr, ExtensionListModel extLst) {
    this.showHorzBorder = showHorzBorder;
    this.showVertBorder = showVertBorder;
    this.showOutline = showOutline;
    this.showKeys = showKeys;
    this.spPr = spPr;
    this.txPr = txPr;
    this.extLst = extLst;
  }

  public BooleanModel getShowHorzBorder() {
    return this.showHorzBorder;
  }

  public BooleanModel getShowVertBorder() {
    return this.showVertBorder;
  }

  public BooleanModel getShowOutline() {
    return this.showOutline;
  }

  public BooleanModel getShowKeys() {
    return this.showKeys;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public TextBodyModel getTxPr() {
    return this.txPr;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
