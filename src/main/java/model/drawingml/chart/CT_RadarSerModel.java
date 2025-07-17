package model.drawingml.chart;

import java.util.List;
import model.drawingml.main.CT_ShapePropertiesModel;

public class CT_RadarSerModel {
  private final CT_UnsignedIntModel idx;

  private final CT_UnsignedIntModel order;

  private final CT_SerTxModel tx;

  private final CT_ShapePropertiesModel spPr;

  private final CT_MarkerModel marker;

  private final List<CT_DPtModel> dPt;

  private final CT_DLblsModel dLbls;

  private final CT_AxDataSourceModel cat;

  private final CT_NumDataSourceModel val;

  private final CT_ExtensionListModel extLst;

  public CT_RadarSerModel(CT_UnsignedIntModel idx, CT_UnsignedIntModel order, CT_SerTxModel tx,
      CT_ShapePropertiesModel spPr, CT_MarkerModel marker, List<CT_DPtModel> dPt,
      CT_DLblsModel dLbls, CT_AxDataSourceModel cat, CT_NumDataSourceModel val,
      CT_ExtensionListModel extLst) {
    this.idx = idx;
    this.order = order;
    this.tx = tx;
    this.spPr = spPr;
    this.marker = marker;
    this.dPt = dPt;
    this.dLbls = dLbls;
    this.cat = cat;
    this.val = val;
    this.extLst = extLst;
  }

  public CT_UnsignedIntModel getIdx() {
    return this.idx;
  }

  public CT_UnsignedIntModel getOrder() {
    return this.order;
  }

  public CT_SerTxModel getTx() {
    return this.tx;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CT_MarkerModel getMarker() {
    return this.marker;
  }

  public List<CT_DPtModel> getDPt() {
    return this.dPt;
  }

  public CT_DLblsModel getDLbls() {
    return this.dLbls;
  }

  public CT_AxDataSourceModel getCat() {
    return this.cat;
  }

  public CT_NumDataSourceModel getVal() {
    return this.val;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
