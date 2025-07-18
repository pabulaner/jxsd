package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxDataSourceModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_DPtModel;
import com.scell.model.drawingml.chart.CT_ErrBarsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_MarkerModel;
import com.scell.model.drawingml.chart.CT_NumDataSourceModel;
import com.scell.model.drawingml.chart.CT_ScatterSerModel;
import com.scell.model.drawingml.chart.CT_SerTxModel;
import com.scell.model.drawingml.chart.CT_TrendlineModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import java.util.List;

public class CT_ScatterSerBuilder {
  private CT_UnsignedIntModel idx;

  private CT_UnsignedIntModel order;

  private CT_SerTxModel tx;

  private CT_ShapePropertiesModel spPr;

  private CT_MarkerModel marker;

  private List<CT_DPtModel> dPt;

  private CT_DLblsModel dLbls;

  private List<CT_TrendlineModel> trendline;

  private List<CT_ErrBarsModel> errBars;

  private CT_AxDataSourceModel xVal;

  private CT_NumDataSourceModel yVal;

  private CT_BooleanModel smooth;

  private CT_ExtensionListModel extLst;

  public CT_ScatterSerBuilder() {
  }

  public CT_ScatterSerBuilder setIdx(CT_UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_ScatterSerBuilder setOrder(CT_UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public CT_ScatterSerBuilder setTx(CT_SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public CT_ScatterSerBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_ScatterSerBuilder setMarker(CT_MarkerModel marker) {
    this.marker = marker;
    return this;
  }

  public CT_ScatterSerBuilder setDPt(List<CT_DPtModel> dPt) {
    this.dPt = dPt;
    return this;
  }

  public CT_ScatterSerBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_ScatterSerBuilder setTrendline(List<CT_TrendlineModel> trendline) {
    this.trendline = trendline;
    return this;
  }

  public CT_ScatterSerBuilder setErrBars(List<CT_ErrBarsModel> errBars) {
    this.errBars = errBars;
    return this;
  }

  public CT_ScatterSerBuilder setXVal(CT_AxDataSourceModel xVal) {
    this.xVal = xVal;
    return this;
  }

  public CT_ScatterSerBuilder setYVal(CT_NumDataSourceModel yVal) {
    this.yVal = yVal;
    return this;
  }

  public CT_ScatterSerBuilder setSmooth(CT_BooleanModel smooth) {
    this.smooth = smooth;
    return this;
  }

  public CT_ScatterSerBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_ScatterSerModel build() {
    return new CT_ScatterSerModel(this.idx, this.order, this.tx, this.spPr, this.marker, this.dPt, this.dLbls, this.trendline, this.errBars, this.xVal, this.yVal, this.smooth, this.extLst);
  }

  public CT_ScatterSerBuilder from(CT_ScatterSerModel value) {
    this.idx = value.getIdx();
    this.order = value.getOrder();
    this.tx = value.getTx();
    this.spPr = value.getSpPr();
    this.marker = value.getMarker();
    this.dPt = value.getDPt();
    this.dLbls = value.getDLbls();
    this.trendline = value.getTrendline();
    this.errBars = value.getErrBars();
    this.xVal = value.getXVal();
    this.yVal = value.getYVal();
    this.smooth = value.getSmooth();
    this.extLst = value.getExtLst();
    return this;
  }
}
