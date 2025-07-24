package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.AxDataSourceModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.NumDataSourceModel;
import com.scell.model.drawingml.chart.SerTxModel;
import com.scell.model.drawingml.chart.SurfaceSerModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;

public class SurfaceSerBuilder {
  private UnsignedIntModel idx;

  private UnsignedIntModel order;

  private SerTxModel tx;

  private ShapePropertiesModel spPr;

  private AxDataSourceModel cat;

  private NumDataSourceModel val;

  private ExtensionListModel extLst;

  public SurfaceSerBuilder() {
  }

  public SurfaceSerBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public SurfaceSerBuilder setOrder(UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public SurfaceSerBuilder setTx(SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public SurfaceSerBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public SurfaceSerBuilder setCat(AxDataSourceModel cat) {
    this.cat = cat;
    return this;
  }

  public SurfaceSerBuilder setVal(NumDataSourceModel val) {
    this.val = val;
    return this;
  }

  public SurfaceSerBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public SurfaceSerModel build() {
    return new SurfaceSerModel(this.idx, this.order, this.tx, this.spPr, this.cat, this.val, this.extLst);
  }

  public SurfaceSerBuilder from(SurfaceSerModel value) {
    this.idx = value.getIdx();
    this.order = value.getOrder();
    this.tx = value.getTx();
    this.spPr = value.getSpPr();
    this.cat = value.getCat();
    this.val = value.getVal();
    this.extLst = value.getExtLst();
    return this;
  }
}
