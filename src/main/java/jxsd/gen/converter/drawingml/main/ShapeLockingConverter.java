package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.ShapeLockingModel;
import org.docx4j.dml.CTShapeLocking;

/**
 * This is a generated sequence class.
 */
public class ShapeLockingConverter {
  private ShapeLockingConverter() {
  }

  public static ShapeLockingModel fromDocx4j(CTShapeLocking value) {
    if (value == null) return null;
    return new ShapeLockingModel(BooleanValueConverter.fromDocx4j(value.getNoResize()), BooleanValueConverter.fromDocx4j(value.getNoChangeAspect()), BooleanValueConverter.fromDocx4j(value.getNoEditPoints()), BooleanValueConverter.fromDocx4j(value.getNoChangeArrowheads()), BooleanValueConverter.fromDocx4j(value.getNoTextEdit()), BooleanValueConverter.fromDocx4j(value.getNoSelect()), BooleanValueConverter.fromDocx4j(value.getNoGrp()), BooleanValueConverter.fromDocx4j(value.getNoMove()), BooleanValueConverter.fromDocx4j(value.getNoRot()), BooleanValueConverter.fromDocx4j(value.getNoChangeShapeType()), BooleanValueConverter.fromDocx4j(value.getNoAdjustHandles()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTShapeLocking toDocx4j(ShapeLockingModel value) {
    if (value == null) return null;
    CTShapeLocking result = new CTShapeLocking();
    result.setNoResize(BooleanValueConverter.toDocx4j(value.getNoResize()));
    result.setNoChangeAspect(BooleanValueConverter.toDocx4j(value.getNoChangeAspect()));
    result.setNoEditPoints(BooleanValueConverter.toDocx4j(value.getNoEditPoints()));
    result.setNoChangeArrowheads(BooleanValueConverter.toDocx4j(value.getNoChangeArrowheads()));
    result.setNoTextEdit(BooleanValueConverter.toDocx4j(value.getNoTextEdit()));
    result.setNoSelect(BooleanValueConverter.toDocx4j(value.getNoSelect()));
    result.setNoGrp(BooleanValueConverter.toDocx4j(value.getNoGrp()));
    result.setNoMove(BooleanValueConverter.toDocx4j(value.getNoMove()));
    result.setNoRot(BooleanValueConverter.toDocx4j(value.getNoRot()));
    result.setNoChangeShapeType(BooleanValueConverter.toDocx4j(value.getNoChangeShapeType()));
    result.setNoAdjustHandles(BooleanValueConverter.toDocx4j(value.getNoAdjustHandles()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
