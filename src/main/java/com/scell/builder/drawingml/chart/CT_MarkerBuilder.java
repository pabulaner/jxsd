package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ExtensionListModel;
import com.scell.model.drawingml.chart.CT_MarkerModel;
import com.scell.model.drawingml.chart.CT_MarkerSizeModel;
import com.scell.model.drawingml.chart.CT_MarkerStyleModel;
import com.scell.model.drawingml.main.CT_ShapePropertiesModel;

public class CT_MarkerBuilder {
  private CT_MarkerStyleModel symbol;

  private CT_MarkerSizeModel size;

  private CT_ShapePropertiesModel spPr;

  private CT_ExtensionListModel extLst;

  public CT_MarkerBuilder() {
  }

  public CT_MarkerBuilder setSymbol(CT_MarkerStyleModel symbol) {
    this.symbol = symbol;
    return this;
  }

  public CT_MarkerBuilder setSize(CT_MarkerSizeModel size) {
    this.size = size;
    return this;
  }

  public CT_MarkerBuilder setSpPr(CT_ShapePropertiesModel spPr) {
    this.spPr = spPr;
    return this;
  }

  public CT_MarkerBuilder setExtLst(CT_ExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public CT_MarkerModel build() {
    return new CT_MarkerModel(this.symbol, this.size, this.spPr, this.extLst);
  }

  public CT_MarkerBuilder from(CT_MarkerModel value) {
    this.symbol = value.getSymbol();
    this.size = value.getSize();
    this.spPr = value.getSpPr();
    this.extLst = value.getExtLst();
    return this;
  }
}
