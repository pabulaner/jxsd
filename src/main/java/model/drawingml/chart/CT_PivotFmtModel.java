package model.drawingml.chart;

import model.drawingml.main.CT_ShapePropertiesModel;
import model.drawingml.main.CT_TextBodyModel;

public class CT_PivotFmtModel {
  private final CT_UnsignedIntModel idx;

  private final CT_ShapePropertiesModel spPr;

  private final CT_TextBodyModel txPr;

  private final CT_MarkerModel marker;

  private final CT_DLblModel dLbl;

  private final CT_ExtensionListModel extLst;

  public CT_PivotFmtModel(CT_UnsignedIntModel idx, CT_ShapePropertiesModel spPr,
      CT_TextBodyModel txPr, CT_MarkerModel marker, CT_DLblModel dLbl,
      CT_ExtensionListModel extLst) {
    this.idx = idx;
    this.spPr = spPr;
    this.txPr = txPr;
    this.marker = marker;
    this.dLbl = dLbl;
    this.extLst = extLst;
  }

  public CT_UnsignedIntModel getIdx() {
    return this.idx;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CT_TextBodyModel getTxPr() {
    return this.txPr;
  }

  public CT_MarkerModel getMarker() {
    return this.marker;
  }

  public CT_DLblModel getDLbl() {
    return this.dLbl;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
