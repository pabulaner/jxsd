package test.drawingml.chart;

import test.drawingml.main.CTShapePropertiesModel;
import test.drawingml.main.CTTextBodyModel;

public class CTPivotFmtModel {
  private final CTUnsignedIntModel idx;

  private final CTShapePropertiesModel spPr;

  private final CTTextBodyModel txPr;

  private final CTMarkerModel marker;

  private final CTDLblModel dLbl;

  private final CTExtensionListModel extLst;

  public CTPivotFmtModel(CTUnsignedIntModel idx, CTShapePropertiesModel spPr, CTTextBodyModel txPr,
      CTMarkerModel marker, CTDLblModel dLbl, CTExtensionListModel extLst) {
    this.idx = idx;
    this.spPr = spPr;
    this.txPr = txPr;
    this.marker = marker;
    this.dLbl = dLbl;
    this.extLst = extLst;
  }

  public CTUnsignedIntModel getIdx() {
    return this.idx;
  }

  public CTShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CTTextBodyModel getTxPr() {
    return this.txPr;
  }

  public CTMarkerModel getMarker() {
    return this.marker;
  }

  public CTDLblModel getDLbl() {
    return this.dLbl;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
