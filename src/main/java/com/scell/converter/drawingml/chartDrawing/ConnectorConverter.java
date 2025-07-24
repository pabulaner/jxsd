package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.ShapeStyleConverter;
import com.scell.model.drawingml.chartDrawing.ConnectorModel;
import org.docx4j.dml.chartDrawing.CTConnector;

public class ConnectorConverter {
  private ConnectorConverter() {
  }

  public static ConnectorModel fromDocx4J(CTConnector value) {
    if (value == null) return null;
    return new ConnectorModel(BooleanConverter.fromDocx4J(value.isFPublished()), StringConverter.fromDocx4J(value.getMacro()), ConnectorNonVisualConverter.fromDocx4J(value.getNvCxnSpPr()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), ShapeStyleConverter.fromDocx4J(value.getStyle()));
  }
}
