package model.drawingml.chartDrawing;

import model.drawingml.main.CT_NonVisualConnectorPropertiesModel;
import model.drawingml.main.CT_NonVisualDrawingPropsModel;

public class CT_ConnectorNonVisualModel {
  private final CT_NonVisualDrawingPropsModel cNvPr;

  private final CT_NonVisualConnectorPropertiesModel cNvCxnSpPr;

  public CT_ConnectorNonVisualModel(CT_NonVisualDrawingPropsModel cNvPr,
      CT_NonVisualConnectorPropertiesModel cNvCxnSpPr) {
    this.cNvPr = cNvPr;
    this.cNvCxnSpPr = cNvCxnSpPr;
  }

  public CT_NonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public CT_NonVisualConnectorPropertiesModel getCNvCxnSpPr() {
    return this.cNvCxnSpPr;
  }
}
