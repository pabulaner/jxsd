package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DLblModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_MarkerModel;
import com.scell.model.drawingml.chart.CT_PivotFmtModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;

public class CT_PivotFmtBuilder {
  private CT_UnsignedIntModel idx;

  private CT_ShapePropertiesModel spPr;

  private CT_TextBodyModel txPr;

  private CT_MarkerModel marker;

  private CT_DLblModel dLbl;

  private CT_ExtensionListModel extLst;

  public CT_PivotFmtBuilder() {
  }

  public CT_PivotFmtBuilder setIdx(CT_UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_PivotFmtBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_PivotFmtBuilder setTxPr(CT_TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public CT_PivotFmtBuilder setMarker(CT_MarkerModel marker) {
    this.marker = marker;
    return this;
  }

  public CT_PivotFmtBuilder setDLbl(CT_DLblModel dLbl) {
    this.dLbl = dLbl;
    return this;
  }

  public CT_PivotFmtBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_PivotFmtModel build() {
    return new CT_PivotFmtModel(this.idx, this.spPr, this.txPr, this.marker, this.dLbl, this.extLst);
  }

  public CT_PivotFmtBuilder from(CT_PivotFmtModel value) {
    this.idx = value.getIdx();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    this.marker = value.getMarker();
    this.dLbl = value.getDLbl();
    this.extLst = value.getExtLst();
    return this;
  }
}
