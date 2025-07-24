package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.NonVisualDrawingShapePropsModel;
import org.docx4j.dml.CTNonVisualDrawingShapeProps;

public class NonVisualDrawingShapePropsConverter {
  private NonVisualDrawingShapePropsConverter() {
  }

  public static NonVisualDrawingShapePropsModel fromDocx4J(CTNonVisualDrawingShapeProps value) {
    if (value == null) return null;
    return new NonVisualDrawingShapePropsModel(BooleanConverter.fromDocx4J(value.isTxBox()), ShapeLockingConverter.fromDocx4J(value.getSpLocks()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
