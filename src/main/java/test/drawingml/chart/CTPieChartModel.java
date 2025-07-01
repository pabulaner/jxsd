package test.drawingml.chart;

public class CTPieChartModel {
  private final CTBooleanModel varyColors;

  private final CTPieSerModel ser;

  private final CTDLblsModel dLbls;

  private final CTFirstSliceAngModel firstSliceAng;

  private final CTExtensionListModel extLst;

  public CTPieChartModel(CTBooleanModel varyColors, CTPieSerModel ser, CTDLblsModel dLbls,
      CTFirstSliceAngModel firstSliceAng, CTExtensionListModel extLst) {
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.firstSliceAng = firstSliceAng;
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

  public CTFirstSliceAngModel getFirstSliceAng() {
    return this.firstSliceAng;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
