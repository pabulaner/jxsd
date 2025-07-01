package test.drawingml.chart;

public class CTPie3DChartModel {
  private final CTBooleanModel varyColors;

  private final CTPieSerModel ser;

  private final CTDLblsModel dLbls;

  private final CTExtensionListModel extLst;

  public CTPie3DChartModel(CTBooleanModel varyColors, CTPieSerModel ser, CTDLblsModel dLbls,
      CTExtensionListModel extLst) {
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.extLst = extLst;
  }

  public CTBooleanModel getVaryColors() {
    return this.varyColors;
  }

  public CTPieSerModel getSer() {
    return this.ser;
  }

  public CTDLblsModel getDLbls() {
    return this.dLbls;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
