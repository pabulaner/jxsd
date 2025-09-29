package jxsd.gen.converter.drawingml.main;

import jxsd.gen.converter.XMLSchema.BooleanValueConverter;
import jxsd.gen.model.drawingml.main.GroupLockingModel;
import org.docx4j.dml.CTGroupLocking;

/**
 * This is a generated sequence class.
 */
public class GroupLockingConverter {
  private GroupLockingConverter() {
  }

  public static GroupLockingModel fromDocx4j(CTGroupLocking value) {
    if (value == null) return null;
    return new GroupLockingModel(BooleanValueConverter.fromDocx4j(value.getNoResize()), BooleanValueConverter.fromDocx4j(value.getNoChangeAspect()), BooleanValueConverter.fromDocx4j(value.getNoSelect()), BooleanValueConverter.fromDocx4j(value.getNoUngrp()), BooleanValueConverter.fromDocx4j(value.getNoGrp()), BooleanValueConverter.fromDocx4j(value.getNoMove()), BooleanValueConverter.fromDocx4j(value.getNoRot()), OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTGroupLocking toDocx4j(GroupLockingModel value) {
    if (value == null) return null;
    CTGroupLocking result = new CTGroupLocking();
    result.setNoResize(BooleanValueConverter.toDocx4j(value.getNoResize()));
    result.setNoChangeAspect(BooleanValueConverter.toDocx4j(value.getNoChangeAspect()));
    result.setNoSelect(BooleanValueConverter.toDocx4j(value.getNoSelect()));
    result.setNoUngrp(BooleanValueConverter.toDocx4j(value.getNoUngrp()));
    result.setNoGrp(BooleanValueConverter.toDocx4j(value.getNoGrp()));
    result.setNoMove(BooleanValueConverter.toDocx4j(value.getNoMove()));
    result.setNoRot(BooleanValueConverter.toDocx4j(value.getNoRot()));
    result.setExtLst(OfficeArtExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
