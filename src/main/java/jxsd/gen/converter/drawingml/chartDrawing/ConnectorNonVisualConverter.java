package jxsd.gen.converter.drawingml.chartDrawing;

import jxsd.gen.converter.drawingml.main.NonVisualConnectorPropertiesConverter;
import jxsd.gen.converter.drawingml.main.NonVisualDrawingPropsConverter;
import jxsd.gen.model.drawingml.chartDrawing.ConnectorNonVisualModel;
import org.docx4j.dml.chartDrawing.CTConnectorNonVisual;

/**
 * This is a generated sequence class.
 */
public class ConnectorNonVisualConverter {
  private ConnectorNonVisualConverter() {
  }

  public static ConnectorNonVisualModel fromDocx4j(CTConnectorNonVisual value) {
    if (value == null) return null;
    return new ConnectorNonVisualModel(NonVisualDrawingPropsConverter.fromDocx4j(value.getCNvPr()), NonVisualConnectorPropertiesConverter.fromDocx4j(value.getCNvCxnSpPr()));
  }

  public static CTConnectorNonVisual toDocx4j(ConnectorNonVisualModel value) {
    if (value == null) return null;
    CTConnectorNonVisual result = new CTConnectorNonVisual();
    result.setCNvPr(NonVisualDrawingPropsConverter.toDocx4j(value.getCNvPr()));
    result.setCNvCxnSpPr(NonVisualConnectorPropertiesConverter.toDocx4j(value.getCNvCxnSpPr()));
    return result;
  }
}
