package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.AxDataSourceModel;
import jxsd.gen.model.drawingml.chart.DLblsModel;
import jxsd.gen.model.drawingml.chart.DPtModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.NumDataSourceModel;
import jxsd.gen.model.drawingml.chart.PieSerModel;
import jxsd.gen.model.drawingml.chart.SerTxModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class PieSerBuilder {
  private UnsignedIntModel idx;

  private UnsignedIntModel order;

  private SerTxModel tx;

  private ShapePropertiesModel spPr;

  private UnsignedIntModel explosion;

  private List<DPtModel> dPt;

  private DLblsModel dLbls;

  private AxDataSourceModel cat;

  private NumDataSourceModel val;

  private ExtensionListModel extLst;

  public PieSerBuilder() {
  }

  public PieSerBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public PieSerBuilder setOrder(UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public PieSerBuilder setTx(SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public PieSerBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public PieSerBuilder setExplosion(UnsignedIntModel explosion) {
    this.explosion = explosion;
    return this;
  }

  public PieSerBuilder setDPt(List<DPtModel> dPt) {
    this.dPt = dPt;
    return this;
  }

  public PieSerBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public PieSerBuilder setCat(AxDataSourceModel cat) {
    this.cat = cat;
    return this;
  }

  public PieSerBuilder setVal(NumDataSourceModel val) {
    this.val = val;
    return this;
  }

  public PieSerBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public PieSerBuilder from(PieSerModel value) {
    this.idx = value.getIdx();
    this.order = value.getOrder();
    this.tx = value.getTx();
    this.spPr = value.getSpPr();
    this.explosion = value.getExplosion();
    this.dPt = value.getDPt();
    this.dLbls = value.getDLbls();
    this.cat = value.getCat();
    this.val = value.getVal();
    this.extLst = value.getExtLst();
    return this;
  }

  public PieSerModel build() {
    return new PieSerModel(this.idx, this.order, this.tx, this.spPr, this.explosion, this.dPt, this.dLbls, this.cat, this.val, this.extLst);
  }
}
