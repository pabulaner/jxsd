package jxsd.gen.builder.drawingml.chartDrawing;

import jxsd.gen.model.drawingml.chartDrawing.ConnectorNonVisualModel;
import jxsd.gen.model.drawingml.main.NonVisualConnectorPropertiesModel;
import jxsd.gen.model.drawingml.main.NonVisualDrawingPropsModel;

/**
 * This is a generated sequence class.
 */
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

  public ConnectorNonVisualBuilder from(ConnectorNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvCxnSpPr = value.getCNvCxnSpPr();
    return this;
  }

  public ConnectorNonVisualModel build() {
    return new ConnectorNonVisualModel(this.cNvPr, this.cNvCxnSpPr);
  }
}
