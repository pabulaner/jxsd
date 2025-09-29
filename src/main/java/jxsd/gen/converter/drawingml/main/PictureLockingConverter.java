package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.PictureLockingModel;
import org.docx4j.dml.CTPictureLocking;

/**
 * This is a generated sequence class.
 */
public class PictureLockingConverter {
  private PictureLockingConverter() {
  }

  public static PictureLockingModel fromDocx4j(CTPictureLocking value) {
    if (value == null) return null;
    return new PictureLockingModel(BooleanValueConverter.fromDocx4j(value.getNoResize()), BooleanValueConverter.fromDocx4j(value.getNoChangeAspect()), BooleanValueConverter.fromDocx4j(value.getNoEditPoints()), BooleanValueConverter.fromDocx4j(value.getNoChangeArrowheads()), BooleanValueConverter.fromDocx4j(value.getNoCrop()), BooleanValueConverter.fromDocx4j(value.getNoSelect()), BooleanValueConverter.fromDocx4j(value.getNoGrp()), BooleanValueConverter.fromDocx4j(value.getNoMove()), BooleanValueConverter.fromDocx4j(value.getNoRot()), BooleanValueConverter.fromDocx4j(value.getNoChangeShapeType()), BooleanValueConverter.fromDocx4j(value.getNoAdjustHandles()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTPictureLocking toDocx4j(PictureLockingModel value) {
    if (value == null) return null;
    CTPictureLocking result = new CTPictureLocking();
    result.setNoResize(BooleanValueConverter.toDocx4j(value.getNoResize()));
    result.setNoChangeAspect(BooleanValueConverter.toDocx4j(value.getNoChangeAspect()));
    result.setNoEditPoints(BooleanValueConverter.toDocx4j(value.getNoEditPoints()));
    result.setNoChangeArrowheads(BooleanValueConverter.toDocx4j(value.getNoChangeArrowheads()));
    result.setNoCrop(BooleanValueConverter.toDocx4j(value.getNoCrop()));
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
