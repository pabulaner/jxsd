package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.SurfaceSerBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
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

  public SurfaceSerBuilder builder() {
    return new SurfaceSerBuilder().from(this);
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
