package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_NonVisualDrawingShapePropsModel;
import org.docx4j.dml.CTNonVisualDrawingShapeProps;

public class CT_NonVisualDrawingShapePropsConverter {
  private CT_NonVisualDrawingShapePropsConverter() {
  }

  public static CT_NonVisualDrawingShapePropsModel fromDocx4J(CTNonVisualDrawingShapeProps value) {
    if (value == null) return null;
    return new CT_NonVisualDrawingShapePropsModel(BooleanConverter.fromDocx4J(value.getTxBox()), CT_ShapeLockingConverter.fromDocx4J(value.getSpLocks()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTNonVisualDrawingShapeProps toDocx4J(CT_NonVisualDrawingShapePropsModel value) {
    return null;
  }
}
