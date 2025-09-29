package jxsd.gen.model.drawingml.chart;

import java.util.List;
import jxsd.gen.builder.drawingml.chart.LegendBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class LegendModel {
  private final LegendPosModel legendPos;

  private final List<LegendEntryModel> legendEntry;

  private final LayoutModel layout;

  private final BooleanModel overlay;

  private final ShapePropertiesModel spPr;

  private final TextBodyModel txPr;

  private final ExtensionListModel extLst;

  public LegendModel(LegendPosModel legendPos, List<LegendEntryModel> legendEntry,
      LayoutModel layout, BooleanModel overlay, ShapePropertiesModel spPr, TextBodyModel txPr,
      ExtensionListModel extLst) {
    this.legendPos = legendPos;
    this.legendEntry = legendEntry;
    this.layout = layout;
    this.overlay = overlay;
    this.spPr = spPr;
    this.txPr = txPr;
    this.extLst = extLst;
  }

  public LegendBuilder builder() {
    return new LegendBuilder().from(this);
  }

  public LegendPosModel getLegendPos() {
    return this.legendPos;
  }

  public List<LegendEntryModel> getLegendEntry() {
    return this.legendEntry;
  }

  public LayoutModel getLayout() {
    return this.layout;
  }

  public BooleanModel getOverlay() {
    return this.overlay;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public TextBodyModel getTxPr() {
    return this.txPr;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
