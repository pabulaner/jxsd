package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.converter.XMLSchema.StringValueConverter;
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
    return new ShapeModel(BooleanValueConverter.fromDocx4J(value.isFPublished()), StringValueConverter.fromDocx4J(value.getMacro()), BooleanValueConverter.fromDocx4J(value.isFLocksText()), StringValueConverter.fromDocx4J(value.getTextlink()), ShapeNonVisualConverter.fromDocx4J(value.getNvSpPr()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), ShapeStyleConverter.fromDocx4J(value.getStyle()), TextBodyConverter.fromDocx4J(value.getTxBody()));
  }
}
