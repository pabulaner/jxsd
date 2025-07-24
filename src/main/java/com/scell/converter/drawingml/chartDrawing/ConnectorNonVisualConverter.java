package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.NonVisualConnectorPropertiesConverter;
import com.scell.converter.drawingml.main.NonVisualDrawingPropsConverter;
import com.scell.model.drawingml.chartDrawing.ConnectorNonVisualModel;
import org.docx4j.dml.chartDrawing.CTConnectorNonVisual;

public class ConnectorNonVisualConverter {
  private ConnectorNonVisualConverter() {
  }

  public static ConnectorNonVisualModel fromDocx4J(CTConnectorNonVisual value) {
    if (value == null) return null;
    return new ConnectorNonVisualModel(NonVisualDrawingPropsConverter.fromDocx4J(value.getCNvPr()), NonVisualConnectorPropertiesConverter.fromDocx4J(value.getCNvCxnSpPr()));
  }
}
