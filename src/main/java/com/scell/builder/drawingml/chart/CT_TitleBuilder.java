package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_LayoutModel;
import com.scell.model.drawingml.chart.CT_TitleModel;
import com.scell.model.drawingml.chart.CT_TxModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;

public class CT_TitleBuilder {
  private CT_TxModel tx;

  private CT_LayoutModel layout;

  private CT_BooleanModel overlay;

  private CT_ShapePropertiesModel spPr;

  private CT_TextBodyModel txPr;

  private CT_ExtensionListModel extLst;

  public CT_TitleBuilder() {
  }

  public CT_TitleBuilder setTx(CT_TxModel tx) {
    this.tx = tx;
    return this;
  }

  public CT_TitleBuilder setLayout(CT_LayoutModel layout) {
    this.layout = layout;
    return this;
  }

  public CT_TitleBuilder setOverlay(CT_BooleanModel overlay) {
    this.overlay = overlay;
    return this;
  }

  public CT_TitleBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_TitleBuilder setTxPr(CT_TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public CT_TitleBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_TitleModel build() {
    return new CT_TitleModel(this.tx, this.layout, this.overlay, this.spPr, this.txPr, this.extLst);
  }

  public CT_TitleBuilder from(CT_TitleModel value) {
    this.tx = value.getTx();
    this.layout = value.getLayout();
    this.overlay = value.getOverlay();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    this.extLst = value.getExtLst();
    return this;
  }
}
