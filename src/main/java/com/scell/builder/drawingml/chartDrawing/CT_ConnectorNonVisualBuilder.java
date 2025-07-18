package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_ConnectorNonVisualModel;
import com.scell.model.drawingml.main.CT_NonVisualConnectorPropertiesModel;
import com.scell.model.drawingml.main.CT_NonVisualDrawingPropsModel;

public class CT_ConnectorNonVisualBuilder {
  private CT_NonVisualDrawingPropsModel cNvPr;

  private CT_NonVisualConnectorPropertiesModel cNvCxnSpPr;

  public CT_ConnectorNonVisualBuilder() {
  }

  public CT_ConnectorNonVisualBuilder setCNvPr(CT_NonVisualDrawingPropsModel cNvPr) {
    this.cNvPr = cNvPr;
    return this;
  }

  public CT_ConnectorNonVisualBuilder setCNvCxnSpPr(
      CT_NonVisualConnectorPropertiesModel cNvCxnSpPr) {
    this.cNvCxnSpPr = cNvCxnSpPr;
    return this;
  }

  public CT_ConnectorNonVisualModel build() {
    return new CT_ConnectorNonVisualModel(this.cNvPr, this.cNvCxnSpPr);
  }

  public CT_ConnectorNonVisualBuilder from(CT_ConnectorNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvCxnSpPr = value.getCNvCxnSpPr();
    return this;
  }
}
