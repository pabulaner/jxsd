package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.DTableModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;

public class DTableBuilder {
  private BooleanModel showHorzBorder;

  private BooleanModel showVertBorder;

  private BooleanModel showOutline;

  private BooleanModel showKeys;

  private ShapePropertiesModel spPr;

  private TextBodyModel txPr;

  private ExtensionListModel extLst;

  public DTableBuilder() {
  }

  public DTableBuilder setShowHorzBorder(BooleanModel showHorzBorder) {
    this.showHorzBorder = showHorzBorder;
    return this;
  }

  public DTableBuilder setShowVertBorder(BooleanModel showVertBorder) {
    this.showVertBorder = showVertBorder;
    return this;
  }

  public DTableBuilder setShowOutline(BooleanModel showOutline) {
    this.showOutline = showOutline;
    return this;
  }

  public DTableBuilder setShowKeys(BooleanModel showKeys) {
    this.showKeys = showKeys;
    return this;
  }

  public DTableBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public DTableBuilder setTxPr(TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public DTableBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public DTableModel build() {
    return new DTableModel(this.showHorzBorder, this.showVertBorder, this.showOutline, this.showKeys, this.spPr, this.txPr, this.extLst);
  }

  public DTableBuilder from(DTableModel value) {
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
