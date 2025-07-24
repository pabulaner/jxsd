package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.ShapePropertiesModel;

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
