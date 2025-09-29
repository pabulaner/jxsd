package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.TitleBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class TitleModel {
  private final TxModel tx;

  private final LayoutModel layout;

  private final BooleanModel overlay;

  private final ShapePropertiesModel spPr;

  private final TextBodyModel txPr;

  private final ExtensionListModel extLst;

  public TitleModel(TxModel tx, LayoutModel layout, BooleanModel overlay, ShapePropertiesModel spPr,
      TextBodyModel txPr, ExtensionListModel extLst) {
    this.tx = tx;
    this.layout = layout;
    this.overlay = overlay;
    this.spPr = spPr;
    this.txPr = txPr;
    this.extLst = extLst;
  }

  public TitleBuilder builder() {
    return new TitleBuilder().from(this);
  }

  public TxModel getTx() {
    return this.tx;
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
