package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.ShapeStyleConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chartDrawing.ShapeModel;
import org.docx4j.dml.chartDrawing.CTShape;

public class ShapeConverter {
  private ShapeConverter() {
  }

  public static ShapeModel fromDocx4J(CTShape value) {
    if (value == null) return null;
    return new ShapeModel(BooleanConverter.fromDocx4J(value.isFPublished()), StringConverter.fromDocx4J(value.getMacro()), BooleanConverter.fromDocx4J(value.isFLocksText()), StringConverter.fromDocx4J(value.getTextlink()), ShapeNonVisualConverter.fromDocx4J(value.getNvSpPr()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), ShapeStyleConverter.fromDocx4J(value.getStyle()), TextBodyConverter.fromDocx4J(value.getTxBody()));
  }
}
