package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AreaSerModel;
import com.scell.model.drawingml.chart.CT_AxDataSourceModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_DPtModel;
import com.scell.model.drawingml.chart.CT_ErrBarsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_NumDataSourceModel;
import com.scell.model.drawingml.chart.CT_PictureOptionsModel;
import com.scell.model.drawingml.chart.CT_SerTxModel;
import com.scell.model.drawingml.chart.CT_TrendlineModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import java.util.List;

public class CT_AreaSerBuilder {
  private CT_UnsignedIntModel idx;

  private CT_UnsignedIntModel order;

  private CT_SerTxModel tx;

  private CT_ShapePropertiesModel spPr;

  private CT_PictureOptionsModel pictureOptions;

  private List<CT_DPtModel> dPt;

  private CT_DLblsModel dLbls;

  private List<CT_TrendlineModel> trendline;

  private List<CT_ErrBarsModel> errBars;

  private CT_AxDataSourceModel cat;

  private CT_NumDataSourceModel val;

  private CT_ExtensionListModel extLst;

  public CT_AreaSerBuilder() {
  }

  public CT_AreaSerBuilder setIdx(CT_UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_AreaSerBuilder setOrder(CT_UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public CT_AreaSerBuilder setTx(CT_SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public CT_AreaSerBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_AreaSerBuilder setPictureOptions(CT_PictureOptionsModel pictureOptions) {
    this.pictureOptions = pictureOptions;
    return this;
  }

  public CT_AreaSerBuilder setDPt(List<CT_DPtModel> dPt) {
    this.dPt = dPt;
    return this;
  }

  public CT_AreaSerBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_AreaSerBuilder setTrendline(List<CT_TrendlineModel> trendline) {
    this.trendline = trendline;
    return this;
  }

  public CT_AreaSerBuilder setErrBars(List<CT_ErrBarsModel> errBars) {
    this.errBars = errBars;
    return this;
  }

  public CT_AreaSerBuilder setCat(CT_AxDataSourceModel cat) {
    this.cat = cat;
    return this;
  }

  public CT_AreaSerBuilder setVal(CT_NumDataSourceModel val) {
    this.val = val;
    return this;
  }

  public CT_AreaSerBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_AreaSerModel build() {
    return new CT_AreaSerModel(this.idx, this.order, this.tx, this.spPr, this.pictureOptions, this.dPt, this.dLbls, this.trendline, this.errBars, this.cat, this.val, this.extLst);
  }

  public CT_AreaSerBuilder from(CT_AreaSerModel value) {
    this.idx = value.getIdx();
    this.order = value.getOrder();
    this.tx = value.getTx();
    this.spPr = value.getSpPr();
    this.pictureOptions = value.getPictureOptions();
    this.dPt = value.getDPt();
    this.dLbls = value.getDLbls();
    this.trendline = value.getTrendline();
    this.errBars = value.getErrBars();
    this.cat = value.getCat();
    this.val = value.getVal();
    this.extLst = value.getExtLst();
    return this;
  }
}
