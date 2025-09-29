package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.MarkerBuilder;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class MarkerModel {
  private final MarkerStyleModel symbol;

  private final MarkerSizeModel size;

  private final ShapePropertiesModel spPr;

  private final ExtensionListModel extLst;

  public MarkerModel(MarkerStyleModel symbol, MarkerSizeModel size, ShapePropertiesModel spPr,
      ExtensionListModel extLst) {
    this.symbol = symbol;
    this.size = size;
    this.spPr = spPr;
    this.extLst = extLst;
  }

  public MarkerBuilder builder() {
    return new MarkerBuilder().from(this);
  }

  public MarkerStyleModel getSymbol() {
    return this.symbol;
  }

  public MarkerSizeModel getSize() {
    return this.size;
  }

  public ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
