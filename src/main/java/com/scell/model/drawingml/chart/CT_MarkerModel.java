package com.scell.model.drawingml.chart;

import com.scell.model.drawingml.main.CT_ShapePropertiesModel;

public class CT_MarkerModel {
  private final CT_MarkerStyleModel symbol;

  private final CT_MarkerSizeModel size;

  private final CT_ShapePropertiesModel spPr;

  private final CT_ExtensionListModel extLst;

  public CT_MarkerModel(CT_MarkerStyleModel symbol, CT_MarkerSizeModel size,
      CT_ShapePropertiesModel spPr, CT_ExtensionListModel extLst) {
    this.symbol = symbol;
    this.size = size;
    this.spPr = spPr;
    this.extLst = extLst;
  }

  public CT_MarkerStyleModel getSymbol() {
    return this.symbol;
  }

  public CT_MarkerSizeModel getSize() {
    return this.size;
  }

  public CT_ShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CT_ExtensionListModel getExtLst() {
    return this.extLst;
  }
}
