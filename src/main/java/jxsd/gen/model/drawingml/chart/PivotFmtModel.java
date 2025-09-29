package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.PivotFmtBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class PivotFmtModel {
  private final UnsignedIntModel idx;

  private final ShapePropertiesModel spPr;

  private final TextBodyModel txPr;

  private final MarkerModel marker;

  private final DLblModel dLbl;

  private final ExtensionListModel extLst;

  public PivotFmtModel(UnsignedIntModel idx, ShapePropertiesModel spPr, TextBodyModel txPr,
      MarkerModel marker, DLblModel dLbl, ExtensionListModel extLst) {
    this.idx = idx;
    this.spPr = spPr;
    this.txPr = txPr;
    this.marker = marker;
    this.dLbl = dLbl;
    this.extLst = extLst;
  }

  public PivotFmtBuilder builder() {
    return new PivotFmtBuilder().from(this);
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public TextBodyModel getTxPr() {
    return this.txPr;
  }

  public MarkerModel getMarker() {
    return this.marker;
  }

  public DLblModel getDLbl() {
    return this.dLbl;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
