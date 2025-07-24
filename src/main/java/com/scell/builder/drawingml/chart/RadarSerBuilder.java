package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.AxDataSourceModel;
import com.scell.model.drawingml.chart.DLblsModel;
import com.scell.model.drawingml.chart.DPtModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.MarkerModel;
import com.scell.model.drawingml.chart.NumDataSourceModel;
import com.scell.model.drawingml.chart.RadarSerModel;
import com.scell.model.drawingml.chart.SerTxModel;
import com.scell.model.drawingml.chart.UnsignedIntModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import java.util.List;

public class RadarSerBuilder {
  private UnsignedIntModel idx;

  private UnsignedIntModel order;

  private SerTxModel tx;

  private ShapePropertiesModel spPr;

  private MarkerModel marker;

  private List<DPtModel> dPt;

  private DLblsModel dLbls;

  private AxDataSourceModel cat;

  private NumDataSourceModel val;

  private ExtensionListModel extLst;

  public RadarSerBuilder() {
  }

  public RadarSerBuilder setIdx(UnsignedIntModel idx) {
    this.idx = idx;
    return this;
  }

  public RadarSerBuilder setOrder(UnsignedIntModel order) {
    this.order = order;
    return this;
  }

  public RadarSerBuilder setTx(SerTxModel tx) {
    this.tx = tx;
    return this;
  }

  public RadarSerBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public RadarSerBuilder setMarker(MarkerModel marker) {
    this.marker = marker;
    return this;
  }

  public RadarSerBuilder setDPt(List<DPtModel> dPt) {
    this.dPt = dPt;
    return this;
  }

  public RadarSerBuilder setDLbls(DLblsModel dLbls) {
    this.dLbls = dLbls;
    return this;
  }

  public RadarSerBuilder setCat(AxDataSourceModel cat) {
    this.cat = cat;
    return this;
  }

  public RadarSerBuilder setVal(NumDataSourceModel val) {
    this.val = val;
    return this;
  }

  public RadarSerBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public RadarSerModel build() {
    return new RadarSerModel(this.idx, this.order, this.tx, this.spPr, this.marker, this.dPt, this.dLbls, this.cat, this.val, this.extLst);
  }

  public RadarSerBuilder from(RadarSerModel value) {
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
