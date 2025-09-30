package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.GraphicalObjectFrameLockingModel;
import org.docx4j.dml.CTGraphicalObjectFrameLocking;

/**
 * This is a generated sequence class.
 */
public class GraphicalObjectFrameLockingConverter {
  private GraphicalObjectFrameLockingConverter() {
  }

  public static GraphicalObjectFrameLockingModel fromDocx4j(CTGraphicalObjectFrameLocking value) {
    if (value == null) return null;
    return new GraphicalObjectFrameLockingModel(BooleanValueConverter.fromDocx4j(value.isNoDrilldown()), BooleanValueConverter.fromDocx4j(value.isNoResize()), BooleanValueConverter.fromDocx4j(value.isNoChangeAspect()), BooleanValueConverter.fromDocx4j(value.isNoSelect()), BooleanValueConverter.fromDocx4j(value.isNoGrp()), BooleanValueConverter.fromDocx4j(value.isNoMove()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTGraphicalObjectFrameLocking toDocx4j(GraphicalObjectFrameLockingModel value) {
    if (value == null) return null;
    CTGraphicalObjectFrameLocking result = new CTGraphicalObjectFrameLocking();
    result.setNoDrilldown(BooleanValueConverter.toDocx4j(value.getNoDrilldown()));
    result.setNoResize(BooleanValueConverter.toDocx4j(value.getNoResize()));
    result.setNoChangeAspect(BooleanValueConverter.toDocx4j(value.getNoChangeAspect()));
    result.setNoSelect(BooleanValueConverter.toDocx4j(value.getNoSelect()));
    result.setNoGrp(BooleanValueConverter.toDocx4j(value.getNoGrp()));
    result.setNoMove(BooleanValueConverter.toDocx4j(value.getNoMove()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
