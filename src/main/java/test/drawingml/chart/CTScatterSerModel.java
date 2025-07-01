package test.drawingml.chart;

import test.drawingml.main.CTShapePropertiesModel;

public class CTScatterSerModel {
  private final CTUnsignedIntModel idx;

  private final CTUnsignedIntModel order;

  private final CTSerTxModel tx;

  private final CTShapePropertiesModel spPr;

  private final CTMarkerModel marker;

  private final CTDPtModel dPt;

  private final CTDLblsModel dLbls;

  private final CTTrendlineModel trendline;

  private final CTErrBarsModel errBars;

  private final CTAxDataSourceModel xVal;

  private final CTNumDataSourceModel yVal;

  private final CTBooleanModel smooth;

  private final CTExtensionListModel extLst;

  public CTScatterSerModel(CTUnsignedIntModel idx, CTUnsignedIntModel order, CTSerTxModel tx,
      CTShapePropertiesModel spPr, CTMarkerModel marker, CTDPtModel dPt, CTDLblsModel dLbls,
      CTTrendlineModel trendline, CTErrBarsModel errBars, CTAxDataSourceModel xVal,
      CTNumDataSourceModel yVal, CTBooleanModel smooth, CTExtensionListModel extLst) {
    this.idx = idx;
    this.order = order;
    this.tx = tx;
    this.spPr = spPr;
    this.marker = marker;
    this.dPt = dPt;
    this.dLbls = dLbls;
    this.trendline = trendline;
    this.errBars = errBars;
    this.xVal = xVal;
    this.yVal = yVal;
    this.smooth = smooth;
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

  public CTTrendlineModel getTrendline() {
    return this.trendline;
  }

  public CTErrBarsModel getErrBars() {
    return this.errBars;
  }

  public CTAxDataSourceModel getXVal() {
    return this.xVal;
  }

  public CTNumDataSourceModel getYVal() {
    return this.yVal;
  }

  public CTBooleanModel getSmooth() {
    return this.smooth;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
