package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.DLblModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.MarkerModel;
import com.scell.model.drawingml.chart.PivotFmtModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;

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

  public PivotFmtModel build() {
    return new PivotFmtModel(this.idx, this.spPr, this.txPr, this.marker, this.dLbl, this.extLst);
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
}
