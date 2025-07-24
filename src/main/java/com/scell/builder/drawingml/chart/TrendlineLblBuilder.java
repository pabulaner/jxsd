package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.LayoutModel;
import com.scell.model.drawingml.chart.NumFmtModel;
import com.scell.model.drawingml.chart.TrendlineLblModel;
import com.scell.model.drawingml.chart.TxModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;

public class TrendlineLblBuilder {
  private LayoutModel layout;

  private TxModel tx;

  private NumFmtModel numFmt;

  private ShapePropertiesModel spPr;

  private TextBodyModel txPr;

  private ExtensionListModel extLst;

  public TrendlineLblBuilder() {
  }

  public TrendlineLblBuilder setLayout(LayoutModel layout) {
    this.layout = layout;
    return this;
  }

  public TrendlineLblBuilder setTx(TxModel tx) {
    this.tx = tx;
    return this;
  }

  public TrendlineLblBuilder setNumFmt(NumFmtModel numFmt) {
    this.numFmt = numFmt;
    return this;
  }

  public TrendlineLblBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public TrendlineLblBuilder setTxPr(TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public TrendlineLblBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public TrendlineLblModel build() {
    return new TrendlineLblModel(this.layout, this.tx, this.numFmt, this.spPr, this.txPr, this.extLst);
  }

  public TrendlineLblBuilder from(TrendlineLblModel value) {
    this.layout = value.getLayout();
    this.tx = value.getTx();
    this.numFmt = value.getNumFmt();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    this.extLst = value.getExtLst();
    return this;
  }
}
