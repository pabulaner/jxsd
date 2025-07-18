package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DispUnitsLblModel;
import com.scell.model.drawingml.chart.CT_LayoutModel;
import com.scell.model.drawingml.chart.CT_TxModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;

public class CT_DispUnitsLblBuilder {
  private CT_LayoutModel layout;

  private CT_TxModel tx;

  private CT_ShapePropertiesModel spPr;

  private CT_TextBodyModel txPr;

  public CT_DispUnitsLblBuilder() {
  }

  public CT_DispUnitsLblBuilder setLayout(CT_LayoutModel layout) {
    this.layout = layout;
    return this;
  }

  public CT_DispUnitsLblBuilder setTx(CT_TxModel tx) {
    this.tx = tx;
    return this;
  }

  public CT_DispUnitsLblBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_DispUnitsLblBuilder setTxPr(CT_TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public CT_DispUnitsLblModel build() {
    return new CT_DispUnitsLblModel(this.layout, this.tx, this.spPr, this.txPr);
  }

  public CT_DispUnitsLblBuilder from(CT_DispUnitsLblModel value) {
    this.layout = value.getLayout();
    this.tx = value.getTx();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    return this;
  }
}
