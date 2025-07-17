package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxDataSourceModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_DPtModel;
import com.scell.model.drawingml.chart.CT_ErrBarsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_LineSerModel;
import com.scell.model.drawingml.chart.CT_MarkerModel;
import com.scell.model.drawingml.chart.CT_NumDataSourceModel;
import com.scell.model.drawingml.chart.CT_SerTxModel;
import com.scell.model.drawingml.chart.CT_TrendlineModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import java.util.List;

public class CT_LineSerBuilder {
  private CT_UnsignedIntModel idx;

  private CT_UnsignedIntModel order;

  private CT_SerTxModel tx;

  private CT_ShapePropertiesModel spPr;

  private CT_MarkerModel marker;

  private List<CT_DPtModel> dPt;

  private CT_DLblsModel dLbls;

  private List<CT_TrendlineModel> trendline;

  private CT_ErrBarsModel errBars;

  private CT_AxDataSourceModel cat;

  private CT_NumDataSourceModel val;

  private CT_BooleanModel smooth;

  private CT_ExtensionListModel extLst;

  public CT_LineSerBuilder() {
  }

  public CT_LineSerBuilder setIdx(CT_UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_LineSerBuilder setOrder(CT_UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public CT_LineSerBuilder setTx(CT_SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public CT_LineSerBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_LineSerBuilder setMarker(CT_MarkerModel marker) {
    this.marker = marker;
    return this;
  }

  public CT_LineSerBuilder setDPt(List<CT_DPtModel> dPt) {
    this.dPt = dPt;
    return this;
  }

  public CT_LineSerBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_LineSerBuilder setTrendline(List<CT_TrendlineModel> trendline) {
    this.trendline = trendline;
    return this;
  }

  public CT_LineSerBuilder setErrBars(CT_ErrBarsModel errBars) {
    this.errBars = errBars;
    return this;
  }

  public CT_LineSerBuilder setCat(CT_AxDataSourceModel cat) {
    this.cat = cat;
    return this;
  }

  public CT_LineSerBuilder setVal(CT_NumDataSourceModel val) {
    this.val = val;
    return this;
  }

  public CT_LineSerBuilder setSmooth(CT_BooleanModel smooth) {
    this.smooth = smooth;
    return this;
  }

  public CT_LineSerBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_LineSerModel build() {
    return new CT_LineSerModel(this.idx, this.order, this.tx, this.spPr, this.marker, this.dPt, this.dLbls, this.trendline, this.errBars, this.cat, this.val, this.smooth, this.extLst);
  }

  public CT_LineSerBuilder from(CT_LineSerModel value) {
    this.idx = value.getIdx();
    this.order = value.getOrder();
    this.tx = value.getTx();
    this.spPr = value.getSpPr();
    this.marker = value.getMarker();
    this.dPt = value.getDPt();
    this.dLbls = value.getDLbls();
    this.trendline = value.getTrendline();
    this.errBars = value.getErrBars();
    this.cat = value.getCat();
    this.val = value.getVal();
    this.smooth = value.getSmooth();
    this.extLst = value.getExtLst();
    return this;
  }
}
