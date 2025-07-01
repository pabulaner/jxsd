package test.drawingml.chart;

import test.drawingml.main.CTShapePropertiesModel;

public class CTAreaSerModel {
  private final CTUnsignedIntModel idx;

  private final CTUnsignedIntModel order;

  private final CTSerTxModel tx;

  private final CTShapePropertiesModel spPr;

  private final CTPictureOptionsModel pictureOptions;

  private final CTDPtModel dPt;

  private final CTDLblsModel dLbls;

  private final CTTrendlineModel trendline;

  private final CTErrBarsModel errBars;

  private final CTAxDataSourceModel cat;

  private final CTNumDataSourceModel val;

  private final CTExtensionListModel extLst;

  public CTAreaSerModel(CTUnsignedIntModel idx, CTUnsignedIntModel order, CTSerTxModel tx,
      CTShapePropertiesModel spPr, CTPictureOptionsModel pictureOptions, CTDPtModel dPt,
      CTDLblsModel dLbls, CTTrendlineModel trendline, CTErrBarsModel errBars,
      CTAxDataSourceModel cat, CTNumDataSourceModel val, CTExtensionListModel extLst) {
    this.idx = idx;
    this.order = order;
    this.tx = tx;
    this.spPr = spPr;
    this.pictureOptions = pictureOptions;
    this.dPt = dPt;
    this.dLbls = dLbls;
    this.trendline = trendline;
    this.errBars = errBars;
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

  public CTPictureOptionsModel getPictureOptions() {
    return this.pictureOptions;
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
