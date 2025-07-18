package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.CT_NonVisualConnectorPropertiesConverter;
import com.scell.converter.drawingml.main.CT_NonVisualDrawingPropsConverter;
import com.scell.model.drawingml.chartDrawing.CT_ConnectorNonVisualModel;
import org.docx4j.dml.chartDrawing.CTConnectorNonVisual;

public class CT_ConnectorNonVisualConverter {
  private CT_ConnectorNonVisualConverter() {
  }

  public static CT_ConnectorNonVisualModel fromDocx4J(CTConnectorNonVisual value) {
    if (value == null) return null;
    return new CT_ConnectorNonVisualModel(CT_NonVisualDrawingPropsConverter.fromDocx4J(value.getCNvPr()), CT_NonVisualConnectorPropertiesConverter.fromDocx4J(value.getCNvCxnSpPr()));
  }

  public static CTConnectorNonVisual toDocx4J(CT_ConnectorNonVisualModel value) {
    return null;
  }
}
