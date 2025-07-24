package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.NonVisualGroupDrawingShapePropsModel;
import org.docx4j.dml.CTNonVisualGroupDrawingShapeProps;

public class NonVisualGroupDrawingShapePropsConverter {
  private NonVisualGroupDrawingShapePropsConverter() {
  }

  public static NonVisualGroupDrawingShapePropsModel fromDocx4J(
      CTNonVisualGroupDrawingShapeProps value) {
    if (value == null) return null;
    return new NonVisualGroupDrawingShapePropsModel(GroupLockingConverter.fromDocx4J(value.getGrpSpLocks()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
