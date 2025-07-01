package test.drawingml.chartDrawing;

import test.drawingml.main.CTNonVisualConnectorPropertiesModel;
import test.drawingml.main.CTNonVisualDrawingPropsModel;

public class CTConnectorNonVisualModel {
  private final CTNonVisualDrawingPropsModel cNvPr;

  private final CTNonVisualConnectorPropertiesModel cNvCxnSpPr;

  public CTConnectorNonVisualModel(CTNonVisualDrawingPropsModel cNvPr,
      CTNonVisualConnectorPropertiesModel cNvCxnSpPr) {
    this.cNvPr = cNvPr;
    this.cNvCxnSpPr = cNvCxnSpPr;
  }

  public CTNonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public CTNonVisualConnectorPropertiesModel getCNvCxnSpPr() {
    return this.cNvCxnSpPr;
  }
}
