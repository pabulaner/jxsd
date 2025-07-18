package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import java.util.List;

public class CT_BubbleSerModel {
  private final CT_UnsignedIntModel idx;

  private final CT_UnsignedIntModel order;

  private final CT_SerTxModel tx;

  private final CT_ShapePropertiesModel spPr;

  private final CT_BooleanModel invertIfNegative;

  private final List<CT_DPtModel> dPt;

  private final CT_DLblsModel dLbls;

  private final List<CT_TrendlineModel> trendline;

  private final List<CT_ErrBarsModel> errBars;

  private final CT_AxDataSourceModel xVal;

  private final CT_NumDataSourceModel yVal;

  private final CT_NumDataSourceModel bubbleSize;

  private final CT_BooleanModel bubble3D;

  private final CT_ExtensionListModel extLst;

  public CT_BubbleSerModel(CT_UnsignedIntModel idx, CT_UnsignedIntModel order, CT_SerTxModel tx,
      CT_ShapePropertiesModel spPr, CT_BooleanModel invertIfNegative, List<CT_DPtModel> dPt,
      CT_DLblsModel dLbls, List<CT_TrendlineModel> trendline, List<CT_ErrBarsModel> errBars,
      CT_AxDataSourceModel xVal, CT_NumDataSourceModel yVal, CT_NumDataSourceModel bubbleSize,
      CT_BooleanModel bubble3D, CT_ExtensionListModel extLst) {
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

  public CT_BooleanModel getInvertIfNegative() {
    return this.invertIfNegative;
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

  public List<CT_ErrBarsModel> getErrBars() {
    return this.errBars;
  }

  public CT_AxDataSourceModel getXVal() {
    return this.xVal;
  }

  public CT_NumDataSourceModel getYVal() {
    return this.yVal;
  }

  public CT_NumDataSourceModel getBubbleSize() {
    return this.bubbleSize;
  }

  public CT_BooleanModel getBubble3D() {
    return this.bubble3D;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
