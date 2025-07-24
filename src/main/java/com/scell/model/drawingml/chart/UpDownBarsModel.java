package com.scell.model.drawingml.chart;

public class UpDownBarsModel {
  private final GapAmountModel gapWidth;

  private final UpDownBarModel upBars;

  private final UpDownBarModel downBars;

  private final ExtensionListModel extLst;

  public UpDownBarsModel(GapAmountModel gapWidth, UpDownBarModel upBars, UpDownBarModel downBars,
      ExtensionListModel extLst) {
    this.gapWidth = gapWidth;
    this.upBars = upBars;
    this.downBars = downBars;
    this.extLst = extLst;
  }

  public GapAmountModel getGapWidth() {
    return this.gapWidth;
  }

  public UpDownBarModel getUpBars() {
    return this.upBars;
  }

  public UpDownBarModel getDownBars() {
    return this.downBars;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
