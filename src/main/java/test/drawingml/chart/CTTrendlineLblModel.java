package test.drawingml.chart;

import test.drawingml.main.CTShapePropertiesModel;
import test.drawingml.main.CTTextBodyModel;

public class CTTrendlineLblModel {
  private final CTLayoutModel layout;

  private final CTTxModel tx;

  private final CTNumFmtModel numFmt;

  private final CTShapePropertiesModel spPr;

  private final CTTextBodyModel txPr;

  private final CTExtensionListModel extLst;

  public CTTrendlineLblModel(CTLayoutModel layout, CTTxModel tx, CTNumFmtModel numFmt,
      CTShapePropertiesModel spPr, CTTextBodyModel txPr, CTExtensionListModel extLst) {
    this.layout = layout;
    this.tx = tx;
    this.numFmt = numFmt;
    this.spPr = spPr;
    this.txPr = txPr;
    this.extLst = extLst;
  }

  public CTLayoutModel getLayout() {
    return this.layout;
  }

  public CTTxModel getTx() {
    return this.tx;
  }

  public CTNumFmtModel getNumFmt() {
    return this.numFmt;
  }

  public CTShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CTTextBodyModel getTxPr() {
    return this.txPr;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
