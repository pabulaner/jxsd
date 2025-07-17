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

  public static CT_ConnectorModel fromDocx4j(CTConnector value) {
    if (value == null) return null;
    return new CT_ConnectorModel(BooleanConverter.fromDocx4j(value.getFPublished()), StringConverter.fromDocx4j(value.getMacro()), CT_ConnectorNonVisualConverter.fromDocx4j(value.getNvCxnSpPr()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_ShapeStyleConverter.fromDocx4j(value.getStyle()));
  }

  public static CTConnector toDocx4j(CT_ConnectorModel value) {
    return null;
  }
}
