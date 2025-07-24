package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;
import java.util.List;

public class ScatterSerModel {
  private final UnsignedIntModel idx;

  private final UnsignedIntModel order;

  private final SerTxModel tx;

  private final ShapePropertiesModel spPr;

  private final MarkerModel marker;

  private final List<DPtModel> dPt;

  private final DLblsModel dLbls;

  private final List<TrendlineModel> trendline;

  private final List<ErrBarsModel> errBars;

  private final AxDataSourceModel xVal;

  private final NumDataSourceModel yVal;

  private final BooleanModel smooth;

  private final ExtensionListModel extLst;

  public ScatterSerModel(UnsignedIntModel idx, UnsignedIntModel order, SerTxModel tx,
      ShapePropertiesModel spPr, MarkerModel marker, List<DPtModel> dPt, DLblsModel dLbls,
      List<TrendlineModel> trendline, List<ErrBarsModel> errBars, AxDataSourceModel xVal,
      NumDataSourceModel yVal, BooleanModel smooth, ExtensionListModel extLst) {
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

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public UnsignedIntModel getOrder() {
    return this.order;
  }

  public SerTxModel getTx() {
    return this.tx;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public MarkerModel getMarker() {
    return this.marker;
  }

  public List<DPtModel> getDPt() {
    return this.dPt;
  }

  public DLblsModel getDLbls() {
    return this.dLbls;
  }

  public List<TrendlineModel> getTrendline() {
    return this.trendline;
  }

  public List<ErrBarsModel> getErrBars() {
    return this.errBars;
  }

  public AxDataSourceModel getXVal() {
    return this.xVal;
  }

  public NumDataSourceModel getYVal() {
    return this.yVal;
  }

  public BooleanModel getSmooth() {
    return this.smooth;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
