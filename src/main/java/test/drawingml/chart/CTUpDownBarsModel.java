package test.drawingml.chart;

public class CTUpDownBarsModel {
  private final CTGapAmountModel gapWidth;

  private final CTUpDownBarModel upBars;

  private final CTUpDownBarModel downBars;

  private final CTExtensionListModel extLst;

  public CTUpDownBarsModel(CTGapAmountModel gapWidth, CTUpDownBarModel upBars,
      CTUpDownBarModel downBars, CTExtensionListModel extLst) {
    this.gapWidth = gapWidth;
    this.upBars = upBars;
    this.downBars = downBars;
    this.extLst = extLst;
  }

  public CTGapAmountModel getGapWidth() {
    return this.gapWidth;
  }

  public CTUpDownBarModel getUpBars() {
    return this.upBars;
  }

  public CTUpDownBarModel getDownBars() {
    return this.downBars;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
