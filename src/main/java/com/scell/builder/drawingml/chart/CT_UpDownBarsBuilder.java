package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_GapAmountModel;
import com.scell.model.drawingml.chart.CT_UpDownBarModel;
import com.scell.model.drawingml.chart.CT_UpDownBarsModel;

public class CT_UpDownBarsBuilder {
  private CT_GapAmountModel gapWidth;

  private CT_UpDownBarModel upBars;

  private CT_UpDownBarModel downBars;

  private CT_ExtensionListModel extLst;

  public CT_UpDownBarsBuilder() {
  }

  public CT_UpDownBarsBuilder setGapWidth(CT_GapAmountModel gapWidth) {
    this.gapWidth = gapWidth;
    return this;
  }

  public CT_UpDownBarsBuilder setUpBars(CT_UpDownBarModel upBars) {
    this.upBars = upBars;
    return this;
  }

  public CT_UpDownBarsBuilder setDownBars(CT_UpDownBarModel downBars) {
    this.downBars = downBars;
    return this;
  }

  public CT_UpDownBarsBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_UpDownBarsModel build() {
    return new CT_UpDownBarsModel(this.gapWidth, this.upBars, this.downBars, this.extLst);
  }

  public CT_UpDownBarsBuilder from(CT_UpDownBarsModel value) {
    this.gapWidth = value.getGapWidth();
    this.upBars = value.getUpBars();
    this.downBars = value.getDownBars();
    this.extLst = value.getExtLst();
    return this;
  }
}
