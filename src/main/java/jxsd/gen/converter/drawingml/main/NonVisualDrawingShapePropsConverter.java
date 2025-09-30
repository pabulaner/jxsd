package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.NonVisualDrawingShapePropsModel;
import org.docx4j.dml.CTNonVisualDrawingShapeProps;

/**
 * This is a generated sequence class.
 */
public class NonVisualDrawingShapePropsConverter {
  private NonVisualDrawingShapePropsConverter() {
  }

  public static NonVisualDrawingShapePropsModel fromDocx4j(CTNonVisualDrawingShapeProps value) {
    if (value == null) return null;
    return new NonVisualDrawingShapePropsModel(BooleanValueConverter.fromDocx4j(value.isTxBox()), ShapeLockingConverter.fromDocx4j(value.getSpLocks()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTNonVisualDrawingShapeProps toDocx4j(NonVisualDrawingShapePropsModel value) {
    if (value == null) return null;
    CTNonVisualDrawingShapeProps result = new CTNonVisualDrawingShapeProps();
    result.setTxBox(BooleanValueConverter.toDocx4j(value.getTxBox()));
    result.setSpLocks(ShapeLockingConverter.toDocx4j(value.getSpLocks()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
