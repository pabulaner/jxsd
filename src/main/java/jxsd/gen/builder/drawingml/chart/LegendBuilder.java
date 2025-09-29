package jxsd.gen.builder.drawingml.chart;

import java.util.List;
import jxsd.gen.model.drawingml.chart.BooleanModel;
import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.LayoutModel;
import jxsd.gen.model.drawingml.chart.LegendEntryModel;
import jxsd.gen.model.drawingml.chart.LegendModel;
import jxsd.gen.model.drawingml.chart.LegendPosModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
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

  public LegendModel build() {
    return new LegendModel(this.legendPos, this.legendEntry, this.layout, this.overlay, this.spPr, this.txPr, this.extLst);
  }
}
