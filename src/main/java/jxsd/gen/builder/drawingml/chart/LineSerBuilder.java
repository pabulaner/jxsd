package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.AxDataSourceModel;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import jxsd.gen.model.drawingml.chart.DPtModel;
import jxsd.gen.model.drawingml.chart.ErrBarsModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.LineSerModel;
import jxsd.gen.model.drawingml.chart.MarkerModel;
import jxsd.gen.model.drawingml.chart.NumDataSourceModel;
import jxsd.gen.model.drawingml.chart.SerTxModel;
import jxsd.gen.model.drawingml.chart.TrendlineModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class LineSerBuilder {
  private UnsignedIntModel idx;

  private UnsignedIntModel order;

  private SerTxModel tx;

  private ShapePropertiesModel spPr;

  private MarkerModel marker;

  private List<DPtModel> dPt;

  private DLblsModel dLbls;

  private List<TrendlineModel> trendline;

  private ErrBarsModel errBars;

  private AxDataSourceModel cat;

  private NumDataSourceModel val;

  private BooleanModel smooth;

  private ExtensionListModel extLst;

  public LineSerBuilder() {
  }

  public LineSerBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public LineSerBuilder setOrder(UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public LineSerBuilder setTx(SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public LineSerBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public LineSerBuilder setMarker(MarkerModel marker) {
    this.marker = marker;
    return this;
  }

  public LineSerBuilder setDPt(List<DPtModel> dPt) {
    this.dPt = dPt;
    return this;
  }

  public LineSerBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public LineSerBuilder setTrendline(List<TrendlineModel> trendline) {
    this.trendline = trendline;
    return this;
  }

  public LineSerBuilder setErrBars(ErrBarsModel errBars) {
    this.errBars = errBars;
    return this;
  }

  public LineSerBuilder setCat(AxDataSourceModel cat) {
    this.cat = cat;
    return this;
  }

  public LineSerBuilder setVal(NumDataSourceModel val) {
    this.val = val;
    return this;
  }

  public LineSerBuilder setSmooth(BooleanModel smooth) {
    this.smooth = smooth;
    return this;
  }

  public LineSerBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public LineSerBuilder from(LineSerModel value) {
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

  public LineSerModel build() {
    return new LineSerModel(this.idx, this.order, this.tx, this.spPr, this.marker, this.dPt, this.dLbls, this.trendline, this.errBars, this.cat, this.val, this.smooth, this.extLst);
  }
}
