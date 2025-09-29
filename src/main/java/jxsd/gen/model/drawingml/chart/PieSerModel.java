package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.PieSerBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class PieSerModel {
  private final UnsignedIntModel idx;

  private final UnsignedIntModel order;

  private final SerTxModel tx;

  private final ShapePropertiesModel spPr;

  private final UnsignedIntModel explosion;

  private final List<DPtModel> dPt;

  private final DLblsModel dLbls;

  private final AxDataSourceModel cat;

  private final NumDataSourceModel val;

  private final ExtensionListModel extLst;

  public PieSerModel(UnsignedIntModel idx, UnsignedIntModel order, SerTxModel tx,
      ShapePropertiesModel spPr, UnsignedIntModel explosion, List<DPtModel> dPt, DLblsModel dLbls,
      AxDataSourceModel cat, NumDataSourceModel val, ExtensionListModel extLst) {
    this.idx = idx;
    this.order = order;
    this.tx = tx;
    this.spPr = spPr;
    this.explosion = explosion;
    this.dPt = dPt;
    this.dLbls = dLbls;
    this.cat = cat;
    this.val = val;
    this.extLst = extLst;
  }

  public PieSerBuilder builder() {
    return new PieSerBuilder().from(this);
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

  public UnsignedIntModel getExplosion() {
    return this.explosion;
  }

  public List<DPtModel> getDPt() {
    return this.dPt;
  }

  public DLblsModel getDLbls() {
    return this.dLbls;
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
