package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DTableModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;

public class CT_DTableBuilder {
  private CT_BooleanModel showHorzBorder;

  private CT_BooleanModel showVertBorder;

  private CT_BooleanModel showOutline;

  private CT_BooleanModel showKeys;

  private CT_ShapePropertiesModel spPr;

  private CT_TextBodyModel txPr;

  private CT_ExtensionListModel extLst;

  public CT_DTableBuilder() {
  }

  public CT_DTableBuilder setShowHorzBorder(CT_BooleanModel showHorzBorder) {
    this.showHorzBorder = showHorzBorder;
    return this;
  }

  public CT_DTableBuilder setShowVertBorder(CT_BooleanModel showVertBorder) {
    this.showVertBorder = showVertBorder;
    return this;
  }

  public CT_DTableBuilder setShowOutline(CT_BooleanModel showOutline) {
    this.showOutline = showOutline;
    return this;
  }

  public CT_DTableBuilder setShowKeys(CT_BooleanModel showKeys) {
    this.showKeys = showKeys;
    return this;
  }

  public CT_DTableBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_DTableBuilder setTxPr(CT_TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public CT_DTableBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_DTableModel build() {
    return new CT_DTableModel(this.showHorzBorder, this.showVertBorder, this.showOutline, this.showKeys, this.spPr, this.txPr, this.extLst);
  }

  public CT_DTableBuilder from(CT_DTableModel value) {
    this.showHorzBorder = value.getShowHorzBorder();
    this.showVertBorder = value.getShowVertBorder();
    this.showOutline = value.getShowOutline();
    this.showKeys = value.getShowKeys();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    this.extLst = value.getExtLst();
    return this;
  }
}
