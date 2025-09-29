package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.DispUnitsLblModel;
import jxsd.gen.model.drawingml.chart.LayoutModel;
import jxsd.gen.model.drawingml.chart.TxModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class DispUnitsLblBuilder {
  private LayoutModel layout;

  private TxModel tx;

  private ShapePropertiesModel spPr;

  private TextBodyModel txPr;

  public DispUnitsLblBuilder() {
  }

  public DispUnitsLblBuilder setLayout(LayoutModel layout) {
    this.layout = layout;
    return this;
  }

  public DispUnitsLblBuilder setTx(TxModel tx) {
    this.tx = tx;
    return this;
  }

  public DispUnitsLblBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public DispUnitsLblBuilder setTxPr(TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public DispUnitsLblBuilder from(DispUnitsLblModel value) {
    this.layout = value.getLayout();
    this.tx = value.getTx();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    return this;
  }

  public DispUnitsLblModel build() {
    return new DispUnitsLblModel(this.layout, this.tx, this.spPr, this.txPr);
  }
}
