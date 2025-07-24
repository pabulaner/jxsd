package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.LayoutModel;
import com.scell.model.drawingml.chart.LegendEntryModel;
import com.scell.model.drawingml.chart.LegendModel;
import com.scell.model.drawingml.chart.LegendPosModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.TextBodyModel;
import java.util.List;

public class LegendBuilder {
  private LegendPosModel legendPos;

  private List<LegendEntryModel> legendEntry;

  private LayoutModel layout;

  private BooleanModel overlay;

  private ShapePropertiesModel spPr;

  private TextBodyModel txPr;

  private ExtensionListModel extLst;

  public LegendBuilder() {
  }

  public LegendBuilder setLegendPos(LegendPosModel legendPos) {
    this.legendPos = legendPos;
    return this;
  }

  public LegendBuilder setLegendEntry(List<LegendEntryModel> legendEntry) {
    this.legendEntry = legendEntry;
    return this;
  }

  public LegendBuilder setLayout(LayoutModel layout) {
    this.layout = layout;
    return this;
  }

  public LegendBuilder setOverlay(BooleanModel overlay) {
    this.overlay = overlay;
    return this;
  }

  public LegendBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public LegendBuilder setTxPr(TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public LegendBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public LegendModel build() {
    return new LegendModel(this.legendPos, this.legendEntry, this.layout, this.overlay, this.spPr, this.txPr, this.extLst);
  }

  public LegendBuilder from(LegendModel value) {
    this.legendPos = value.getLegendPos();
    this.legendEntry = value.getLegendEntry();
    this.layout = value.getLayout();
    this.overlay = value.getOverlay();
    this.spPr = value.getSpPr();
    this.txPr = value.getTxPr();
    this.extLst = value.getExtLst();
    return this;
  }
}
