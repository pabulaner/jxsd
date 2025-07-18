package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_ShapeStyleConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chartDrawing.CT_ShapeModel;
import org.docx4j.dml.chartDrawing.CTShape;

public class CT_ShapeConverter {
  private CT_ShapeConverter() {
  }

  public static CT_ShapeModel fromDocx4J(CTShape value) {
    if (value == null) return null;
    return new CT_ShapeModel(BooleanConverter.fromDocx4J(value.getFPublished()), StringConverter.fromDocx4J(value.getMacro()), BooleanConverter.fromDocx4J(value.getFLocksText()), StringConverter.fromDocx4J(value.getTextlink()), CT_ShapeNonVisualConverter.fromDocx4J(value.getNvSpPr()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_ShapeStyleConverter.fromDocx4J(value.getStyle()), CT_TextBodyConverter.fromDocx4J(value.getTxBody()));
  }

  public static CTShape toDocx4J(CT_ShapeModel value) {
    return null;
  }
}
