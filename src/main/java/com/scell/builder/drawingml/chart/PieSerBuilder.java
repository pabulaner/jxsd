package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.AxDataSourceModel;
import com.scell.model.drawingml.chart.DLblsModel;
import com.scell.model.drawingml.chart.DPtModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.NumDataSourceModel;
import com.scell.model.drawingml.chart.PieSerModel;
import com.scell.model.drawingml.chart.SerTxModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import java.util.List;

public class PieSerBuilder implements ISeriesValueBuilder {
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

  public PieSerModel build() {
    return new PieSerModel(this.idx, this.order, this.tx, this.spPr, this.explosion, this.dPt, this.dLbls, this.cat, this.val, this.extLst);
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
}
