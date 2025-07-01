package test.drawingml.chart;

import test.drawingml.main.CTShapePropertiesModel;

public class CTMarkerModel {
  private final CTMarkerStyleModel symbol;

  private final CTMarkerSizeModel size;

  private final CTShapePropertiesModel spPr;

  private final CTExtensionListModel extLst;

  public CTMarkerModel(CTMarkerStyleModel symbol, CTMarkerSizeModel size,
      CTShapePropertiesModel spPr, CTExtensionListModel extLst) {
    this.symbol = symbol;
    this.size = size;
    this.spPr = spPr;
    this.extLst = extLst;
  }

  public CTMarkerStyleModel getSymbol() {
    return this.symbol;
  }

  public CTMarkerSizeModel getSize() {
    return this.size;
  }

  public CTShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
