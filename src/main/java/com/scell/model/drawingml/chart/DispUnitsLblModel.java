package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;

public class DispUnitsLblModel {
  private final LayoutModel layout;

  private final TxModel tx;

  private final ShapePropertiesModel spPr;

  private final TextBodyModel txPr;

  public DispUnitsLblModel(LayoutModel layout, TxModel tx, ShapePropertiesModel spPr,
      TextBodyModel txPr) {
    this.layout = layout;
    this.tx = tx;
    this.spPr = spPr;
    this.txPr = txPr;
  }

  public LayoutModel getLayout() {
    return this.layout;
  }

  public TxModel getTx() {
    return this.tx;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public TextBodyModel getTxPr() {
    return this.txPr;
  }
}
