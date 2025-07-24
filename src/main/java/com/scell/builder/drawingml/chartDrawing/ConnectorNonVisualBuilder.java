package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.ConnectorNonVisualModel;
import com.scell.model.drawingml.main.NonVisualConnectorPropertiesModel;
import com.scell.model.drawingml.main.NonVisualDrawingPropsModel;

public class ConnectorNonVisualBuilder {
  private NonVisualDrawingPropsModel cNvPr;

  private NonVisualConnectorPropertiesModel cNvCxnSpPr;

  public ConnectorNonVisualBuilder() {
  }

  public ConnectorNonVisualBuilder setCNvPr(NonVisualDrawingPropsModel cNvPr) {
    this.cNvPr = cNvPr;
    return this;
  }

  public ConnectorNonVisualBuilder setCNvCxnSpPr(NonVisualConnectorPropertiesModel cNvCxnSpPr) {
    this.cNvCxnSpPr = cNvCxnSpPr;
    return this;
  }

  public ConnectorNonVisualModel build() {
    return new ConnectorNonVisualModel(this.cNvPr, this.cNvCxnSpPr);
  }

  public ConnectorNonVisualBuilder from(ConnectorNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvCxnSpPr = value.getCNvCxnSpPr();
    return this;
  }
}
