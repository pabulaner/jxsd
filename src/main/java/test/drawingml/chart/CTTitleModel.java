package test.drawingml.chart;

import test.drawingml.main.CTShapePropertiesModel;
import test.drawingml.main.CTTextBodyModel;

public class CTTitleModel {
  private final CTTxModel tx;

  private final CTLayoutModel layout;

  private final CTBooleanModel overlay;

  private final CTShapePropertiesModel spPr;

  private final CTTextBodyModel txPr;

  private final CTExtensionListModel extLst;

  public CTTitleModel(CTTxModel tx, CTLayoutModel layout, CTBooleanModel overlay,
      CTShapePropertiesModel spPr, CTTextBodyModel txPr, CTExtensionListModel extLst) {
    this.tx = tx;
    this.layout = layout;
    this.overlay = overlay;
    this.spPr = spPr;
    this.txPr = txPr;
    this.extLst = extLst;
  }

  public CTTxModel getTx() {
    return this.tx;
  }

  public CTLayoutModel getLayout() {
    return this.layout;
  }

  public CTBooleanModel getOverlay() {
    return this.overlay;
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
