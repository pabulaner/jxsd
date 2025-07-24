package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;

public class TrendlineLblModel {
  private final LayoutModel layout;

  private final TxModel tx;

  private final NumFmtModel numFmt;

  private final ShapePropertiesModel spPr;

  private final TextBodyModel txPr;

  private final ExtensionListModel extLst;

  public TrendlineLblModel(LayoutModel layout, TxModel tx, NumFmtModel numFmt,
      ShapePropertiesModel spPr, TextBodyModel txPr, ExtensionListModel extLst) {
    this.layout = layout;
    this.tx = tx;
    this.numFmt = numFmt;
    this.spPr = spPr;
    this.txPr = txPr;
    this.extLst = extLst;
  }

  public LayoutModel getLayout() {
    return this.layout;
  }

  public TxModel getTx() {
    return this.tx;
  }

  public NumFmtModel getNumFmt() {
    return this.numFmt;
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
