package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.DispUnitsLblModel;
import com.scell.model.drawingml.chart.LayoutModel;
import com.scell.model.drawingml.chart.TxModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;

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

  public DispUnitsLblModel build() {
    return new DispUnitsLblModel(this.layout, this.tx, this.spPr, this.txPr);
  }

  public DispUnitsLblBuilder from(DispUnitsLblModel value) {
    this.layout = value.getLayout();
    this.tx = value.getTx();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    return this;
  }
}
