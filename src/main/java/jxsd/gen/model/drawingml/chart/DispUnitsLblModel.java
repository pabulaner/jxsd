package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.DispUnitsLblBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
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

  public DispUnitsLblBuilder builder() {
    return new DispUnitsLblBuilder().from(this);
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
