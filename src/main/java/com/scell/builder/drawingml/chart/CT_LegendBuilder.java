package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BooleanModel;
import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_LayoutModel;
import com.scell.model.drawingml.chart.CT_LegendEntryModel;
import com.scell.model.drawingml.chart.CT_LegendModel;
import com.scell.model.drawingml.chart.CT_LegendPosModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;
import com.scell.model.drawingml.main.CT_TextBodyModel;
import java.util.List;

public class CT_LegendBuilder {
  private CT_LegendPosModel legendPos;

  private List<CT_LegendEntryModel> legendEntry;

  private CT_LayoutModel layout;

  private CT_BooleanModel overlay;

  private CT_ShapePropertiesModel spPr;

  private CT_TextBodyModel txPr;

  private CT_ExtensionListModel extLst;

  public CT_LegendBuilder() {
  }

  public CT_LegendBuilder setLegendPos(CT_LegendPosModel legendPos) {
    this.legendPos = legendPos;
    return this;
  }

  public CT_LegendBuilder setLegendEntry(List<CT_LegendEntryModel> legendEntry) {
    this.legendEntry = legendEntry;
    return this;
  }

  public CT_LegendBuilder setLayout(CT_LayoutModel layout) {
    this.layout = layout;
    return this;
  }

  public CT_LegendBuilder setOverlay(CT_BooleanModel overlay) {
    this.overlay = overlay;
    return this;
  }

  public CT_LegendBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_LegendBuilder setTxPr(CT_TextBodyModel txPr) {
    this.txPr = txPr;
    return this;
  }

  public CT_LegendBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_LegendModel build() {
    return new CT_LegendModel(this.legendPos, this.legendEntry, this.layout, this.overlay, this.spPr, this.txPr, this.extLst);
  }

  public CT_LegendBuilder from(CT_LegendModel value) {
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
