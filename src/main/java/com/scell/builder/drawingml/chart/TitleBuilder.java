package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.LayoutModel;
import com.scell.model.drawingml.chart.TitleModel;
import com.scell.model.drawingml.chart.TxModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;

public class TitleBuilder {
  private TxModel tx;

  private LayoutModel layout;

  private BooleanModel overlay;

  private ShapePropertiesModel spPr;

  private TextBodyModel txPr;

  private ExtensionListModel extLst;

  public TitleBuilder() {
  }

  public TitleBuilder setTx(TxModel tx) {
    this.tx = tx;
    return this;
  }

  public TitleBuilder setLayout(LayoutModel layout) {
    this.layout = layout;
    return this;
  }

  public TitleBuilder setOverlay(BooleanModel overlay) {
    this.overlay = overlay;
    return this;
  }

  public TitleBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public TitleBuilder setTxPr(TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public TitleBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public TitleModel build() {
    return new TitleModel(this.tx, this.layout, this.overlay, this.spPr, this.txPr, this.extLst);
  }

  public TitleBuilder from(TitleModel value) {
    this.tx = value.getTx();
    this.layout = value.getLayout();
    this.overlay = value.getOverlay();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    this.extLst = value.getExtLst();
    return this;
  }
}
