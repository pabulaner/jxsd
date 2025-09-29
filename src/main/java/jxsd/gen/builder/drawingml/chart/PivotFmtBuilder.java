package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.DLblModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.MarkerModel;
import jxsd.gen.model.drawingml.chart.PivotFmtModel;
import jxsd.gen.model.drawingml.chart.UnsignedIntModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class PivotFmtBuilder {
  private UnsignedIntModel idx;

  private ShapePropertiesModel spPr;

  private TextBodyModel txPr;

  private MarkerModel marker;

  private DLblModel dLbl;

  private ExtensionListModel extLst;

  public PivotFmtBuilder() {
  }

  public PivotFmtBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public PivotFmtBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public PivotFmtBuilder setTxPr(TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public PivotFmtBuilder setMarker(MarkerModel marker) {
    this.marker = marker;
    return this;
  }

  public PivotFmtBuilder setDLbl(DLblModel dLbl) {
    this.dLbl = dLbl;
    return this;
  }

  public PivotFmtBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public PivotFmtBuilder from(PivotFmtModel value) {
    this.idx = value.getIdx();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    this.marker = value.getMarker();
    this.dLbl = value.getDLbl();
    this.extLst = value.getExtLst();
    return this;
  }

  public PivotFmtModel build() {
    return new PivotFmtModel(this.idx, this.spPr, this.txPr, this.marker, this.dLbl, this.extLst);
  }
}
