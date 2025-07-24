package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;

public class SurfaceSerModel {
  private final UnsignedIntModel idx;

  private final UnsignedIntModel order;

  private final SerTxModel tx;

  private final ShapePropertiesModel spPr;

  private final AxDataSourceModel cat;

  private final NumDataSourceModel val;

  private final ExtensionListModel extLst;

  public SurfaceSerModel(UnsignedIntModel idx, UnsignedIntModel order, SerTxModel tx,
      ShapePropertiesModel spPr, AxDataSourceModel cat, NumDataSourceModel val,
      ExtensionListModel extLst) {
    this.idx = idx;
    this.order = order;
    this.tx = tx;
    this.spPr = spPr;
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
