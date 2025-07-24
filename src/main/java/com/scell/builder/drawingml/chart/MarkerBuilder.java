package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ExtensionListModel;
import com.scell.model.drawingml.chart.MarkerModel;
import com.scell.model.drawingml.chart.MarkerSizeModel;
import com.scell.model.drawingml.chart.MarkerStyleModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;

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

  public MarkerModel build() {
    return new MarkerModel(this.symbol, this.size, this.spPr, this.extLst);
  }

  public MarkerBuilder from(MarkerModel value) {
    this.symbol = value.getSymbol();
    this.size = value.getSize();
    this.spPr = value.getSpPr();
    this.extLst = value.getExtLst();
    return this;
  }
}
