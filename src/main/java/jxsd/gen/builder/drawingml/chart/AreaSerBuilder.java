package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.AreaSerModel;
import jxsd.gen.model.drawingml.chart.AxDataSourceModel;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import jxsd.gen.model.drawingml.chart.DPtModel;
import jxsd.gen.model.drawingml.chart.ErrBarsModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.NumDataSourceModel;
import jxsd.gen.model.drawingml.chart.PictureOptionsModel;
import jxsd.gen.model.drawingml.chart.SerTxModel;
import jxsd.gen.model.drawingml.chart.TrendlineModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class AreaSerBuilder {
  private UnsignedIntModel idx;

  private UnsignedIntModel order;

  private SerTxModel tx;

  private ShapePropertiesModel spPr;

  private PictureOptionsModel pictureOptions;

  private List<DPtModel> dPt;

  private DLblsModel dLbls;

  private List<TrendlineModel> trendline;

  private List<ErrBarsModel> errBars;

  private AxDataSourceModel cat;

  private NumDataSourceModel val;

  private ExtensionListModel extLst;

  public AreaSerBuilder() {
  }

  public AreaSerBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public AreaSerBuilder setOrder(UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public AreaSerBuilder setTx(SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public AreaSerBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public AreaSerBuilder setPictureOptions(PictureOptionsModel pictureOptions) {
    this.pictureOptions = pictureOptions;
    return this;
  }

  public AreaSerBuilder setDPt(List<DPtModel> dPt) {
    this.dPt = dPt;
    return this;
  }

  public AreaSerBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public AreaSerBuilder setTrendline(List<TrendlineModel> trendline) {
    this.trendline = trendline;
    return this;
  }

  public AreaSerBuilder setErrBars(List<ErrBarsModel> errBars) {
    this.errBars = errBars;
    return this;
  }

  public AreaSerBuilder setCat(AxDataSourceModel cat) {
    this.cat = cat;
    return this;
  }

  public AreaSerBuilder setVal(NumDataSourceModel val) {
    this.val = val;
    return this;
  }

  public AreaSerBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public AreaSerBuilder from(AreaSerModel value) {
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

  public AreaSerModel build() {
    return new AreaSerModel(this.idx, this.order, this.tx, this.spPr, this.pictureOptions, this.dPt, this.dLbls, this.trendline, this.errBars, this.cat, this.val, this.extLst);
  }
}
