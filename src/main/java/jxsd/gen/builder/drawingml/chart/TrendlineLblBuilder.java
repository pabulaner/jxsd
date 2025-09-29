package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.LayoutModel;
import jxsd.gen.model.drawingml.chart.NumFmtModel;
import jxsd.gen.model.drawingml.chart.TrendlineLblModel;
import jxsd.gen.model.drawingml.chart.TxModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
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

  public TrendlineLblBuilder from(TrendlineLblModel value) {
    this.layout = value.getLayout();
    this.tx = value.getTx();
    this.numFmt = value.getNumFmt();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    this.extLst = value.getExtLst();
    return this;
  }

  public TrendlineLblModel build() {
    return new TrendlineLblModel(this.layout, this.tx, this.numFmt, this.spPr, this.txPr, this.extLst);
  }
}
