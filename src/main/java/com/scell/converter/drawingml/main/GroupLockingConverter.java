package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanValueConverter;
import com.scell.model.drawingml.main.GroupLockingModel;
import org.docx4j.dml.CTGroupLocking;

public class GroupLockingConverter {
  private GroupLockingConverter() {
  }

  public static GroupLockingModel fromDocx4J(CTGroupLocking value) {
    if (value == null) return null;
    return new GroupLockingModel(BooleanValueConverter.fromDocx4J(value.isNoResize()), BooleanValueConverter.fromDocx4J(value.isNoChangeAspect()), BooleanValueConverter.fromDocx4J(value.isNoSelect()), BooleanValueConverter.fromDocx4J(value.isNoUngrp()), BooleanValueConverter.fromDocx4J(value.isNoGrp()), BooleanValueConverter.fromDocx4J(value.isNoMove()), BooleanValueConverter.fromDocx4J(value.isNoRot()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
