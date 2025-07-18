package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxDataSourceModel;
import com.scell.model.drawingml.chart.CT_BarSerModel;
import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_DPtModel;
import com.scell.model.drawingml.chart.CT_ErrBarsModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_NumDataSourceModel;
import com.scell.model.drawingml.chart.CT_PictureOptionsModel;
import com.scell.model.drawingml.chart.CT_SerTxModel;
import com.scell.model.drawingml.chart.CT_ShapeModel;
import com.scell.model.drawingml.chart.CT_TrendlineModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import java.util.List;

public class CT_BarSerBuilder {
  private CT_UnsignedIntModel idx;

  private CT_UnsignedIntModel order;

  private CT_SerTxModel tx;

  private CT_ShapePropertiesModel spPr;

  private CT_BooleanModel invertIfNegative;

  private CT_PictureOptionsModel pictureOptions;

  private List<CT_DPtModel> dPt;

  private CT_DLblsModel dLbls;

  private List<CT_TrendlineModel> trendline;

  private CT_ErrBarsModel errBars;

  private CT_AxDataSourceModel cat;

  private CT_NumDataSourceModel val;

  private CT_ShapeModel shape;

  private CT_ExtensionListModel extLst;

  public CT_BarSerBuilder() {
  }

  public CT_BarSerBuilder setIdx(CT_UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_BarSerBuilder setOrder(CT_UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public CT_BarSerBuilder setTx(CT_SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public CT_BarSerBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_BarSerBuilder setInvertIfNegative(CT_BooleanModel invertIfNegative) {
    this.invertIfNegative = invertIfNegative;
    return this;
  }

  public CT_BarSerBuilder setPictureOptions(CT_PictureOptionsModel pictureOptions) {
    this.pictureOptions = pictureOptions;
    return this;
  }

  public CT_BarSerBuilder setDPt(List<CT_DPtModel> dPt) {
    this.dPt = dPt;
    return this;
  }

  public CT_BarSerBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_BarSerBuilder setTrendline(List<CT_TrendlineModel> trendline) {
    this.trendline = trendline;
    return this;
  }

  public CT_BarSerBuilder setErrBars(CT_ErrBarsModel errBars) {
    this.errBars = errBars;
    return this;
  }

  public CT_BarSerBuilder setCat(CT_AxDataSourceModel cat) {
    this.cat = cat;
    return this;
  }

  public CT_BarSerBuilder setVal(CT_NumDataSourceModel val) {
    this.val = val;
    return this;
  }

  public CT_BarSerBuilder setShape(CT_ShapeModel shape) {
    this.shape = shape;
    return this;
  }

  public CT_BarSerBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_BarSerModel build() {
    return new CT_BarSerModel(this.idx, this.order, this.tx, this.spPr, this.invertIfNegative, this.pictureOptions, this.dPt, this.dLbls, this.trendline, this.errBars, this.cat, this.val, this.shape, this.extLst);
  }

  public CT_BarSerBuilder from(CT_BarSerModel value) {
    this.idx = value.getIdx();
    this.order = value.getOrder();
    this.tx = value.getTx();
    this.spPr = value.getSpPr();
    this.invertIfNegative = value.getInvertIfNegative();
    this.pictureOptions = value.getPictureOptions();
    this.dPt = value.getDPt();
    this.dLbls = value.getDLbls();
    this.trendline = value.getTrendline();
    this.errBars = value.getErrBars();
    this.cat = value.getCat();
    this.val = value.getVal();
    this.shape = value.getShape();
    this.extLst = value.getExtLst();
    return this;
  }
}
