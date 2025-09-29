package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.AxDataSourceModel;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.BubbleSerModel;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import jxsd.gen.model.drawingml.chart.DPtModel;
import jxsd.gen.model.drawingml.chart.ErrBarsModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.NumDataSourceModel;
import jxsd.gen.model.drawingml.chart.SerTxModel;
import jxsd.gen.model.drawingml.chart.TrendlineModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class BubbleSerBuilder {
  private UnsignedIntModel idx;

  private UnsignedIntModel order;

  private SerTxModel tx;

  private ShapePropertiesModel spPr;

  private BooleanModel invertIfNegative;

  private List<DPtModel> dPt;

  private DLblsModel dLbls;

  private List<TrendlineModel> trendline;

  private List<ErrBarsModel> errBars;

  private AxDataSourceModel xVal;

  private NumDataSourceModel yVal;

  private NumDataSourceModel bubbleSize;

  private BooleanModel bubble3D;

  private ExtensionListModel extLst;

  public BubbleSerBuilder() {
  }

  public BubbleSerBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public BubbleSerBuilder setOrder(UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public BubbleSerBuilder setTx(SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public BubbleSerBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public BubbleSerBuilder setInvertIfNegative(BooleanModel invertIfNegative) {
    this.invertIfNegative = invertIfNegative;
    return this;
  }

  public BubbleSerBuilder setDPt(List<DPtModel> dPt) {
    this.dPt = dPt;
    return this;
  }

  public BubbleSerBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public BubbleSerBuilder setTrendline(List<TrendlineModel> trendline) {
    this.trendline = trendline;
    return this;
  }

  public BubbleSerBuilder setErrBars(List<ErrBarsModel> errBars) {
    this.errBars = errBars;
    return this;
  }

  public BubbleSerBuilder setXVal(AxDataSourceModel xVal) {
    this.xVal = xVal;
    return this;
  }

  public BubbleSerBuilder setYVal(NumDataSourceModel yVal) {
    this.yVal = yVal;
    return this;
  }

  public BubbleSerBuilder setBubbleSize(NumDataSourceModel bubbleSize) {
    this.bubbleSize = bubbleSize;
    return this;
  }

  public BubbleSerBuilder setBubble3D(BooleanModel bubble3D) {
    this.bubble3D = bubble3D;
    return this;
  }

  public BubbleSerBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public BubbleSerBuilder from(BubbleSerModel value) {
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

  public BubbleSerModel build() {
    return new BubbleSerModel(this.idx, this.order, this.tx, this.spPr, this.invertIfNegative, this.dPt, this.dLbls, this.trendline, this.errBars, this.xVal, this.yVal, this.bubbleSize, this.bubble3D, this.extLst);
  }
}
