package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.AxDataSourceModel;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import jxsd.gen.model.drawingml.chart.DPtModel;
import jxsd.gen.model.drawingml.chart.ErrBarsModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.MarkerModel;
import jxsd.gen.model.drawingml.chart.NumDataSourceModel;
import jxsd.gen.model.drawingml.chart.ScatterSerModel;
import jxsd.gen.model.drawingml.chart.SerTxModel;
import jxsd.gen.model.drawingml.chart.TrendlineModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class ScatterSerBuilder {
  private UnsignedIntModel idx;

  private UnsignedIntModel order;

  private SerTxModel tx;

  private ShapePropertiesModel spPr;

  private MarkerModel marker;

  private List<DPtModel> dPt;

  private DLblsModel dLbls;

  private List<TrendlineModel> trendline;

  private List<ErrBarsModel> errBars;

  private AxDataSourceModel xVal;

  private NumDataSourceModel yVal;

  private BooleanModel smooth;

  private ExtensionListModel extLst;

  public ScatterSerBuilder() {
  }

  public ScatterSerBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public ScatterSerBuilder setOrder(UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public ScatterSerBuilder setTx(SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public ScatterSerBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public ScatterSerBuilder setMarker(MarkerModel marker) {
    this.marker = marker;
    return this;
  }

  public ScatterSerBuilder setDPt(List<DPtModel> dPt) {
    this.dPt = dPt;
    return this;
  }

  public ScatterSerBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public ScatterSerBuilder setTrendline(List<TrendlineModel> trendline) {
    this.trendline = trendline;
    return this;
  }

  public ScatterSerBuilder setErrBars(List<ErrBarsModel> errBars) {
    this.errBars = errBars;
    return this;
  }

  public ScatterSerBuilder setXVal(AxDataSourceModel xVal) {
    this.xVal = xVal;
    return this;
  }

  public ScatterSerBuilder setYVal(NumDataSourceModel yVal) {
    this.yVal = yVal;
    return this;
  }

  public ScatterSerBuilder setSmooth(BooleanModel smooth) {
    this.smooth = smooth;
    return this;
  }

  public ScatterSerBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ScatterSerBuilder from(ScatterSerModel value) {
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

  public ScatterSerModel build() {
    return new ScatterSerModel(this.idx, this.order, this.tx, this.spPr, this.marker, this.dPt, this.dLbls, this.trendline, this.errBars, this.xVal, this.yVal, this.smooth, this.extLst);
  }
}
