package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;
import java.util.List;

public class LineSerModel {
  private final UnsignedIntModel idx;

  private final UnsignedIntModel order;

  private final SerTxModel tx;

  private final ShapePropertiesModel spPr;

  private final MarkerModel marker;

  private final List<DPtModel> dPt;

  private final DLblsModel dLbls;

  private final List<TrendlineModel> trendline;

  private final ErrBarsModel errBars;

  private final AxDataSourceModel cat;

  private final NumDataSourceModel val;

  private final BooleanModel smooth;

  private final ExtensionListModel extLst;

  public LineSerModel(UnsignedIntModel idx, UnsignedIntModel order, SerTxModel tx,
      ShapePropertiesModel spPr, MarkerModel marker, List<DPtModel> dPt, DLblsModel dLbls,
      List<TrendlineModel> trendline, ErrBarsModel errBars, AxDataSourceModel cat,
      NumDataSourceModel val, BooleanModel smooth, ExtensionListModel extLst) {
    this.idx = idx;
    this.order = order;
    this.tx = tx;
    this.spPr = spPr;
    this.marker = marker;
    this.dPt = dPt;
    this.dLbls = dLbls;
    this.trendline = trendline;
    this.errBars = errBars;
    this.cat = cat;
    this.val = val;
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

  public ErrBarsModel getErrBars() {
    return this.errBars;
  }

  public AxDataSourceModel getCat() {
    return this.cat;
  }

  public NumDataSourceModel getVal() {
    return this.val;
  }

  public BooleanModel getSmooth() {
    return this.smooth;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
