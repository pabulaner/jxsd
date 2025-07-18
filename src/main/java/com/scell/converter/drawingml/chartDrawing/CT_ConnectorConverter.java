package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_ShapeStyleConverter;
import com.scell.model.drawingml.chartDrawing.CT_ConnectorModel;
import org.docx4j.dml.chartDrawing.CTConnector;

public class CT_ConnectorConverter {
  private CT_ConnectorConverter() {
  }

  public static CT_ConnectorModel fromDocx4J(CTConnector value) {
    if (value == null) return null;
    return new CT_ConnectorModel(BooleanConverter.fromDocx4J(value.getFPublished()), StringConverter.fromDocx4J(value.getMacro()), CT_ConnectorNonVisualConverter.fromDocx4J(value.getNvCxnSpPr()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_ShapeStyleConverter.fromDocx4J(value.getStyle()));
  }

  public static CTConnector toDocx4J(CT_ConnectorModel value) {
    return null;
  }
}
