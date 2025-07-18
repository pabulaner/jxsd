package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_LayoutModel;
import com.scell.model.drawingml.chart.CT_NumFmtModel;
import com.scell.model.drawingml.chart.CT_TrendlineLblModel;
import com.scell.model.drawingml.chart.CT_TxModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;

public class CT_TrendlineLblBuilder {
  private CT_LayoutModel layout;

  private CT_TxModel tx;

  private CT_NumFmtModel numFmt;

  private CT_ShapePropertiesModel spPr;

  private CT_TextBodyModel txPr;

  private CT_ExtensionListModel extLst;

  public CT_TrendlineLblBuilder() {
  }

  public CT_TrendlineLblBuilder setLayout(CT_LayoutModel layout) {
    this.layout = layout;
    return this;
  }

  public CT_TrendlineLblBuilder setTx(CT_TxModel tx) {
    this.tx = tx;
    return this;
  }

  public CT_TrendlineLblBuilder setNumFmt(CT_NumFmtModel numFmt) {
    this.numFmt = numFmt;
    return this;
  }

  public CT_TrendlineLblBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_TrendlineLblBuilder setTxPr(CT_TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public CT_TrendlineLblBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_TrendlineLblModel build() {
    return new CT_TrendlineLblModel(this.layout, this.tx, this.numFmt, this.spPr, this.txPr, this.extLst);
  }

  public CT_TrendlineLblBuilder from(CT_TrendlineLblModel value) {
    this.layout = value.getLayout();
    this.tx = value.getTx();
    this.numFmt = value.getNumFmt();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    this.extLst = value.getExtLst();
    return this;
  }
}
