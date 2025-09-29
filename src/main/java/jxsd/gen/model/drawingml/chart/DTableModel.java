package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.DTableBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class DTableModel {
  private final BooleanModel showHorzBorder;

  private final BooleanModel showVertBorder;

  private final BooleanModel showOutline;

  private final BooleanModel showKeys;

  private final ShapePropertiesModel spPr;

  private final TextBodyModel txPr;

  private final ExtensionListModel extLst;

  public DTableModel(BooleanModel showHorzBorder, BooleanModel showVertBorder,
      BooleanModel showOutline, BooleanModel showKeys, ShapePropertiesModel spPr,
      TextBodyModel txPr, ExtensionListModel extLst) {
    this.showHorzBorder = showHorzBorder;
    this.showVertBorder = showVertBorder;
    this.showOutline = showOutline;
    this.showKeys = showKeys;
    this.spPr = spPr;
    this.txPr = txPr;
    this.extLst = extLst;
  }

  public DTableBuilder builder() {
    return new DTableBuilder().from(this);
  }

  public BooleanModel getShowHorzBorder() {
    return this.showHorzBorder;
  }

  public BooleanModel getShowVertBorder() {
    return this.showVertBorder;
  }

  public BooleanModel getShowOutline() {
    return this.showOutline;
  }

  public BooleanModel getShowKeys() {
    return this.showKeys;
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
