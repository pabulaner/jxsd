package jxsd.gen.model.drawingml.chartDrawing;

import jxsd.gen.builder.drawingml.chartDrawing.ConnectorNonVisualBuilder;
import jxsd.gen.model.drawingml.main.NonVisualConnectorPropertiesModel;
import jxsd.gen.model.drawingml.main.NonVisualDrawingPropsModel;

/**
 * This is a generated sequence class.
 */
public class ConnectorNonVisualModel {
  private final NonVisualDrawingPropsModel cNvPr;

  private final NonVisualConnectorPropertiesModel cNvCxnSpPr;

  public ConnectorNonVisualModel(NonVisualDrawingPropsModel cNvPr,
      NonVisualConnectorPropertiesModel cNvCxnSpPr) {
    this.cNvPr = cNvPr;
    this.cNvCxnSpPr = cNvCxnSpPr;
  }

  public ConnectorNonVisualBuilder builder() {
    return new ConnectorNonVisualBuilder().from(this);
  }

  public NonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public NonVisualConnectorPropertiesModel getCNvCxnSpPr() {
    return this.cNvCxnSpPr;
  }
}
