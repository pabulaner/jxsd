package test.drawingml.chart;

public class CTRadarChartModel {
  private final CTRadarStyleModel radarStyle;

  private final CTBooleanModel varyColors;

  private final CTRadarSerModel ser;

  private final CTDLblsModel dLbls;

  private final CTUnsignedIntModel axId;

  private final CTExtensionListModel extLst;

  public CTRadarChartModel(CTRadarStyleModel radarStyle, CTBooleanModel varyColors,
      CTRadarSerModel ser, CTDLblsModel dLbls, CTUnsignedIntModel axId,
      CTExtensionListModel extLst) {
    this.radarStyle = radarStyle;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.axId = axId;
    this.extLst = extLst;
  }

  public CTRadarStyleModel getRadarStyle() {
    return this.radarStyle;
  }

  public CTBooleanModel getVaryColors() {
    return this.varyColors;
  }

  public CTRadarSerModel getSer() {
    return this.ser;
  }

  public CTDLblsModel getDLbls() {
    return this.dLbls;
  }

  public CTUnsignedIntModel getAxId() {
    return this.axId;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
