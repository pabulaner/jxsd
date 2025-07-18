package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import java.util.List;

public class CT_LineSerModel {
  private final CT_UnsignedIntModel idx;

  private final CT_UnsignedIntModel order;

  private final CT_SerTxModel tx;

  private final CT_ShapePropertiesModel spPr;

  private final CT_MarkerModel marker;

  private final List<CT_DPtModel> dPt;

  private final CT_DLblsModel dLbls;

  private final List<CT_TrendlineModel> trendline;

  private final CT_ErrBarsModel errBars;

  private final CT_AxDataSourceModel cat;

  private final CT_NumDataSourceModel val;

  private final CT_BooleanModel smooth;

  private final CT_ExtensionListModel extLst;

  public CT_LineSerModel(CT_UnsignedIntModel idx, CT_UnsignedIntModel order, CT_SerTxModel tx,
      CT_ShapePropertiesModel spPr, CT_MarkerModel marker, List<CT_DPtModel> dPt,
      CT_DLblsModel dLbls, List<CT_TrendlineModel> trendline, CT_ErrBarsModel errBars,
      CT_AxDataSourceModel cat, CT_NumDataSourceModel val, CT_BooleanModel smooth,
      CT_ExtensionListModel extLst) {
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

  public CT_UnsignedIntModel getIdx() {
    return this.idx;
  }

  public CT_UnsignedIntModel getOrder() {
    return this.order;
  }

  public CT_SerTxModel getTx() {
    return this.tx;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CT_MarkerModel getMarker() {
    return this.marker;
  }

  public List<CT_DPtModel> getDPt() {
    return this.dPt;
  }

  public CT_DLblsModel getDLbls() {
    return this.dLbls;
  }

  public List<CT_TrendlineModel> getTrendline() {
    return this.trendline;
  }

  public CT_ErrBarsModel getErrBars() {
    return this.errBars;
  }

  public CT_AxDataSourceModel getCat() {
    return this.cat;
  }

  public CT_NumDataSourceModel getVal() {
    return this.val;
  }

  public CT_BooleanModel getSmooth() {
    return this.smooth;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
