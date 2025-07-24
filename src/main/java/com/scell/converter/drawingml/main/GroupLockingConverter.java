package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.GroupLockingModel;
import org.docx4j.dml.CTGroupLocking;

public class GroupLockingConverter {
  private GroupLockingConverter() {
  }

  public static GroupLockingModel fromDocx4J(CTGroupLocking value) {
    if (value == null) return null;
    return new GroupLockingModel(BooleanConverter.fromDocx4J(value.isNoResize()), BooleanConverter.fromDocx4J(value.isNoChangeAspect()), BooleanConverter.fromDocx4J(value.isNoSelect()), BooleanConverter.fromDocx4J(value.isNoUngrp()), BooleanConverter.fromDocx4J(value.isNoGrp()), BooleanConverter.fromDocx4J(value.isNoMove()), BooleanConverter.fromDocx4J(value.isNoRot()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
