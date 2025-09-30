package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.ConnectorLockingModel;
import org.docx4j.dml.CTConnectorLocking;

/**
 * This is a generated sequence class.
 */
public class ConnectorLockingConverter {
  private ConnectorLockingConverter() {
  }

  public static ConnectorLockingModel fromDocx4j(CTConnectorLocking value) {
    if (value == null) return null;
    return new ConnectorLockingModel(BooleanValueConverter.fromDocx4j(value.isNoResize()), BooleanValueConverter.fromDocx4j(value.isNoChangeAspect()), BooleanValueConverter.fromDocx4j(value.isNoEditPoints()), BooleanValueConverter.fromDocx4j(value.isNoChangeArrowheads()), BooleanValueConverter.fromDocx4j(value.isNoSelect()), BooleanValueConverter.fromDocx4j(value.isNoGrp()), BooleanValueConverter.fromDocx4j(value.isNoMove()), BooleanValueConverter.fromDocx4j(value.isNoRot()), BooleanValueConverter.fromDocx4j(value.isNoChangeShapeType()), BooleanValueConverter.fromDocx4j(value.isNoAdjustHandles()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTConnectorLocking toDocx4j(ConnectorLockingModel value) {
    if (value == null) return null;
    CTConnectorLocking result = new CTConnectorLocking();
    result.setNoResize(BooleanValueConverter.toDocx4j(value.getNoResize()));
    result.setNoChangeAspect(BooleanValueConverter.toDocx4j(value.getNoChangeAspect()));
    result.setNoEditPoints(BooleanValueConverter.toDocx4j(value.getNoEditPoints()));
    result.setNoChangeArrowheads(BooleanValueConverter.toDocx4j(value.getNoChangeArrowheads()));
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
