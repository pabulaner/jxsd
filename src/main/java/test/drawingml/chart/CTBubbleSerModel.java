package test.drawingml.chart;

import test.drawingml.main.CTShapePropertiesModel;

public class CTBubbleSerModel {
  private final CTUnsignedIntModel idx;

  private final CTUnsignedIntModel order;

  private final CTSerTxModel tx;

  private final CTShapePropertiesModel spPr;

  private final CTBooleanModel invertIfNegative;

  private final CTDPtModel dPt;

  private final CTDLblsModel dLbls;

  private final CTTrendlineModel trendline;

  private final CTErrBarsModel errBars;

  private final CTAxDataSourceModel xVal;

  private final CTNumDataSourceModel yVal;

  private final CTNumDataSourceModel bubbleSize;

  private final CTBooleanModel bubble3D;

  private final CTExtensionListModel extLst;

  public CTBubbleSerModel(CTUnsignedIntModel idx, CTUnsignedIntModel order, CTSerTxModel tx,
      CTShapePropertiesModel spPr, CTBooleanModel invertIfNegative, CTDPtModel dPt,
      CTDLblsModel dLbls, CTTrendlineModel trendline, CTErrBarsModel errBars,
      CTAxDataSourceModel xVal, CTNumDataSourceModel yVal, CTNumDataSourceModel bubbleSize,
      CTBooleanModel bubble3D, CTExtensionListModel extLst) {
    this.idx = idx;
    this.order = order;
    this.tx = tx;
    this.spPr = spPr;
    this.invertIfNegative = invertIfNegative;
    this.dPt = dPt;
    this.dLbls = dLbls;
    this.trendline = trendline;
    this.errBars = errBars;
    this.xVal = xVal;
    this.yVal = yVal;
    this.bubbleSize = bubbleSize;
    this.bubble3D = bubble3D;
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

  public CTBooleanModel getInvertIfNegative() {
    return this.invertIfNegative;
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

  public CTNumDataSourceModel getBubbleSize() {
    return this.bubbleSize;
  }

  public CTBooleanModel getBubble3D() {
    return this.bubble3D;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
