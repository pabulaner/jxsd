package model.drawingml.chart;

import java.util.List;

public class CT_Surface3DChartModel {
  private final CT_BooleanModel wireframe;

  private final List<CT_SurfaceSerModel> ser;

  private final CT_BandFmtsModel bandFmts;

  private final List<CT_UnsignedIntModel> axId;

  private final CT_ExtensionListModel extLst;

  public CT_Surface3DChartModel(CT_BooleanModel wireframe, List<CT_SurfaceSerModel> ser,
      CT_BandFmtsModel bandFmts, List<CT_UnsignedIntModel> axId, CT_ExtensionListModel extLst) {
    this.wireframe = wireframe;
    this.ser = ser;
    this.bandFmts = bandFmts;
    this.axId = axId;
    this.extLst = extLst;
  }

  public CT_BooleanModel getWireframe() {
    return this.wireframe;
  }

  public List<CT_SurfaceSerModel> getSer() {
    return this.ser;
  }

  public CT_BandFmtsModel getBandFmts() {
    return this.bandFmts;
  }

  public List<CT_UnsignedIntModel> getAxId() {
    return this.axId;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
