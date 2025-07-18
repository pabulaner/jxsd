package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AxDataSourceModel;
import com.scell.model.drawingml.chart.CT_DLblsModel;
import com.scell.model.drawingml.chart.CT_DPtModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_MarkerModel;
import com.scell.model.drawingml.chart.CT_NumDataSourceModel;
import com.scell.model.drawingml.chart.CT_RadarSerModel;
import com.scell.model.drawingml.chart.CT_SerTxModel;
import com.scell.model.drawingml.chart.CT_UnsignedIntModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import java.util.List;

public class CT_RadarSerBuilder {
  private CT_UnsignedIntModel idx;

  private CT_UnsignedIntModel order;

  private CT_SerTxModel tx;

  private CT_ShapePropertiesModel spPr;

  private CT_MarkerModel marker;

  private List<CT_DPtModel> dPt;

  private CT_DLblsModel dLbls;

  private CT_AxDataSourceModel cat;

  private CT_NumDataSourceModel val;

  private CT_ExtensionListModel extLst;

  public CT_RadarSerBuilder() {
  }

  public CT_RadarSerBuilder setIdx(CT_UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public CT_RadarSerBuilder setOrder(CT_UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public CT_RadarSerBuilder setTx(CT_SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public CT_RadarSerBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_RadarSerBuilder setMarker(CT_MarkerModel marker) {
    this.marker = marker;
    return this;
  }

  public CT_RadarSerBuilder setDPt(List<CT_DPtModel> dPt) {
    this.dPt = dPt;
    return this;
  }

  public CT_RadarSerBuilder setDLbls(CT_DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public CT_RadarSerBuilder setCat(CT_AxDataSourceModel cat) {
    this.cat = cat;
    return this;
  }

  public CT_RadarSerBuilder setVal(CT_NumDataSourceModel val) {
    this.val = val;
    return this;
  }

  public CT_RadarSerBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_RadarSerModel build() {
    return new CT_RadarSerModel(this.idx, this.order, this.tx, this.spPr, this.marker, this.dPt, this.dLbls, this.cat, this.val, this.extLst);
  }

  public CT_RadarSerBuilder from(CT_RadarSerModel value) {
    this.idx = value.getIdx();
    this.order = value.getOrder();
    this.tx = value.getTx();
    this.spPr = value.getSpPr();
    this.marker = value.getMarker();
    this.dPt = value.getDPt();
    this.dLbls = value.getDLbls();
    this.cat = value.getCat();
    this.val = value.getVal();
    this.extLst = value.getExtLst();
    return this;
  }
}
