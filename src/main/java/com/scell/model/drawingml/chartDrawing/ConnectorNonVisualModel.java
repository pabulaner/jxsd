package com.scell.model.drawingml.chartDrawing;

import com.scell.model.drawingml.main.NonVisualConnectorPropertiesModel;
import com.scell.model.drawingml.main.NonVisualDrawingPropsModel;

public class ConnectorNonVisualModel {
  private final NonVisualDrawingPropsModel cNvPr;

  private final NonVisualConnectorPropertiesModel cNvCxnSpPr;

  public ConnectorNonVisualModel(NonVisualDrawingPropsModel cNvPr,
      NonVisualConnectorPropertiesModel cNvCxnSpPr) {
    this.cNvPr = cNvPr;
    this.cNvCxnSpPr = cNvCxnSpPr;
  }

  public NonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public NonVisualConnectorPropertiesModel getCNvCxnSpPr() {
    return this.cNvCxnSpPr;
  }
}
