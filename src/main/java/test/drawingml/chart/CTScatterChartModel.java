package test.drawingml.chart;

public class CTScatterChartModel {
  private final CTScatterStyleModel scatterStyle;

  private final CTBooleanModel varyColors;

  private final CTScatterSerModel ser;

  private final CTDLblsModel dLbls;

  private final CTUnsignedIntModel axId;

  private final CTExtensionListModel extLst;

  public CTScatterChartModel(CTScatterStyleModel scatterStyle, CTBooleanModel varyColors,
      CTScatterSerModel ser, CTDLblsModel dLbls, CTUnsignedIntModel axId,
      CTExtensionListModel extLst) {
    this.scatterStyle = scatterStyle;
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.axId = axId;
    this.extLst = extLst;
  }

  public CTScatterStyleModel getScatterStyle() {
    return this.scatterStyle;
  }

  public CTBooleanModel getVaryColors() {
    return this.varyColors;
  }

  public CTScatterSerModel getSer() {
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
