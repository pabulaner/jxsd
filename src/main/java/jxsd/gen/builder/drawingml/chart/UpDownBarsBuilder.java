package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.GapAmountModel;
import jxsd.gen.model.drawingml.chart.UpDownBarModel;
import jxsd.gen.model.drawingml.chart.UpDownBarsModel;

/**
 * This is a generated sequence class.
 */
public class UpDownBarsBuilder {
  private GapAmountModel gapWidth;

  private UpDownBarModel upBars;

  private UpDownBarModel downBars;

  private ExtensionListModel extLst;

  public UpDownBarsBuilder() {
  }

  public UpDownBarsBuilder setGapWidth(GapAmountModel gapWidth) {
    this.gapWidth = gapWidth;
    return this;
  }

  public UpDownBarsBuilder setUpBars(UpDownBarModel upBars) {
    this.upBars = upBars;
    return this;
  }

  public UpDownBarsBuilder setDownBars(UpDownBarModel downBars) {
    this.downBars = downBars;
    return this;
  }

  public UpDownBarsBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public UpDownBarsBuilder from(UpDownBarsModel value) {
    this.gapWidth = value.getGapWidth();
    this.upBars = value.getUpBars();
    this.downBars = value.getDownBars();
    this.extLst = value.getExtLst();
    return this;
  }

  public UpDownBarsModel build() {
    return new UpDownBarsModel(this.gapWidth, this.upBars, this.downBars, this.extLst);
  }
}
