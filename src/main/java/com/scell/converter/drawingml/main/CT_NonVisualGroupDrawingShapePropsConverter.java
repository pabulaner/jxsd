package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_NonVisualGroupDrawingShapePropsModel;
import org.docx4j.dml.CTNonVisualGroupDrawingShapeProps;

public class CT_NonVisualGroupDrawingShapePropsConverter {
  private CT_NonVisualGroupDrawingShapePropsConverter() {
  }

  public static CT_NonVisualGroupDrawingShapePropsModel fromDocx4j(
      CTNonVisualGroupDrawingShapeProps value) {
    if (value == null) return null;
    return new CT_NonVisualGroupDrawingShapePropsModel(CT_GroupLockingConverter.fromDocx4j(value.getGrpSpLocks()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTNonVisualGroupDrawingShapeProps toDocx4j(
      CT_NonVisualGroupDrawingShapePropsModel value) {
    return null;
  }
}
