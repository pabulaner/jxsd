package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.LayoutModel;
import jxsd.gen.model.drawingml.chart.TitleModel;
import jxsd.gen.model.drawingml.chart.TxModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
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

  public TitleBuilder from(TitleModel value) {
    this.tx = value.getTx();
    this.layout = value.getLayout();
    this.overlay = value.getOverlay();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    this.extLst = value.getExtLst();
    return this;
  }

  public TitleModel build() {
    return new TitleModel(this.tx, this.layout, this.overlay, this.spPr, this.txPr, this.extLst);
  }
}
