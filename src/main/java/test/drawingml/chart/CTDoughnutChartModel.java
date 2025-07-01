package test.drawingml.chart;

public class CTDoughnutChartModel {
  private final CTBooleanModel varyColors;

  private final CTPieSerModel ser;

  private final CTDLblsModel dLbls;

  private final CTFirstSliceAngModel firstSliceAng;

  private final CTHoleSizeModel holeSize;

  private final CTExtensionListModel extLst;

  public CTDoughnutChartModel(CTBooleanModel varyColors, CTPieSerModel ser, CTDLblsModel dLbls,
      CTFirstSliceAngModel firstSliceAng, CTHoleSizeModel holeSize, CTExtensionListModel extLst) {
    this.varyColors = varyColors;
    this.ser = ser;
    this.dLbls = dLbls;
    this.firstSliceAng = firstSliceAng;
    this.holeSize = holeSize;
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

  public CTHoleSizeModel getHoleSize() {
    return this.holeSize;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
