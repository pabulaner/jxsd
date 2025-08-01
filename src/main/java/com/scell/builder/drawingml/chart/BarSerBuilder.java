package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.AxDataSourceModel;
import com.scell.model.drawingml.chart.BarSerModel;
import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.DLblsModel;
import com.scell.model.drawingml.chart.DPtModel;
import com.scell.model.drawingml.chart.ErrBarsModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.NumDataSourceModel;
import com.scell.model.drawingml.chart.PictureOptionsModel;
import com.scell.model.drawingml.chart.SerTxModel;
import com.scell.model.drawingml.chart.ShapeModel;
import com.scell.model.drawingml.chart.TrendlineModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import java.util.List;

public class BarSerBuilder implements ISeriesValueBuilder, IInvertIfNegativeComponentValueBuilder, IPictureOptionsComponentValueBuilder {
  private UnsignedIntModel idx;

  private UnsignedIntModel order;

  private SerTxModel tx;

  private ShapePropertiesModel spPr;

  private BooleanModel invertIfNegative;

  private PictureOptionsModel pictureOptions;

  private List<DPtModel> dPt;

  private DLblsModel dLbls;

  private List<TrendlineModel> trendline;

  private ErrBarsModel errBars;

  private AxDataSourceModel cat;

  private NumDataSourceModel val;

  private ShapeModel shape;

  private ExtensionListModel extLst;

  public BarSerBuilder() {
  }

  public BarSerBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public BarSerBuilder setOrder(UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public BarSerBuilder setTx(SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public BarSerBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public BarSerBuilder setInvertIfNegative(BooleanModel invertIfNegative) {
    this.invertIfNegative = invertIfNegative;
    return this;
  }

  public BarSerBuilder setPictureOptions(PictureOptionsModel pictureOptions) {
    this.pictureOptions = pictureOptions;
    return this;
  }

  public BarSerBuilder setDPt(List<DPtModel> dPt) {
    this.dPt = dPt;
    return this;
  }

  public BarSerBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public BarSerBuilder setTrendline(List<TrendlineModel> trendline) {
    this.trendline = trendline;
    return this;
  }

  public BarSerBuilder setErrBars(ErrBarsModel errBars) {
    this.errBars = errBars;
    return this;
  }

  public BarSerBuilder setCat(AxDataSourceModel cat) {
    this.cat = cat;
    return this;
  }

  public BarSerBuilder setVal(NumDataSourceModel val) {
    this.val = val;
    return this;
  }

  public BarSerBuilder setShape(ShapeModel shape) {
    this.shape = shape;
    return this;
  }

  public BarSerBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public BarSerModel build() {
    return new BarSerModel(this.idx, this.order, this.tx, this.spPr, this.invertIfNegative, this.pictureOptions, this.dPt, this.dLbls, this.trendline, this.errBars, this.cat, this.val, this.shape, this.extLst);
  }

  public BarSerBuilder from(BarSerModel value) {
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
