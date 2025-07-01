package test.drawingml.chart;

public class CTSurface3DChartModel {
  private final CTBooleanModel wireframe;

  private final CTSurfaceSerModel ser;

  private final CTBandFmtsModel bandFmts;

  private final CTUnsignedIntModel axId;

  private final CTExtensionListModel extLst;

  public CTSurface3DChartModel(CTBooleanModel wireframe, CTSurfaceSerModel ser,
      CTBandFmtsModel bandFmts, CTUnsignedIntModel axId, CTExtensionListModel extLst) {
    this.wireframe = wireframe;
    this.ser = ser;
    this.bandFmts = bandFmts;
    this.axId = axId;
    this.extLst = extLst;
  }

  public CTBooleanModel getWireframe() {
    return this.wireframe;
  }

  public CTSurfaceSerModel getSer() {
    return this.ser;
  }

  public CTBandFmtsModel getBandFmts() {
    return this.bandFmts;
  }

  public CTUnsignedIntModel getAxId() {
    return this.axId;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
