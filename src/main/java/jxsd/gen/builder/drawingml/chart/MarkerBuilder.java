package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ExtensionListModel;
import jxsd.gen.model.drawingml.chart.MarkerModel;
import jxsd.gen.model.drawingml.chart.MarkerSizeModel;
import jxsd.gen.model.drawingml.chart.MarkerStyleModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class MarkerBuilder {
  private MarkerStyleModel symbol;

  private MarkerSizeModel size;

  private ShapePropertiesModel spPr;

  private ExtensionListModel extLst;

  public MarkerBuilder() {
  }

  public MarkerBuilder setSymbol(MarkerStyleModel symbol) {
    this.symbol = symbol;
    return this;
  }

  public MarkerBuilder setSize(MarkerSizeModel size) {
    this.size = size;
    return this;
  }

  public MarkerBuilder setSpPr(ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public MarkerBuilder setExtLst(ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public MarkerBuilder from(MarkerModel value) {
    this.symbol = value.getSymbol();
    this.size = value.getSize();
    this.spPr = value.getSpPr();
    this.extLst = value.getExtLst();
    return this;
  }

  public MarkerModel build() {
    return new MarkerModel(this.symbol, this.size, this.spPr, this.extLst);
  }
}
