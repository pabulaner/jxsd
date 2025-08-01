package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;
import java.util.List;

public class AreaSerModel implements ISeriesValueModel, IPictureOptionsComponentValueModel {
  private final UnsignedIntModel idx;

  private final UnsignedIntModel order;

  private final SerTxModel tx;

  private final ShapePropertiesModel spPr;

  private final PictureOptionsModel pictureOptions;

  private final List<DPtModel> dPt;

  private final DLblsModel dLbls;

  private final List<TrendlineModel> trendline;

  private final List<ErrBarsModel> errBars;

  private final AxDataSourceModel cat;

  private final NumDataSourceModel val;

  private final ExtensionListModel extLst;

  public AreaSerModel(UnsignedIntModel idx, UnsignedIntModel order, SerTxModel tx,
      ShapePropertiesModel spPr, PictureOptionsModel pictureOptions, List<DPtModel> dPt,
      DLblsModel dLbls, List<TrendlineModel> trendline, List<ErrBarsModel> errBars,
      AxDataSourceModel cat, NumDataSourceModel val, ExtensionListModel extLst) {
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

  public PictureOptionsModel getPictureOptions() {
    return this.pictureOptions;
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

  public List<ErrBarsModel> getErrBars() {
    return this.errBars;
  }

  public AxDataSourceModel getCat() {
    return this.cat;
  }

  public NumDataSourceModel getVal() {
    return this.val;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
