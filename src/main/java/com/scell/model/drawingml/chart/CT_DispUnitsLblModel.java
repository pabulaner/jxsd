package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;

public class CT_DispUnitsLblModel {
  private final CT_LayoutModel layout;

  private final CT_TxModel tx;

  private final CT_ShapePropertiesModel spPr;

  private final CT_TextBodyModel txPr;

  public CT_DispUnitsLblModel(CT_LayoutModel layout, CT_TxModel tx, CT_ShapePropertiesModel spPr,
      CT_TextBodyModel txPr) {
    this.layout = layout;
    this.tx = tx;
    this.spPr = spPr;
    this.txPr = txPr;
  }

  public CT_LayoutModel getLayout() {
    return this.layout;
  }

  public CT_TxModel getTx() {
    return this.tx;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CT_TextBodyModel getTxPr() {
    return this.txPr;
  }
}
