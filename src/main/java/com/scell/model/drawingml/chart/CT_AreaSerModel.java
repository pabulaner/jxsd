package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import java.util.List;

public class CT_AreaSerModel {
  private final CT_UnsignedIntModel idx;

  private final CT_UnsignedIntModel order;

  private final CT_SerTxModel tx;

  private final CT_ShapePropertiesModel spPr;

  private final CT_PictureOptionsModel pictureOptions;

  private final List<CT_DPtModel> dPt;

  private final CT_DLblsModel dLbls;

  private final List<CT_TrendlineModel> trendline;

  private final List<CT_ErrBarsModel> errBars;

  private final CT_AxDataSourceModel cat;

  private final CT_NumDataSourceModel val;

  private final CT_ExtensionListModel extLst;

  public CT_AreaSerModel(CT_UnsignedIntModel idx, CT_UnsignedIntModel order, CT_SerTxModel tx,
      CT_ShapePropertiesModel spPr, CT_PictureOptionsModel pictureOptions, List<CT_DPtModel> dPt,
      CT_DLblsModel dLbls, List<CT_TrendlineModel> trendline, List<CT_ErrBarsModel> errBars,
      CT_AxDataSourceModel cat, CT_NumDataSourceModel val, CT_ExtensionListModel extLst) {
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

  public CT_PictureOptionsModel getPictureOptions() {
    return this.pictureOptions;
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

  public CT_AxDataSourceModel getCat() {
    return this.cat;
  }

  public CT_NumDataSourceModel getVal() {
    return this.val;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
