package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxDataSourceModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_NumDataSourceModel;
import com.scell.model.drawingml.chart.CT_SerTxModel;
import com.scell.model.drawingml.chart.CT_SurfaceSerModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;

public class CT_SurfaceSerBuilder {
  private CT_UnsignedIntModel idx;

  private CT_UnsignedIntModel order;

  private CT_SerTxModel tx;

  private CT_ShapePropertiesModel spPr;

  private CT_AxDataSourceModel cat;

  private CT_NumDataSourceModel val;

  private CT_ExtensionListModel extLst;

  public CT_SurfaceSerBuilder() {
  }

  public CT_SurfaceSerBuilder setIdx(CT_UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_SurfaceSerBuilder setOrder(CT_UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public CT_SurfaceSerBuilder setTx(CT_SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public CT_SurfaceSerBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_SurfaceSerBuilder setCat(CT_AxDataSourceModel cat) {
    this.cat = cat;
    return this;
  }

  public CT_SurfaceSerBuilder setVal(CT_NumDataSourceModel val) {
    this.val = val;
    return this;
  }

  public CT_SurfaceSerBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_SurfaceSerModel build() {
    return new CT_SurfaceSerModel(this.idx, this.order, this.tx, this.spPr, this.cat, this.val, this.extLst);
  }

  public CT_SurfaceSerBuilder from(CT_SurfaceSerModel value) {
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
