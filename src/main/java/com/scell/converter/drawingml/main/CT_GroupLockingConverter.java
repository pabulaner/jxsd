package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.BooleanConverter;
import com.scell.model.drawingml.main.CT_GroupLockingModel;
import org.docx4j.dml.CTGroupLocking;

public class CT_GroupLockingConverter {
  private CT_GroupLockingConverter() {
  }

  public static CT_GroupLockingModel fromDocx4j(CTGroupLocking value) {
    if (value == null) return null;
    return new CT_GroupLockingModel(BooleanConverter.fromDocx4j(value.getNoResize()), BooleanConverter.fromDocx4j(value.getNoChangeAspect()), BooleanConverter.fromDocx4j(value.getNoSelect()), BooleanConverter.fromDocx4j(value.getNoUngrp()), BooleanConverter.fromDocx4j(value.getNoGrp()), BooleanConverter.fromDocx4j(value.getNoMove()), BooleanConverter.fromDocx4j(value.getNoRot()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTGroupLocking toDocx4j(CT_GroupLockingModel value) {
    return null;
  }
}
