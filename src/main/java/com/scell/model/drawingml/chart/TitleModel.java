package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;

public class TitleModel {
  private final TxModel tx;

  private final LayoutModel layout;

  private final BooleanModel overlay;

  private final ShapePropertiesModel spPr;

  private final TextBodyModel txPr;

  private final ExtensionListModel extLst;

  public TitleModel(TxModel tx, LayoutModel layout, BooleanModel overlay, ShapePropertiesModel spPr,
      TextBodyModel txPr, ExtensionListModel extLst) {
    this.tx = tx;
    this.layout = layout;
    this.overlay = overlay;
    this.spPr = spPr;
    this.txPr = txPr;
    this.extLst = extLst;
  }

  public TxModel getTx() {
    return this.tx;
  }

  public LayoutModel getLayout() {
    return this.layout;
  }

  public BooleanModel getOverlay() {
    return this.overlay;
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
