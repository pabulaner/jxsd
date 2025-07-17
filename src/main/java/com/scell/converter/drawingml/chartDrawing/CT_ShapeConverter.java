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

  public static CT_ShapeModel fromDocx4j(CTShape value) {
    if (value == null) return null;
    return new CT_ShapeModel(BooleanConverter.fromDocx4j(value.getFPublished()), StringConverter.fromDocx4j(value.getMacro()), BooleanConverter.fromDocx4j(value.getFLocksText()), StringConverter.fromDocx4j(value.getTextlink()), CT_ShapeNonVisualConverter.fromDocx4j(value.getNvSpPr()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_ShapeStyleConverter.fromDocx4j(value.getStyle()), CT_TextBodyConverter.fromDocx4j(value.getTxBody()));
  }

  public static CTShape toDocx4j(CT_ShapeModel value) {
    return null;
  }
}
