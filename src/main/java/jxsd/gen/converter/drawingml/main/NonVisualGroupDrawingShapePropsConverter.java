package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.NonVisualGroupDrawingShapePropsModel;
import org.docx4j.dml.CTNonVisualGroupDrawingShapeProps;

/**
 * This is a generated sequence class.
 */
public class NonVisualGroupDrawingShapePropsConverter {
  private NonVisualGroupDrawingShapePropsConverter() {
  }

  public static NonVisualGroupDrawingShapePropsModel fromDocx4j(
      CTNonVisualGroupDrawingShapeProps value) {
    if (value == null) return null;
    return new NonVisualGroupDrawingShapePropsModel(GroupLockingConverter.fromDocx4j(value.getGrpSpLocks()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTNonVisualGroupDrawingShapeProps toDocx4j(
      NonVisualGroupDrawingShapePropsModel value) {
    if (value == null) return null;
    CTNonVisualGroupDrawingShapeProps result = new CTNonVisualGroupDrawingShapeProps();
    result.setGrpSpLocks(GroupLockingConverter.toDocx4j(value.getGrpSpLocks()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
