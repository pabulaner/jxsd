package test.drawingml.chart;

import test.drawingml.main.CTShapePropertiesModel;

public class CTRadarSerModel {
  private final CTUnsignedIntModel idx;

  private final CTUnsignedIntModel order;

  private final CTSerTxModel tx;

  private final CTShapePropertiesModel spPr;

  private final CTMarkerModel marker;

  private final CTDPtModel dPt;

  private final CTDLblsModel dLbls;

  private final CTAxDataSourceModel cat;

  private final CTNumDataSourceModel val;

  private final CTExtensionListModel extLst;

  public CTRadarSerModel(CTUnsignedIntModel idx, CTUnsignedIntModel order, CTSerTxModel tx,
      CTShapePropertiesModel spPr, CTMarkerModel marker, CTDPtModel dPt, CTDLblsModel dLbls,
      CTAxDataSourceModel cat, CTNumDataSourceModel val, CTExtensionListModel extLst) {
    this.idx = idx;
    this.order = order;
    this.tx = tx;
    this.spPr = spPr;
    this.marker = marker;
    this.dPt = dPt;
    this.dLbls = dLbls;
    this.cat = cat;
    this.val = val;
    this.extLst = extLst;
  }

  public CTUnsignedIntModel getIdx() {
    return this.idx;
  }

  public CTUnsignedIntModel getOrder() {
    return this.order;
  }

  public CTSerTxModel getTx() {
    return this.tx;
  }

  public CTShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CTMarkerModel getMarker() {
    return this.marker;
  }

  public CTDPtModel getDPt() {
    return this.dPt;
  }

  public CTDLblsModel getDLbls() {
    return this.dLbls;
  }

  public CTAxDataSourceModel getCat() {
    return this.cat;
  }

  public CTNumDataSourceModel getVal() {
    return this.val;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
