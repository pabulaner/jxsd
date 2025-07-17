package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxDataSourceModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_BubbleSerModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_DPtModel;
import com.scell.model.drawingml.chart.CT_ErrBarsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_NumDataSourceModel;
import com.scell.model.drawingml.chart.CT_SerTxModel;
import com.scell.model.drawingml.chart.CT_TrendlineModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import java.util.List;

public class CT_BubbleSerBuilder {
  private CT_UnsignedIntModel idx;

  private CT_UnsignedIntModel order;

  private CT_SerTxModel tx;

  private CT_ShapePropertiesModel spPr;

  private CT_BooleanModel invertIfNegative;

  private List<CT_DPtModel> dPt;

  private CT_DLblsModel dLbls;

  private List<CT_TrendlineModel> trendline;

  private List<CT_ErrBarsModel> errBars;

  private CT_AxDataSourceModel xVal;

  private CT_NumDataSourceModel yVal;

  private CT_NumDataSourceModel bubbleSize;

  private CT_BooleanModel bubble3D;

  private CT_ExtensionListModel extLst;

  public CT_BubbleSerBuilder() {
  }

  public CT_BubbleSerBuilder setIdx(CT_UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_BubbleSerBuilder setOrder(CT_UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public CT_BubbleSerBuilder setTx(CT_SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public CT_BubbleSerBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_BubbleSerBuilder setInvertIfNegative(CT_BooleanModel invertIfNegative) {
    this.invertIfNegative = invertIfNegative;
    return this;
  }

  public CT_BubbleSerBuilder setDPt(List<CT_DPtModel> dPt) {
    this.dPt = dPt;
    return this;
  }

  public CT_BubbleSerBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_BubbleSerBuilder setTrendline(List<CT_TrendlineModel> trendline) {
    this.trendline = trendline;
    return this;
  }

  public CT_BubbleSerBuilder setErrBars(List<CT_ErrBarsModel> errBars) {
    this.errBars = errBars;
    return this;
  }

  public CT_BubbleSerBuilder setXVal(CT_AxDataSourceModel xVal) {
    this.xVal = xVal;
    return this;
  }

  public CT_BubbleSerBuilder setYVal(CT_NumDataSourceModel yVal) {
    this.yVal = yVal;
    return this;
  }

  public CT_BubbleSerBuilder setBubbleSize(CT_NumDataSourceModel bubbleSize) {
    this.bubbleSize = bubbleSize;
    return this;
  }

  public CT_BubbleSerBuilder setBubble3D(CT_BooleanModel bubble3D) {
    this.bubble3D = bubble3D;
    return this;
  }

  public CT_BubbleSerBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_BubbleSerModel build() {
    return new CT_BubbleSerModel(this.idx, this.order, this.tx, this.spPr, this.invertIfNegative, this.dPt, this.dLbls, this.trendline, this.errBars, this.xVal, this.yVal, this.bubbleSize, this.bubble3D, this.extLst);
  }

  public CT_BubbleSerBuilder from(CT_BubbleSerModel value) {
    this.idx = value.getIdx();
    this.order = value.getOrder();
    this.tx = value.getTx();
    this.spPr = value.getSpPr();
    this.invertIfNegative = value.getInvertIfNegative();
    this.dPt = value.getDPt();
    this.dLbls = value.getDLbls();
    this.trendline = value.getTrendline();
    this.errBars = value.getErrBars();
    this.xVal = value.getXVal();
    this.yVal = value.getYVal();
    this.bubbleSize = value.getBubbleSize();
    this.bubble3D = value.getBubble3D();
    this.extLst = value.getExtLst();
    return this;
  }
}
