package test.drawingml.chart;

import test.drawingml.main.CTShapePropertiesModel;
import test.drawingml.main.CTTextBodyModel;

public class CTDispUnitsLblModel {
  private final CTLayoutModel layout;

  private final CTTxModel tx;

  private final CTShapePropertiesModel spPr;

  private final CTTextBodyModel txPr;

  public CTDispUnitsLblModel(CTLayoutModel layout, CTTxModel tx, CTShapePropertiesModel spPr,
      CTTextBodyModel txPr) {
    this.layout = layout;
    this.tx = tx;
    this.spPr = spPr;
    this.txPr = txPr;
  }

  public CTLayoutModel getLayout() {
    return this.layout;
  }

  public CTTxModel getTx() {
    return this.tx;
  }

  public CTShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CTTextBodyModel getTxPr() {
    return this.txPr;
  }
}
